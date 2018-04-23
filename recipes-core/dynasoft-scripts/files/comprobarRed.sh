#!/bin/sh

if ping -q -c 1 -W 1 google.com >/dev/null; then
	echo "up"
else
	echo "down"
fi
