#!/bin/sh

iw dev wlan0 scan | egrep 'WPA|WPS|RSN|SSID' > /usr/bin/redesDisponibles.txt
echo "Fin del archivo" >> /usr/bin/redesDisponibles.txt
