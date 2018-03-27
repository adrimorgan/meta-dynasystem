#!/bin/sh

ficheroSO="/etc/mender/artifact_info"
ficheroData="/data/version_info"
versionSO="$(awk -F '=version-' '/artifact_name/ {print $2}' "$ficheroSO")"

# primera ejecución, no existe versión
if [ ! -f "$ficheroData" ]; then
  echo "artifact_name=version-1" > "$ficheroData"
else
  # existe versión local, será comparada con la versión del SO
  versionData="$(awk -F '=version-' '/artifact_name/ {print $2}' "$ficheroData")"
fi

# versión del SO es mayor que la versión local, es decir, primera ejecución desde actualización
if [ -f "$ficheroData" ] && [ "$versionSO" -gt "$versionData" ]; then
  echo "Dynasystem ha sido actualizado de v"${versionData}" a v"${versionSO}". Reiniciando..."
  systemctl stop NetworkManager
  cp /data/wifi/* /etc/NetworkManager/system-connections/
  cp "$ficheroSO" "$ficheroData"
  systemctl start NetworkManager
  dhcpcd
else
  echo "El sistema no necesita ser actualizado."
fi
