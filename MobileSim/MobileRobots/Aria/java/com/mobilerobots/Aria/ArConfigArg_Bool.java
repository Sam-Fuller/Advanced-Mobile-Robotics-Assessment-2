/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArConfigArg_Bool extends ArConfigArg {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArConfigArg_Bool(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArConfigArg_BoolUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArConfigArg_Bool obj) {
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
        AriaJavaJNI.delete_ArConfigArg_Bool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArConfigArg_Bool(String name, boolean b, String desc) {
    this(AriaJavaJNI.new_ArConfigArg_Bool__SWIG_0(name, b, desc), true);
  }

  public ArConfigArg_Bool(String name, boolean b) {
    this(AriaJavaJNI.new_ArConfigArg_Bool__SWIG_1(name, b), true);
  }

}
