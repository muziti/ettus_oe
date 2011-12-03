PR = "r0"
require recipes/u-boot/u-boot.inc

SRC_URI = "git://git.denx.de/u-boot.git;protocol=git"
SRC_URI_append_usrp-e1xx ="\
        file://0001-net-eth.c-Restore-previous-behavior-for-eth_getenv_e.patch \
        file://0002-OMAP3-overo-Set-default-mpurate-to-720-use-for-usrp-.patch \
        "

SRCREV = "7708d8b352e9e595f6f08afd3206af6495c7dc09"

S = "${WORKDIR}/git"

TARGET_LDFLAGS = ""

inherit base

do_compile () {
       oe_runmake ${UBOOT_MACHINE}
       oe_runmake all
}

