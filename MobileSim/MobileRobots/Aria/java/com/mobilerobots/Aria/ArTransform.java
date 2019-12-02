/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArTransform {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArTransform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArTransform obj) {
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
        AriaJavaJNI.delete_ArTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArTransform() {
    this(AriaJavaJNI.new_ArTransform__SWIG_0(), true);
  }

  public ArTransform(ArPose pose) {
    this(AriaJavaJNI.new_ArTransform__SWIG_1(ArPose.getCPtr(pose), pose), true);
  }

  public ArTransform(ArPose pose1, ArPose pose2) {
    this(AriaJavaJNI.new_ArTransform__SWIG_2(ArPose.getCPtr(pose1), pose1, ArPose.getCPtr(pose2), pose2), true);
  }

  public ArPose doTransform(ArPose source) {
    return new ArPose(AriaJavaJNI.ArTransform_doTransform__SWIG_0(swigCPtr, this, ArPose.getCPtr(source), source), true);
  }

  public ArPoseWithTime doTransform(ArPoseWithTime source) {
    return new ArPoseWithTime(AriaJavaJNI.ArTransform_doTransform__SWIG_1(swigCPtr, this, ArPoseWithTime.getCPtr(source), source), true);
  }

  public ArPose doInvTransform(ArPose source) {
    return new ArPose(AriaJavaJNI.ArTransform_doInvTransform__SWIG_0(swigCPtr, this, ArPose.getCPtr(source), source), true);
  }

  public ArPoseWithTime doInvTransform(ArPoseWithTime source) {
    return new ArPoseWithTime(AriaJavaJNI.ArTransform_doInvTransform__SWIG_1(swigCPtr, this, ArPoseWithTime.getCPtr(source), source), true);
  }

  public void doTransform(ArPosePtrList poseList) {
    AriaJavaJNI.ArTransform_doTransform__SWIG_2(swigCPtr, this, ArPosePtrList.getCPtr(poseList), poseList);
  }

  public void doTransform(ArPoseWithTimePtrList poseList) {
    AriaJavaJNI.ArTransform_doTransform__SWIG_3(swigCPtr, this, ArPoseWithTimePtrList.getCPtr(poseList), poseList);
  }

  public void setTransform(ArPose pose) {
    AriaJavaJNI.ArTransform_setTransform__SWIG_0(swigCPtr, this, ArPose.getCPtr(pose), pose);
  }

  public void setTransform(ArPose pose1, ArPose pose2) {
    AriaJavaJNI.ArTransform_setTransform__SWIG_1(swigCPtr, this, ArPose.getCPtr(pose1), pose1, ArPose.getCPtr(pose2), pose2);
  }

  public double getTh() {
    return AriaJavaJNI.ArTransform_getTh(swigCPtr, this);
  }

}
