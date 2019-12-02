/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArBasePacket {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArBasePacket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArBasePacket obj) {
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
        AriaJavaJNI.delete_ArBasePacket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArBasePacket(int bufferSize, int headerLength, String buf, int footerLength) {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_0(bufferSize, headerLength, buf, footerLength), true);
  }

  public ArBasePacket(int bufferSize, int headerLength, String buf) {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_1(bufferSize, headerLength, buf), true);
  }

  public ArBasePacket(int bufferSize, int headerLength) {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_2(bufferSize, headerLength), true);
  }

  public ArBasePacket(int bufferSize) {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_3(bufferSize), true);
  }

  public ArBasePacket() {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_4(), true);
  }

  public ArBasePacket(ArBasePacket other) {
    this(AriaJavaJNI.new_ArBasePacket__SWIG_5(ArBasePacket.getCPtr(other), other), true);
  }

  public void empty() {
    AriaJavaJNI.ArBasePacket_empty(swigCPtr, this);
  }

  public void finalizePacket() {
    AriaJavaJNI.ArBasePacket_finalizePacket(swigCPtr, this);
  }

  public void log() {
    AriaJavaJNI.ArBasePacket_log(swigCPtr, this);
  }

  public void printHex() {
    AriaJavaJNI.ArBasePacket_printHex(swigCPtr, this);
  }

  public boolean isValid() {
    return AriaJavaJNI.ArBasePacket_isValid(swigCPtr, this);
  }

  public void resetValid() {
    AriaJavaJNI.ArBasePacket_resetValid(swigCPtr, this);
  }

  public void byteToBuf(char val) {
    AriaJavaJNI.ArBasePacket_byteToBuf(swigCPtr, this, val);
  }

  public void byte2ToBuf(short val) {
    AriaJavaJNI.ArBasePacket_byte2ToBuf(swigCPtr, this, val);
  }

  public void byte4ToBuf(int val) {
    AriaJavaJNI.ArBasePacket_byte4ToBuf(swigCPtr, this, val);
  }

  public void uByteToBuf(short val) {
    AriaJavaJNI.ArBasePacket_uByteToBuf(swigCPtr, this, val);
  }

  public void uByte2ToBuf(int val) {
    AriaJavaJNI.ArBasePacket_uByte2ToBuf(swigCPtr, this, val);
  }

  public void uByte4ToBuf(long val) {
    AriaJavaJNI.ArBasePacket_uByte4ToBuf(swigCPtr, this, val);
  }

  public void strToBuf(String str) {
    AriaJavaJNI.ArBasePacket_strToBuf(swigCPtr, this, str);
  }

  public void strNToBuf(String str, int length) {
    AriaJavaJNI.ArBasePacket_strNToBuf(swigCPtr, this, str, length);
  }

  public void strToBufPadded(String str, int length) {
    AriaJavaJNI.ArBasePacket_strToBufPadded(swigCPtr, this, str, length);
  }

  public void dataToBuf(String data, int length) {
    AriaJavaJNI.ArBasePacket_dataToBuf__SWIG_0(swigCPtr, this, data, length);
  }

  public void dataToBuf(SWIGTYPE_p_unsigned_char data, int length) {
    AriaJavaJNI.ArBasePacket_dataToBuf__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), length);
  }

  public char bufToByte() {
    return AriaJavaJNI.ArBasePacket_bufToByte(swigCPtr, this);
  }

  public short bufToByte2() {
    return AriaJavaJNI.ArBasePacket_bufToByte2(swigCPtr, this);
  }

  public int bufToByte4() {
    return AriaJavaJNI.ArBasePacket_bufToByte4(swigCPtr, this);
  }

  public short bufToUByte() {
    return AriaJavaJNI.ArBasePacket_bufToUByte(swigCPtr, this);
  }

  public int bufToUByte2() {
    return AriaJavaJNI.ArBasePacket_bufToUByte2(swigCPtr, this);
  }

  public long bufToUByte4() {
    return AriaJavaJNI.ArBasePacket_bufToUByte4(swigCPtr, this);
  }

  public void bufToStr(String buf, int len) {
    AriaJavaJNI.ArBasePacket_bufToStr(swigCPtr, this, buf, len);
  }

  public void bufToData(String data, int length) {
    AriaJavaJNI.ArBasePacket_bufToData__SWIG_0(swigCPtr, this, data, length);
  }

  public void bufToData(SWIGTYPE_p_unsigned_char data, int length) {
    AriaJavaJNI.ArBasePacket_bufToData__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), length);
  }

  public void resetRead() {
    AriaJavaJNI.ArBasePacket_resetRead(swigCPtr, this);
  }

  public int getLength() {
    return AriaJavaJNI.ArBasePacket_getLength(swigCPtr, this);
  }

  public int getDataLength() {
    return AriaJavaJNI.ArBasePacket_getDataLength(swigCPtr, this);
  }

  public int getReadLength() {
    return AriaJavaJNI.ArBasePacket_getReadLength(swigCPtr, this);
  }

  public int getDataReadLength() {
    return AriaJavaJNI.ArBasePacket_getDataReadLength(swigCPtr, this);
  }

  public int getHeaderLength() {
    return AriaJavaJNI.ArBasePacket_getHeaderLength(swigCPtr, this);
  }

  public int getFooterLength() {
    return AriaJavaJNI.ArBasePacket_getFooterLength(swigCPtr, this);
  }

  public int getMaxLength() {
    return AriaJavaJNI.ArBasePacket_getMaxLength(swigCPtr, this);
  }

  public String getBuf() {
    return AriaJavaJNI.ArBasePacket_getBuf(swigCPtr, this);
  }

  public void setBuf(String buf, int bufferSize) {
    AriaJavaJNI.ArBasePacket_setBuf(swigCPtr, this, buf, bufferSize);
  }

  public void setMaxLength(int bufferSize) {
    AriaJavaJNI.ArBasePacket_setMaxLength(swigCPtr, this, bufferSize);
  }

  public boolean setLength(int length) {
    return AriaJavaJNI.ArBasePacket_setLength(swigCPtr, this, length);
  }

  public void setReadLength(int readLength) {
    AriaJavaJNI.ArBasePacket_setReadLength(swigCPtr, this, readLength);
  }

  public boolean setHeaderLength(int length) {
    return AriaJavaJNI.ArBasePacket_setHeaderLength(swigCPtr, this, length);
  }

  public void duplicatePacket(ArBasePacket packet) {
    AriaJavaJNI.ArBasePacket_duplicatePacket(swigCPtr, this, ArBasePacket.getCPtr(packet), packet);
  }

}