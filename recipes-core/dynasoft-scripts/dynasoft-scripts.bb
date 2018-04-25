inherit systemd

SRC_URI = "file://actualizar.sh \
	file://dynasoft-watcher.sh \
	file://dynasoft-watcher.service \
"
LICENSE = "CLOSED"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "dynasoft-watcher.service"

do_install() {
	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/actualizar.sh ${D}${bindir}

	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/dynasoft-watcher.sh ${D}${bindir}

	install -d ${D}${systemd_system_unitdir}
	install -m 0700 ${WORKDIR}/dynasoft-watcher.service ${D}${systemd_system_unitdir}
}

FILES_${PN} = "${bindir}"
