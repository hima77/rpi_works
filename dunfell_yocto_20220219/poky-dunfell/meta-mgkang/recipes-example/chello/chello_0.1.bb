DESCRIPTION="This is my package helloworld by CMake"
LICENSE="CLOSED"
#LIC_FILES_CHKSUM="file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit cmake 

#EXTERNALSRC="/home/mgkang/work/chello/"
#EXTERNALSRC__BUILD="${EXTERNALSRC}"

FILESPATH =+ "/home/mgkang/work/:"

SRC_URI = "file://chello"

S = "${WORKDIR}/chello"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 chello ${D}${bindir}
}

FILES_${PN} = "${bindir}/*"

