/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArColor {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArColor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArColor obj) {
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
        AriaJavaJNI.delete_ArColor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArColor(short red, short green, short blue) {
    this(AriaJavaJNI.new_ArColor__SWIG_0(red, green, blue), true);
  }

  public ArColor() {
    this(AriaJavaJNI.new_ArColor__SWIG_1(), true);
  }

  public ArColor(int rgbValue) {
    this(AriaJavaJNI.new_ArColor__SWIG_2(rgbValue), true);
  }

  public short getRed() {
    return AriaJavaJNI.ArColor_getRed(swigCPtr, this);
  }

  public short getGreen() {
    return AriaJavaJNI.ArColor_getGreen(swigCPtr, this);
  }

  public short getBlue() {
    return AriaJavaJNI.ArColor_getBlue(swigCPtr, this);
  }

  public int colorToByte4() {
    return AriaJavaJNI.ArColor_colorToByte4(swigCPtr, this);
  }

}