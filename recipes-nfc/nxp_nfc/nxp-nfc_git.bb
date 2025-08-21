# Copyright (C) 2016 NXP Semiconductors

DESCRIPTION = "Linux NFC stack for NCI based NXP NFC Controllers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/include/linux_nfc_api.h;md5=0a45e480f6d1b3df6ca6994772ddfe28"

SRC_URI = " \
    git://github.com/NXPNFCLinux/linux_libnfc-nci.git;protocol=https;branch=NCI2.0_PN7160 \
    file://0001-bugfix-Fixes-for-porting-to-64b.patch \
    file://0002-Add-missing-cstdint-includes.patch \
    file://0003-ConfigPathProvider.cc-Update-config-pathes-to-etc.patch \
"
SRC_URI[sha256sum] = "280c3b98955d257976c02ffa5fc94d0e0fa3144349f407fcc36df46d89a93703"
SRCREV = "d5af4ef88244b9f962986b39eb4126a8c1c0aead"

inherit autotools pkgconfig lib_package

S = "${WORKDIR}/git"
