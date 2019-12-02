/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerSimpleConnectionTester {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerSimpleConnectionTester(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerSimpleConnectionTester obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerSimpleConnectionTester(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerSimpleConnectionTester(ArServerHandlerCommands handlerCommands, ArRobot robot) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleConnectionTester(ArServerHandlerCommands.getCPtr(handlerCommands), handlerCommands, ArRobot.getCPtr(robot), robot), true);
  }

  public void connectionTestStart() {
    ArNetworkingJavaJNI.ArServerSimpleConnectionTester_connectionTestStart(swigCPtr, this);
  }

  public void connectionTestStop() {
    ArNetworkingJavaJNI.ArServerSimpleConnectionTester_connectionTestStop(swigCPtr, this);
  }

}