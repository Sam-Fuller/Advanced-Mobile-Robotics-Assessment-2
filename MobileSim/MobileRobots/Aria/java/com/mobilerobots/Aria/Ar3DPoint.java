/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class Ar3DPoint {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public Ar3DPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(Ar3DPoint obj) {
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
        AriaJavaJNI.delete_Ar3DPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ar3DPoint() {
    this(AriaJavaJNI.new_Ar3DPoint__SWIG_0(), true);
  }

  public Ar3DPoint(double x, double y, double z) {
    this(AriaJavaJNI.new_Ar3DPoint__SWIG_1(x, y, z), true);
  }

  public double dot(Ar3DPoint c) {
    return AriaJavaJNI.Ar3DPoint_dot(swigCPtr, this, Ar3DPoint.getCPtr(c), c);
  }

  public Ar3DPoint cross(Ar3DPoint c) {
    return new Ar3DPoint(AriaJavaJNI.Ar3DPoint_cross(swigCPtr, this, Ar3DPoint.getCPtr(c), c), true);
  }

  public void print(String head) {
    AriaJavaJNI.Ar3DPoint_print__SWIG_0(swigCPtr, this, head);
  }

  public void print() {
    AriaJavaJNI.Ar3DPoint_print__SWIG_1(swigCPtr, this);
  }

  public double getX() {
    return AriaJavaJNI.Ar3DPoint_getX(swigCPtr, this);
  }

  public double getY() {
    return AriaJavaJNI.Ar3DPoint_getY(swigCPtr, this);
  }

  public double getZ() {
    return AriaJavaJNI.Ar3DPoint_getZ(swigCPtr, this);
  }

}