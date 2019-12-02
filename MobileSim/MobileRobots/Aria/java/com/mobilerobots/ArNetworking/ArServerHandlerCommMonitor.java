/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerHandlerCommMonitor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerHandlerCommMonitor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerHandlerCommMonitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerHandlerCommMonitor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerHandlerCommMonitor(ArServerBase server, int heartbeatInterval) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerCommMonitor__SWIG_0(ArServerBase.getCPtr(server), server, heartbeatInterval), true);
  }

  public ArServerHandlerCommMonitor(ArServerBase server) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerCommMonitor__SWIG_1(ArServerBase.getCPtr(server), server), true);
  }

  public void handleGetHeartbeatInterval(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCommMonitor_handleGetHeartbeatInterval(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void handleAckCommTcp(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCommMonitor_handleAckCommTcp(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void handleAckCommUdp(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCommMonitor_handleAckCommUdp(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void cycleCallback() {
    ArNetworkingJavaJNI.ArServerHandlerCommMonitor_cycleCallback(swigCPtr, this);
  }

  public final static int MIN_HEARTBEAT_INTERVAL = ArNetworkingJavaJNI.ArServerHandlerCommMonitor_MIN_HEARTBEAT_INTERVAL_get();
  public final static int DEFAULT_HEARTBEAT_INTERVAL = ArNetworkingJavaJNI.ArServerHandlerCommMonitor_DEFAULT_HEARTBEAT_INTERVAL_get();

}