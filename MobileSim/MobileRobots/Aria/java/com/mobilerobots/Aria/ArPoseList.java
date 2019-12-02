/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArPoseList {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArPoseList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArPoseList obj) {
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
        AriaJavaJNI.delete_ArPoseList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArPoseList() {
    this(AriaJavaJNI.new_ArPoseList(), true);
  }

  public long size() {
    return AriaJavaJNI.ArPoseList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return AriaJavaJNI.ArPoseList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AriaJavaJNI.ArPoseList_clear(swigCPtr, this);
  }

  public void add(ArPose x) {
    AriaJavaJNI.ArPoseList_add(swigCPtr, this, ArPose.getCPtr(x), x);
  }

  public ArPose get(int i) {
    return new ArPose(AriaJavaJNI.ArPoseList_get(swigCPtr, this, i), false);
  }

}
