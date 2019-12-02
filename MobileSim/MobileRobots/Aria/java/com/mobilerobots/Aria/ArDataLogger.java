/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArDataLogger {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArDataLogger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArDataLogger obj) {
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
        AriaJavaJNI.delete_ArDataLogger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArDataLogger(ArRobot robot, String fileName) {
    this(AriaJavaJNI.new_ArDataLogger__SWIG_0(ArRobot.getCPtr(robot), robot, fileName), true);
  }

  public ArDataLogger(ArRobot robot) {
    this(AriaJavaJNI.new_ArDataLogger__SWIG_1(ArRobot.getCPtr(robot), robot), true);
  }

  public void addToConfig(ArConfig config) {
    AriaJavaJNI.ArDataLogger_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public void addString(String name, int maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t functor) {
    AriaJavaJNI.ArDataLogger_addString(swigCPtr, this, name, maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t.getCPtr(functor));
  }

  public SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t getAddStringFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getAddStringFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t(cPtr, false);
  }

}
