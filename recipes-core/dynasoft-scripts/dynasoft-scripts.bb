SRC_URI = "file://actualizar.sh \
	file://comprobarConexion.sh \
	file://mostrarRedes.sh \
	file://comprobarRedConocida.sh \
	file://olvidarRed.sh \
"
LICENSE = "CLOSED"

do_install() {
	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/actualizar.sh ${D}${bindir}

	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/comprobarConexion.sh ${D}${bindir}

	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/mostrarRedes.sh ${D}${bindir}

	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/comprobarRedConocida.sh ${D}${bindir}

	install -d ${D}${bindir}
	install -m 0700 ${WORKDIR}/olvidarRed.sh ${D}${bindir}
}

FILES_${PN} = "${bindir}"
