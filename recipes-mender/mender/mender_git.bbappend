FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI += "file://artifact-verify-key.pem"
SRC_URI += "file://0001-CONFIGS-not-starting-mender-until-network.patch"
