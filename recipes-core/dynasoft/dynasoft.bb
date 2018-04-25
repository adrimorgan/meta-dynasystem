inherit qmake5

SRCREV = "${AUTOREV}"
SRC_URI = "git://git@github.com/adrianmorente/dynasoft.git;protocol=ssh"
LICENSE = "CLOSED"

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
}

FILES_${PN} = "${bindir}"
