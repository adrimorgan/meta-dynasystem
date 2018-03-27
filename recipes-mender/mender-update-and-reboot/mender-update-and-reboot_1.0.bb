inherit mender-state-scripts

SRC_URI = "file://ArtifactInstall_Enter_01_allow-reboot-after-installing-update"
SRC_URI += "file://Download_Leave_01_signal-to-ui"

LICENSE = "CLOSED"

do_install() {
  install -d ${MENDER_STATE_SCRIPTS_DIR}
  install -m 700 ${WORKDIR}/ArtifactInstall_Enter_01_allow-reboot-after-installing-update ${MENDER_STATE_SCRIPTS_DIR}/
  install -m 700 ${WORKDIR}/Download_Leave_01_signal-to-ui ${MENDER_STATE_SCRIPTS_DIR}/
}

FILES_${PN} += " ${MENDER_STATE_SCRIPTS_DIR}/ArtifactInstall_Enter_01_allow-reboot-after-installing-update"
FILES_${PN} += " ${MENDER_STATE_SCRIPTS_DIR}/Download_Leave_01_signal-to-ui"
