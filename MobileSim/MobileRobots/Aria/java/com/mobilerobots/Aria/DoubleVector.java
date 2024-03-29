/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class DoubleVector {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public DoubleVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(DoubleVector obj) {
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
        AriaJavaJNI.delete_DoubleVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector() {
    this(AriaJavaJNI.new_DoubleVector__SWIG_0(), true);
  }

  public DoubleVector(long n) {
    this(AriaJavaJNI.new_DoubleVector__SWIG_1(n), true);
  }

  public long size() {
    return AriaJavaJNI.DoubleVector_size(swigCPtr, this);
  }

  public long capacity() {
    return AriaJavaJNI.DoubleVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AriaJavaJNI.DoubleVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AriaJavaJNI.DoubleVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AriaJavaJNI.DoubleVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    AriaJavaJNI.DoubleVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return AriaJavaJNI.DoubleVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    AriaJavaJNI.DoubleVector_set(swigCPtr, this, i, val);
  }

}
