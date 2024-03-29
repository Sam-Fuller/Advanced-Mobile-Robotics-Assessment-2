/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArModePosition extends ArMode {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArModePosition(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArModePositionUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArModePosition obj) {
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
        AriaJavaJNI.delete_ArModePosition(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArModePosition(ArRobot robot, String name, char key, char key2, ArAnalogGyro gyro) {
    this(AriaJavaJNI.new_ArModePosition__SWIG_0(ArRobot.getCPtr(robot), robot, name, key, key2, ArAnalogGyro.getCPtr(gyro), gyro), true);
  }

  public ArModePosition(ArRobot robot, String name, char key, char key2) {
    this(AriaJavaJNI.new_ArModePosition__SWIG_1(ArRobot.getCPtr(robot), robot, name, key, key2), true);
  }

  public void activate() {
    AriaJavaJNI.ArModePosition_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArModePosition_deactivate(swigCPtr, this);
  }

  public void userTask() {
    AriaJavaJNI.ArModePosition_userTask(swigCPtr, this);
  }

  public void help() {
    AriaJavaJNI.ArModePosition_help(swigCPtr, this);
  }

  public void up() {
    AriaJavaJNI.ArModePosition_up(swigCPtr, this);
  }

  public void down() {
    AriaJavaJNI.ArModePosition_down(swigCPtr, this);
  }

  public void left() {
    AriaJavaJNI.ArModePosition_left(swigCPtr, this);
  }

  public void right() {
    AriaJavaJNI.ArModePosition_right(swigCPtr, this);
  }

  public void stop() {
    AriaJavaJNI.ArModePosition_stop(swigCPtr, this);
  }

  public void reset() {
    AriaJavaJNI.ArModePosition_reset(swigCPtr, this);
  }

  public void mode() {
    AriaJavaJNI.ArModePosition_mode(swigCPtr, this);
  }

  public void gyro() {
    AriaJavaJNI.ArModePosition_gyro(swigCPtr, this);
  }

  public void incDistance() {
    AriaJavaJNI.ArModePosition_incDistance(swigCPtr, this);
  }

  public void decDistance() {
    AriaJavaJNI.ArModePosition_decDistance(swigCPtr, this);
  }

}
