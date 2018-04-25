SRC_URI += "file:///home/symotech/actualizacionControladora.hex"
LICENSE = "CLOSED"

do_install() {
	install -d ${D}/actualizacion/hex
	install -m 0700 ${WORKDIR}/actualizacionControladora.hex ${D}/actualizacion/hex
}

FILES_${PN} = "/actualizacion/hex/actualizacionControladora.hex"
