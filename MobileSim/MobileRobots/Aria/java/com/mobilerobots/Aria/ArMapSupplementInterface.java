/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArMapSupplementInterface {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArMapSupplementInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapSupplementInterface obj) {
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
        AriaJavaJNI.delete_ArMapSupplementInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean hasOriginLatLongAlt() {
    return AriaJavaJNI.ArMapSupplementInterface_hasOriginLatLongAlt(swigCPtr, this);
  }

  public ArPose getOriginLatLong() {
    return new ArPose(AriaJavaJNI.ArMapSupplementInterface_getOriginLatLong(swigCPtr, this), true);
  }

  public double getOriginAltitude() {
    return AriaJavaJNI.ArMapSupplementInterface_getOriginAltitude(swigCPtr, this);
  }

  public void setOriginLatLongAlt(boolean hasOriginLatLong, ArPose originLatLong, double altitude, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapSupplementInterface_setOriginLatLongAlt__SWIG_0(swigCPtr, this, hasOriginLatLong, ArPose.getCPtr(originLatLong), originLatLong, altitude, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setOriginLatLongAlt(boolean hasOriginLatLong, ArPose originLatLong, double altitude) {
    AriaJavaJNI.ArMapSupplementInterface_setOriginLatLongAlt__SWIG_1(swigCPtr, this, hasOriginLatLong, ArPose.getCPtr(originLatLong), originLatLong, altitude);
  }

  public void writeSupplementToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapSupplementInterface_writeSupplementToFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

}
