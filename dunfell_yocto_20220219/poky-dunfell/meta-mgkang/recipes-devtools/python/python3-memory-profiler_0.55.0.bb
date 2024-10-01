SUMMARY = "This is a python module for monitoring memory consumption of a \
process as well as line-by-line analysis of memory consumption for python programs"
HOMEPAGE = "https://github.com/conda-forge/memory_profiler-feedstock"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=cde4ca348bb7feea790673481be0d980"

SRC_URI[md5sum] = "53ecb3d4be95a36fc1da339dce26d57f"
SRC_URI[sha256sum] = "5fa47b274c929dd2cbcd9190afb62fec110701251d2ac2d301caaf545c81afc1"

PYPI_PACKAGE = "memory_profiler"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
    python3-psutil \
"

