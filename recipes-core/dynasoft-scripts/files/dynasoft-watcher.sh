#!/bin/sh

# lanza la app
/usr/bin/dynasoft -platform eglfs &

# espera a que finalicen todos los procesos precedentes
wait

# al cerrarse la app, muestra la imagen de psplash-dynasystem durante 3 segundos
psplash &
sleep 3

# reiniciamos/apagamos la máquina para no entrar en la terminal
reboot
