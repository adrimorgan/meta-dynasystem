# inspirado en https://github.com/ostroproject/ostro-os/blob/master/meta-ostro/classes/ostro-image.bbclass#L465

IMAGE_FEATURES[validitems] += " autologin"

# Enable local auto-login of the root user (local = serial port and
# virtual console by default, can be configured).
LOCAL_GETTY ?= " \
    ${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@.service \
    ${IMAGE_ROOTFS}${systemd_system_unitdir}/getty@.service \
"
local_autologin () {
    sed -i -e 's/^\(ExecStart *=.*getty \)/\1--autologin root /' ${LOCAL_GETTY}
}
ROOTFS_POSTPROCESS_COMMAND += "${@bb.utils.contains('IMAGE_FEATURES', 'autologin', 'local_autologin;', '', d)}"
