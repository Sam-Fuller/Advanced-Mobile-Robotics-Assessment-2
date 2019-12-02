/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArMapInfo extends ArMapInfoInterface {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArMapInfo(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArMapInfoUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapInfo obj) {
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
        AriaJavaJNI.delete_ArMapInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArMapInfo(SWIGTYPE_p_p_char infoNameList, long infoNameCount, String keywordPrefix) {
    this(AriaJavaJNI.new_ArMapInfo__SWIG_0(SWIGTYPE_p_p_char.getCPtr(infoNameList), infoNameCount, keywordPrefix), true);
  }

  public ArMapInfo(SWIGTYPE_p_p_char infoNameList, long infoNameCount) {
    this(AriaJavaJNI.new_ArMapInfo__SWIG_1(SWIGTYPE_p_p_char.getCPtr(infoNameList), infoNameCount), true);
  }

  public ArMapInfo(SWIGTYPE_p_p_char infoNameList) {
    this(AriaJavaJNI.new_ArMapInfo__SWIG_2(SWIGTYPE_p_p_char.getCPtr(infoNameList)), true);
  }

  public ArMapInfo() {
    this(AriaJavaJNI.new_ArMapInfo__SWIG_3(), true);
  }

  public ArMapInfo(ArMapInfo other) {
    this(AriaJavaJNI.new_ArMapInfo__SWIG_4(ArMapInfo.getCPtr(other), other), true);
  }

  public ArArgumentBuilderPtrList getInfo(String infoName) {
    long cPtr = AriaJavaJNI.ArMapInfo_getInfo__SWIG_0(swigCPtr, this, infoName);
    return (cPtr == 0) ? null : new ArArgumentBuilderPtrList(cPtr, false);
  }

  public ArArgumentBuilderPtrList getInfo(int infoType) {
    long cPtr = AriaJavaJNI.ArMapInfo_getInfo__SWIG_1(swigCPtr, this, infoType);
    return (cPtr == 0) ? null : new ArArgumentBuilderPtrList(cPtr, false);
  }

  public ArArgumentBuilderPtrList getMapInfo() {
    long cPtr = AriaJavaJNI.ArMapInfo_getMapInfo(swigCPtr, this);
    return (cPtr == 0) ? null : new ArArgumentBuilderPtrList(cPtr, false);
  }

  public int getInfoCount() {
    return AriaJavaJNI.ArMapInfo_getInfoCount(swigCPtr, this);
  }

  public SWIGTYPE_p_std__listT_std__string_t getInfoNames() {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArMapInfo_getInfoNames(swigCPtr, this), true);
  }

  public boolean setInfo(String infoName, ArArgumentBuilderPtrList infoList, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    return AriaJavaJNI.ArMapInfo_setInfo__SWIG_0(swigCPtr, this, infoName, ArArgumentBuilderPtrList.getCPtr(infoList), infoList, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public boolean setInfo(int infoType, ArArgumentBuilderPtrList infoList, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    return AriaJavaJNI.ArMapInfo_setInfo__SWIG_1(swigCPtr, this, infoType, ArArgumentBuilderPtrList.getCPtr(infoList), infoList, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public boolean setInfo(int infoType, ArArgumentBuilderPtrList infoList) {
    return AriaJavaJNI.ArMapInfo_setInfo__SWIG_2(swigCPtr, this, infoType, ArArgumentBuilderPtrList.getCPtr(infoList), infoList);
  }

  public boolean setMapInfo(ArArgumentBuilderPtrList mapInfo, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    return AriaJavaJNI.ArMapInfo_setMapInfo__SWIG_0(swigCPtr, this, ArArgumentBuilderPtrList.getCPtr(mapInfo), mapInfo, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public boolean setMapInfo(ArArgumentBuilderPtrList mapInfo) {
    return AriaJavaJNI.ArMapInfo_setMapInfo__SWIG_1(swigCPtr, this, ArArgumentBuilderPtrList.getCPtr(mapInfo), mapInfo);
  }

  public String getInfoName(int infoType) {
    return AriaJavaJNI.ArMapInfo_getInfoName(swigCPtr, this, infoType);
  }

  public void writeInfoToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapInfo_writeInfoToFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void clear() {
    AriaJavaJNI.ArMapInfo_clear(swigCPtr, this);
  }

  public boolean addToFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapInfo_addToFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean remFromFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapInfo_remFromFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public ArTime getTimeChanged() {
    return new ArTime(AriaJavaJNI.ArMapInfo_getTimeChanged(swigCPtr, this), true);
  }

}
