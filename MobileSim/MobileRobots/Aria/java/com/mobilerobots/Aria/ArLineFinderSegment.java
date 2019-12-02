/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLineFinderSegment extends ArLineSegment {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLineFinderSegment(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLineFinderSegmentUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLineFinderSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLineFinderSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArLineFinderSegment() {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_0(), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints, int startPoint, int endPoint) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_1(x1, y1, x2, y2, numPoints, startPoint, endPoint), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints, int startPoint) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_2(x1, y1, x2, y2, numPoints, startPoint), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_3(x1, y1, x2, y2, numPoints), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_4(x1, y1, x2, y2), true);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints, int startPoint, int endPoint) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_0(swigCPtr, this, x1, y1, x2, y2, numPoints, startPoint, endPoint);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints, int startPoint) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_1(swigCPtr, this, x1, y1, x2, y2, numPoints, startPoint);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_2(swigCPtr, this, x1, y1, x2, y2, numPoints);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_3(swigCPtr, this, x1, y1, x2, y2);
  }

  public double getLineAngle() {
    return AriaJavaJNI.ArLineFinderSegment_getLineAngle(swigCPtr, this);
  }

  public double getLength() {
    return AriaJavaJNI.ArLineFinderSegment_getLength(swigCPtr, this);
  }

  public int getNumPoints() {
    return AriaJavaJNI.ArLineFinderSegment_getNumPoints(swigCPtr, this);
  }

  public int getStartPoint() {
    return AriaJavaJNI.ArLineFinderSegment_getStartPoint(swigCPtr, this);
  }

  public int getEndPoint() {
    return AriaJavaJNI.ArLineFinderSegment_getEndPoint(swigCPtr, this);
  }

  public void setAveDistFromLine(double aveDistFromLine) {
    AriaJavaJNI.ArLineFinderSegment_setAveDistFromLine(swigCPtr, this, aveDistFromLine);
  }

  public double getAveDistFromLine() {
    return AriaJavaJNI.ArLineFinderSegment_getAveDistFromLine(swigCPtr, this);
  }

}