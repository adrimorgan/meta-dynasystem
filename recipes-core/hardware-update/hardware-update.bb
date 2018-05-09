SRC_URI += "file:///home/symotech/actualizacionControladora.hex"
LICENSE = "CLOSED"

do_install() {
	install -d ${D}/actualizacion
	install -m 0700 ${WORKDIR}/home/symotech/actualizacionControladora.hex ${D}/actualizacion
}

FILES_${PN} = "/actualizacion/actualizacionControladora.hex"
