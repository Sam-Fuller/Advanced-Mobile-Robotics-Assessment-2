/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRetFunctor_Int extends ArFunctor {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArRetFunctor_Int(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArRetFunctor_IntUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRetFunctor_Int obj) {
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
        AriaJavaJNI.delete_ArRetFunctor_Int(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AriaJavaJNI.ArRetFunctor_Int_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AriaJavaJNI.ArRetFunctor_Int_change_ownership(this, swigCPtr, true);
  }

  public void invoke() {
    if (getClass() == ArRetFunctor_Int.class) AriaJavaJNI.ArRetFunctor_Int_invoke(swigCPtr, this); else AriaJavaJNI.ArRetFunctor_Int_invokeSwigExplicitArRetFunctor_Int(swigCPtr, this);
  }

  public int invokeR() {
    return AriaJavaJNI.ArRetFunctor_Int_invokeR(swigCPtr, this);
  }

  public ArRetFunctor_Int() {
    this(AriaJavaJNI.new_ArRetFunctor_Int(), true);
    AriaJavaJNI.ArRetFunctor_Int_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
