SRC_URI = "file://actualizar.sh \
	file://comprobarRed.sh \
"
LICENSE = "CLOSED"

do_install() {
	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/actualizar.sh ${D}${bindir}
	
	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/comprobarRed.sh ${D}${bindir}
}

FILES_${PN} = "${bindir}"
