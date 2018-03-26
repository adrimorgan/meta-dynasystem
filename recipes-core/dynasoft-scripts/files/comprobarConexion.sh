#!/bin/sh

# usamos iwconfig para comprobar que realmente estamos conectados a la red.
ifconfig wlan0 | sed -n '2s/[^:]*:\([^ ]*\).*/\1/p' > /usr/bin/resultadoComprobacionConexion.txt
