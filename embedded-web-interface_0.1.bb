SUMMARY = "An embedded web interface"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Source files location.
SRC_URI = "file://src/main.py \
"
S = "${WORKDIR}"

# inherit setuptools3

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/src/main.py ${D}${bindir}/embedded-web-interface
}

FILES:${PN} += "${bindir}/embedded-web-interface"