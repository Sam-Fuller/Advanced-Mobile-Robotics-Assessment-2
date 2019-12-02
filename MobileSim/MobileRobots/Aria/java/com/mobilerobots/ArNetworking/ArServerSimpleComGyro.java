/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerSimpleComGyro {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerSimpleComGyro(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerSimpleComGyro obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerSimpleComGyro(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerSimpleComGyro(ArServerHandlerCommands handlerCommands, ArRobot robot, ArAnalogGyro gyro) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleComGyro(ArServerHandlerCommands.getCPtr(handlerCommands), handlerCommands, ArRobot.getCPtr(robot), robot, ArAnalogGyro.getCPtr(gyro), gyro), true);
  }

  public void gyroEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComGyro_gyroEnable(swigCPtr, this);
  }

  public void gyroDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComGyro_gyroDisable(swigCPtr, this);
  }

}
