/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArAnalogGyro {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArAnalogGyro(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArAnalogGyro obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArAnalogGyro(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArAnalogGyro(ArRobot robot) {
    this(AriaJavaJNI.new_ArAnalogGyro(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean isActive() {
    return AriaJavaJNI.ArAnalogGyro_isActive(swigCPtr, this);
  }

  public void activate() {
    AriaJavaJNI.ArAnalogGyro_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArAnalogGyro_deactivate(swigCPtr, this);
  }

  public boolean hasGyroOnlyMode() {
    return AriaJavaJNI.ArAnalogGyro_hasGyroOnlyMode(swigCPtr, this);
  }

  public boolean isGyroOnlyActive() {
    return AriaJavaJNI.ArAnalogGyro_isGyroOnlyActive(swigCPtr, this);
  }

  public void activateGyroOnly() {
    AriaJavaJNI.ArAnalogGyro_activateGyroOnly(swigCPtr, this);
  }

  public boolean hasNoInternalData() {
    return AriaJavaJNI.ArAnalogGyro_hasNoInternalData(swigCPtr, this);
  }

  public boolean haveGottenData() {
    return AriaJavaJNI.ArAnalogGyro_haveGottenData(swigCPtr, this);
  }

  public double getHeading() {
    return AriaJavaJNI.ArAnalogGyro_getHeading(swigCPtr, this);
  }

  public int getTemperature() {
    return AriaJavaJNI.ArAnalogGyro_getTemperature(swigCPtr, this);
  }

  public void setFilterModel(double gyroSigma, double inertialVar, double rotVar, double transVar) {
    AriaJavaJNI.ArAnalogGyro_setFilterModel(swigCPtr, this, gyroSigma, inertialVar, rotVar, transVar);
  }

  public int getPacCount() {
    return AriaJavaJNI.ArAnalogGyro_getPacCount(swigCPtr, this);
  }

  public double getAverage() {
    return AriaJavaJNI.ArAnalogGyro_getAverage(swigCPtr, this);
  }

  public ArTime getAverageTaken() {
    return new ArTime(AriaJavaJNI.ArAnalogGyro_getAverageTaken(swigCPtr, this), true);
  }

  public double getScalingFactor() {
    return AriaJavaJNI.ArAnalogGyro_getScalingFactor(swigCPtr, this);
  }

  public void setScalingFactor(double factor) {
    AriaJavaJNI.ArAnalogGyro_setScalingFactor(swigCPtr, this, factor);
  }

  public boolean handleGyroPacket(ArRobotPacket packet) {
    return AriaJavaJNI.ArAnalogGyro_handleGyroPacket(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public double encoderCorrect(ArPoseWithTime deltaPose) {
    return AriaJavaJNI.ArAnalogGyro_encoderCorrect(swigCPtr, this, ArPoseWithTime.getCPtr(deltaPose), deltaPose);
  }

  public void stabilizingCallback() {
    AriaJavaJNI.ArAnalogGyro_stabilizingCallback(swigCPtr, this);
  }

  public void userTaskCallback() {
    AriaJavaJNI.ArAnalogGyro_userTaskCallback(swigCPtr, this);
  }

  public void setLogAnomalies(boolean logAnomalies) {
    AriaJavaJNI.ArAnalogGyro_setLogAnomalies(swigCPtr, this, logAnomalies);
  }

}
