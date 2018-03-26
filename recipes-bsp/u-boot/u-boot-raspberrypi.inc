FILESEXTRAPATHS_prepend_rpi := "${THISDIR}/patches:"
SRC_URI_append_rpi = " file://0001-CONFIGS-way-to-silent-uboot-console.patch \
											file://0002-CONFIGS-allowing-boot-with-usb-plugged-in.patch"
                                           
