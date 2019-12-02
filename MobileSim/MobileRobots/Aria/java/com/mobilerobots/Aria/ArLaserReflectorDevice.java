/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLaserReflectorDevice extends ArRangeDevice {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLaserReflectorDevice(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLaserReflectorDeviceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLaserReflectorDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLaserReflectorDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArLaserReflectorDevice(ArRangeDevice laser, ArRobot robot, String name) {
    this(AriaJavaJNI.new_ArLaserReflectorDevice__SWIG_0(ArRangeDevice.getCPtr(laser), laser, ArRobot.getCPtr(robot), robot, name), true);
  }

  public ArLaserReflectorDevice(ArRangeDevice laser, ArRobot robot) {
    this(AriaJavaJNI.new_ArLaserReflectorDevice__SWIG_1(ArRangeDevice.getCPtr(laser), laser, ArRobot.getCPtr(robot), robot), true);
  }

  public void processReadings() {
    AriaJavaJNI.ArLaserReflectorDevice_processReadings(swigCPtr, this);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArLaserReflectorDevice_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public void addToConfig(ArConfig config, String section) {
    AriaJavaJNI.ArLaserReflectorDevice_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

}