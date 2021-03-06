DESCRIPTION = "Image based on the GNOME desktop"

require e100-image.inc

inherit image

DISTRO_SSH_DAEMON = "openssh"

PR = "${INC_PR}.0"

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-video-sisusb \
           xf86-input-keyboard \
"

export IMAGE_BASENAME = "gnome-gnuradio-image"

#IMAGE_LINGUAS = "de-de fr-fr en-gb en-us pt-br es-es kn-in ml-in ta-in"
#ROOTFS_POSTPROCESS_COMMAND += 'install_linguas;'
IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_LOGIN_MANAGER = "shadow"
IMAGE_SPLASH = "psplash-angstrom"

IMAGE_INSTALL += " \
  task-base-extended \
  ${IMAGE_SPLASH} \
  angstrom-task-gnome \
  setxkbmap \
  task-gnome-apps \
  task-proper-tools \
  task-usrp-embedded \
  ${E100_QT} \
  ${E100_TI_DSP} \
  ${E100_UHD} \
  ${E100_GNURADIO} \
  ${E100_OPENBTS} \
  python-pyserial \
  python-setuptools \
"

