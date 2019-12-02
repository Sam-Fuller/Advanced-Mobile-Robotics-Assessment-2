/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArActionGoto extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionGoto(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionGotoUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionGoto obj) {
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
        AriaJavaJNI.delete_ArActionGoto(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionGoto(String name, ArPose goal, double closeDist, double speed, double speedToTurnAt, double turnAmount) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_0(name, ArPose.getCPtr(goal), goal, closeDist, speed, speedToTurnAt, turnAmount), true);
  }

  public ArActionGoto(String name, ArPose goal, double closeDist, double speed, double speedToTurnAt) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_1(name, ArPose.getCPtr(goal), goal, closeDist, speed, speedToTurnAt), true);
  }

  public ArActionGoto(String name, ArPose goal, double closeDist, double speed) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_2(name, ArPose.getCPtr(goal), goal, closeDist, speed), true);
  }

  public ArActionGoto(String name, ArPose goal, double closeDist) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_3(name, ArPose.getCPtr(goal), goal, closeDist), true);
  }

  public ArActionGoto(String name, ArPose goal) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_4(name, ArPose.getCPtr(goal), goal), true);
  }

  public ArActionGoto(String name) {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_5(name), true);
  }

  public ArActionGoto() {
    this(AriaJavaJNI.new_ArActionGoto__SWIG_6(), true);
  }

  public boolean haveAchievedGoal() {
    return AriaJavaJNI.ArActionGoto_haveAchievedGoal(swigCPtr, this);
  }

  public void cancelGoal() {
    AriaJavaJNI.ArActionGoto_cancelGoal(swigCPtr, this);
  }

  public void setGoal(ArPose goal) {
    AriaJavaJNI.ArActionGoto_setGoal(swigCPtr, this, ArPose.getCPtr(goal), goal);
  }

  public ArPose getGoal() {
    return new ArPose(AriaJavaJNI.ArActionGoto_getGoal(swigCPtr, this), true);
  }

  public void setCloseDist(double closeDist) {
    AriaJavaJNI.ArActionGoto_setCloseDist(swigCPtr, this, closeDist);
  }

  public double getCloseDist() {
    return AriaJavaJNI.ArActionGoto_getCloseDist(swigCPtr, this);
  }

  public void setSpeed(double speed) {
    AriaJavaJNI.ArActionGoto_setSpeed(swigCPtr, this, speed);
  }

  public double getSpeed() {
    return AriaJavaJNI.ArActionGoto_getSpeed(swigCPtr, this);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionGoto_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionGoto_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

}
