#!/bin/sh

ls -a /etc/NetworkManager/system-connections/ | grep $1 > /usr/bin/esConocida.txt
