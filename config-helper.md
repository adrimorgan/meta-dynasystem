## Configuración de la Raspberry Pi 3 Model B en /uboot/config.txt

```
# Para desactivar la pantalla arco iris de prueba por defecto
disable_splash=1

# Para desactivar los iconos de alerta en la esquina superior derecha
avoid_warnings=1

# Memoria RAM destinada a GPU
gpu_mem=512

# Habilitar audio a través de HDMI
dtparam=audio=on

# Modo HDMI normal (permitirá enviar sonido a través de HDMI, si existe)
hdmi_drive=2

# Desactivar márgenes superior e inferior en grandes resoluciones
disable_overscan=1
```
