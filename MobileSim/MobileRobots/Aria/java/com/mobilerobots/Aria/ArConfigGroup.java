/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArConfigGroup {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArConfigGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArConfigGroup obj) {
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
        AriaJavaJNI.delete_ArConfigGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArConfigGroup(String baseDirectory) {
    this(AriaJavaJNI.new_ArConfigGroup__SWIG_0(baseDirectory), true);
  }

  public ArConfigGroup() {
    this(AriaJavaJNI.new_ArConfigGroup__SWIG_1(), true);
  }

  public void addConfig(ArConfig config) {
    AriaJavaJNI.ArConfigGroup_addConfig(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public void remConfig(ArConfig config) {
    AriaJavaJNI.ArConfigGroup_remConfig(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public boolean parseFile(String fileName, boolean continueOnError) {
    return AriaJavaJNI.ArConfigGroup_parseFile__SWIG_0(swigCPtr, this, fileName, continueOnError);
  }

  public boolean parseFile(String fileName) {
    return AriaJavaJNI.ArConfigGroup_parseFile__SWIG_1(swigCPtr, this, fileName);
  }

  public boolean reloadFile(boolean continueOnError) {
    return AriaJavaJNI.ArConfigGroup_reloadFile__SWIG_0(swigCPtr, this, continueOnError);
  }

  public boolean reloadFile() {
    return AriaJavaJNI.ArConfigGroup_reloadFile__SWIG_1(swigCPtr, this);
  }

  public boolean writeFile(String fileName) {
    return AriaJavaJNI.ArConfigGroup_writeFile(swigCPtr, this, fileName);
  }

  public void setBaseDirectory(String baseDirectory) {
    AriaJavaJNI.ArConfigGroup_setBaseDirectory(swigCPtr, this, baseDirectory);
  }

  public String getBaseDirectory() {
    return AriaJavaJNI.ArConfigGroup_getBaseDirectory(swigCPtr, this);
  }

}