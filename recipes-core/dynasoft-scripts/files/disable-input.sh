#!/bin/sh

while [ 1 ]
do
  if [ `ls /dev/input/by-path/ | grep kbd | wc -l` == 1 ]
  then
    reboot
  fi
  sleep 1
done
