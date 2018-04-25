SUMMARY = "Core image for DynaSystem machine"
LICENSE = "GPLv3"

GLIBC_GENERATE_LOCALES = "es_ES.UTF-8 en_GB.UTF-8 en_US.UTF-8"
IMAGE_LINGUAS = " es-es"

CORE_PKGS = " \
  linux-firmware-bcm43430 \
  kernel-image \
  kernel-devicetree \
  kernel-modules \
  openssl \
"

NETWORKING = " \
  iw \
  wireless-tools \
  wpa-supplicant \
  dhcpcd \
  networkmanager \
"

INTERNATIONALIZATION = " \
  icu \
"

RPI_STUFF = " \
  nano \
  util-linux \
  curl \
  pulseaudio \
  alsa-utils \
  psplash \
  rpi-gpio \
"

FILESYSTEMS = " \
  dbus \
  udev \
  ntfs-3g \
  ntfsprogs \
  libntfs-3g \
  ntfs-3g-ntfsprogs \
  exfat-utils \
  dosfstools \
  libusb1 \
"

FONTS = " \
  fontconfig \
  fontconfig-utils \
  ttf-bitstream-vera \
  font-bitstream-100dpi \
"

QT5_PKGS = " \
  qtbase qtbase-plugins qtbase-tools \
  qtcharts qtcharts-qmlplugins \
  qtdeclarative qtdeclarative-qmlplugins \
  qt5-env \
  qtgraphicaleffects qtgraphicaleffects-qmlplugins \
  qtmultimedia qtmultimedia-plugins qtmultimedia-qmlplugins \
  qtquickcontrols qtquickcontrols-qmlplugins \
  qtquickcontrols2 qtquickcontrols2-qmldesigner qtquickcontrols2-qmlplugins \
  qtserialport qtserialport-mkspecs \
  qtvirtualkeyboard qtvirtualkeyboard-plugins qtvirtualkeyboard-qmlplugins \
  qtxmlpatterns \
"

OWN_PKGS = " \
  dynasoft \
  dynasoft-scripts \
  hardware-update \
  disable-keyboard-input \
  mender-update-and-reboot \
"

# Core files for basic boot, splash screen and Qt dependencies
IMAGE_FEATURES += "autologin ssh-server-dropbear"
IMAGE_INSTALL += " \
  packagegroup-core-boot \
  ${CORE_IMAGE_EXTRA_INSTALL} \
  ${CORE_PKGS} \
  ${NETWORKING} \
  ${INTERNATIONALIZATION} \
  ${RPI_STUFF} \
  ${FILESYSTEMS} \
  ${QT5_PKGS} \
  ${OWN_PKGS} \
"

inherit core-image dynasystem-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
