/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerHandlerCameraCollection {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerHandlerCameraCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerHandlerCameraCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerHandlerCameraCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerHandlerCameraCollection(ArServerBase server, ArCameraCollection cameraCollection) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerCameraCollection(ArServerBase.getCPtr(server), server, ArCameraCollection.getCPtr(cameraCollection), cameraCollection), true);
  }

  public void getCameraList(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCameraCollection_getCameraList(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void setParams(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCameraCollection_setParams(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void handleCameraCollectionModified() {
    ArNetworkingJavaJNI.ArServerHandlerCameraCollection_handleCameraCollectionModified(swigCPtr, this);
  }

}
