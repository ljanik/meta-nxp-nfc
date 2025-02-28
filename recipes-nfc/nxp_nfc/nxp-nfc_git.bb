# Copyright (C) 2016 NXP Semiconductors

DESCRIPTION = "Linux NFC stack for NCI based NXP NFC Controllers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/include/linux_nfc_api.h;md5=79206fdb1d51ebc2e7b92b621a303cc6"

SRC_URI = " \
    git://github.com/NXPNFCLinux/linux_libnfc-nci.git;protocol=https;branch=master \
"
SRC_URI[sha256sum] = "280c3b98955d257976c02ffa5fc94d0e0fa3144349f407fcc36df46d89a93703"
SRCREV = "171a0d408812e3c882625f8f487bd521fd645e1e"

inherit autotools pkgconfig lib_package

S = "${WORKDIR}/git"
