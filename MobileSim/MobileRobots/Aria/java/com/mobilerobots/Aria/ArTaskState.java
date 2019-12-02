/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArTaskState {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArTaskState(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArTaskState obj) {
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
        AriaJavaJNI.delete_ArTaskState(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArTaskState() {
    this(AriaJavaJNI.new_ArTaskState(), true);
  }

  public final static class State {
    public final static State INIT = new State("INIT", AriaJavaJNI.ArTaskState_INIT_get());
    public final static State RESUME = new State("RESUME");
    public final static State ACTIVE = new State("ACTIVE");
    public final static State SUSPEND = new State("SUSPEND");
    public final static State SUCCESS = new State("SUCCESS");
    public final static State FAILURE = new State("FAILURE");
    public final static State USER_START = new State("USER_START", AriaJavaJNI.ArTaskState_USER_START_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static State swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + State.class + " with value " + swigValue);
    }

    private State(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private State(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private State(String swigName, State swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static State[] swigValues = { INIT, RESUME, ACTIVE, SUSPEND, SUCCESS, FAILURE, USER_START };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
