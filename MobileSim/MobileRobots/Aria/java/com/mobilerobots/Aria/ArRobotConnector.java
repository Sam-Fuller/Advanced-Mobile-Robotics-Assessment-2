/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRobotConnector {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRobotConnector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRobotConnector obj) {
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
        AriaJavaJNI.delete_ArRobotConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArRobotConnector(ArArgumentParser parser, ArRobot robot, boolean autoParseArgs) {
    this(AriaJavaJNI.new_ArRobotConnector__SWIG_0(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, autoParseArgs), true);
  }

  public ArRobotConnector(ArArgumentParser parser, ArRobot robot) {
    this(AriaJavaJNI.new_ArRobotConnector__SWIG_1(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot), true);
  }

  public boolean setupRobot() {
    return AriaJavaJNI.ArRobotConnector_setupRobot__SWIG_0(swigCPtr, this);
  }

  public boolean setupRobot(ArRobot robot) {
    return AriaJavaJNI.ArRobotConnector_setupRobot__SWIG_1(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean connectRobot() {
    return AriaJavaJNI.ArRobotConnector_connectRobot__SWIG_0(swigCPtr, this);
  }

  public boolean connectRobot(ArRobot robot) {
    return AriaJavaJNI.ArRobotConnector_connectRobot__SWIG_1(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean parseArgs() {
    return AriaJavaJNI.ArRobotConnector_parseArgs__SWIG_0(swigCPtr, this);
  }

  public boolean parseArgs(ArArgumentParser parser) {
    return AriaJavaJNI.ArRobotConnector_parseArgs__SWIG_1(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser);
  }

  public void logOptions() {
    AriaJavaJNI.ArRobotConnector_logOptions(swigCPtr, this);
  }

  public String getRemoteHost() {
    return AriaJavaJNI.ArRobotConnector_getRemoteHost(swigCPtr, this);
  }

  public boolean getRemoteIsSim() {
    return AriaJavaJNI.ArRobotConnector_getRemoteIsSim(swigCPtr, this);
  }

  public ArRobot getRobot() {
    long cPtr = AriaJavaJNI.ArRobotConnector_getRobot(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

}
