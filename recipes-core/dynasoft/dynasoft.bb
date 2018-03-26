inherit systemd qmake5

SRCREV = "${AUTOREV}"
SRC_URI = "git://git@github.com/adrianmorente/dynasoft.git;protocol=ssh"
SRC_URI += " file://dynasoft.service"
LICENSE = "CLOSED"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "dynasoft.service"

DEPENDS += "libusb1 \
			qtbase \
			qtcharts \
			qtdeclarative \
			qtgraphicaleffects \
			qtmultimedia \
			qtquickcontrols \
			qtquickcontrols2 \
			qtserialport \
			qtvirtualkeyboard \
			"
			
RDEPENDS_${PN} += "qtbase-plugins \
			qtcharts-qmlplugins \
			qtdeclarative-qmlplugins \
			qtgraphicaleffects-qmlplugins \
			qtmultimedia-qmlplugins \
			qtquickcontrols-qmlplugins \
			qtquickcontrols2-qmlplugins \
			qtserialport \
			qtvirtualkeyboard-qmlplugins \
			"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${bindir}
	install -m 0700 dynasoft ${D}${bindir}
	
	install -d ${D}${systemd_system_unitdir}
	install -m 0700 ${WORKDIR}/dynasoft.service ${D}${systemd_system_unitdir}
}

FILES_${PN} = "${bindir}"
FILES_${PN} += "${systemd_system_unitdir}/dynasoft.service"
