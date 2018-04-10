inherit systemd
LICENSE = "CLOSED"

SRC_URI = "file://disable-keyboard-input.sh"
SRC_URI += " file://disable-keyboard-input.service"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "disable-keyboard-input.service"

do_install() {
  install -d ${D}${bindir}
  install -m 0700 ${WORKDIR}/disable-keyboard-input.sh ${D}${bindir}

  install -d ${D}${systemd_system_unitdir}
  install -m 0700 ${WORKDIR}/disable-keyboard-input.service ${D}${systemd_system_unitdir}
}

FILES_${PN} = "${bindir}"
FILES_${PN} += "${systemd_system_unitdir}/disable-keyboard-input.service"
