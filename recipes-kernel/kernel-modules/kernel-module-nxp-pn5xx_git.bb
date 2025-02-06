# Copyright (C) 2016 NXP Semiconductor
SUMMARY = "NXP NFC Kernel Module"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

inherit module

SRC_URI = " \
    git://github.com/NXPNFCLinux/nxp-pn5xx.git;protocol=https;branch=master \
    file://0001-Add-.gitignore.patch \
    file://0002-Makefile-cleanup-tagetting-a-Yocto-Project-recipe.patch \
    file://0003-pn5xx_i2c.c-Fix-replace-pr_warning-for-pr_warn.patch \
    file://0004-pn5xx_i2c.c-Replace-of_get_named_gpio_flags-for-of_g.patch \
    file://0005-pn5xx_i2c.c-Fix-types-of-probe-and-remove.patch \
"
SRCREV = "5cabbc58ff17f6023b4d0d217cdfb31b63f737c4"

S = "${WORKDIR}/git"
