FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI_append = " file://artifact-verify-key.pem"
SRC_URI_append = " file://mender.conf"
