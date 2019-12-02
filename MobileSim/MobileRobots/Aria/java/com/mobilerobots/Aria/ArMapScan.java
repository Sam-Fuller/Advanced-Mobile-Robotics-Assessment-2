/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArMapScan extends ArMapScanInterface {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArMapScan(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArMapScanUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapScan obj) {
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
        AriaJavaJNI.delete_ArMapScan(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArMapScan(String scanType) {
    this(AriaJavaJNI.new_ArMapScan__SWIG_0(scanType), true);
  }

  public ArMapScan() {
    this(AriaJavaJNI.new_ArMapScan__SWIG_1(), true);
  }

  public ArMapScan(ArMapScan other) {
    this(AriaJavaJNI.new_ArMapScan__SWIG_2(ArMapScan.getCPtr(other), other), true);
  }

  public String getDisplayString(String scanType) {
    return AriaJavaJNI.ArMapScan_getDisplayString__SWIG_0(swigCPtr, this, scanType);
  }

  public String getDisplayString() {
    return AriaJavaJNI.ArMapScan_getDisplayString__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_ArPose_t getPoints(String scanType) {
    long cPtr = AriaJavaJNI.ArMapScan_getPoints__SWIG_0(swigCPtr, this, scanType);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_ArPose_t(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_ArPose_t getPoints() {
    long cPtr = AriaJavaJNI.ArMapScan_getPoints__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_ArPose_t(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_ArLineSegment_t getLines(String scanType) {
    long cPtr = AriaJavaJNI.ArMapScan_getLines__SWIG_0(swigCPtr, this, scanType);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_ArLineSegment_t(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_ArLineSegment_t getLines() {
    long cPtr = AriaJavaJNI.ArMapScan_getLines__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_ArLineSegment_t(cPtr, false);
  }

  public ArPose getMinPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScan_getMinPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getMinPose() {
    return new ArPose(AriaJavaJNI.ArMapScan_getMinPose__SWIG_1(swigCPtr, this), true);
  }

  public ArPose getMaxPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScan_getMaxPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getMaxPose() {
    return new ArPose(AriaJavaJNI.ArMapScan_getMaxPose__SWIG_1(swigCPtr, this), true);
  }

  public int getNumPoints(String scanType) {
    return AriaJavaJNI.ArMapScan_getNumPoints__SWIG_0(swigCPtr, this, scanType);
  }

  public int getNumPoints() {
    return AriaJavaJNI.ArMapScan_getNumPoints__SWIG_1(swigCPtr, this);
  }

  public boolean isSortedPoints(String scanType) {
    return AriaJavaJNI.ArMapScan_isSortedPoints__SWIG_0(swigCPtr, this, scanType);
  }

  public boolean isSortedPoints() {
    return AriaJavaJNI.ArMapScan_isSortedPoints__SWIG_1(swigCPtr, this);
  }

  public void setPoints(SWIGTYPE_p_std__vectorT_ArPose_t points, String scanType, boolean isSortedPoints, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScan_setPoints__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArPose_t.getCPtr(points), scanType, isSortedPoints, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setPoints(SWIGTYPE_p_std__vectorT_ArPose_t points, String scanType, boolean isSortedPoints) {
    AriaJavaJNI.ArMapScan_setPoints__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArPose_t.getCPtr(points), scanType, isSortedPoints);
  }

  public void setPoints(SWIGTYPE_p_std__vectorT_ArPose_t points, String scanType) {
    AriaJavaJNI.ArMapScan_setPoints__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArPose_t.getCPtr(points), scanType);
  }

  public void setPoints(SWIGTYPE_p_std__vectorT_ArPose_t points) {
    AriaJavaJNI.ArMapScan_setPoints__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArPose_t.getCPtr(points));
  }

  public ArPose getLineMinPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScan_getLineMinPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getLineMinPose() {
    return new ArPose(AriaJavaJNI.ArMapScan_getLineMinPose__SWIG_1(swigCPtr, this), true);
  }

  public ArPose getLineMaxPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScan_getLineMaxPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getLineMaxPose() {
    return new ArPose(AriaJavaJNI.ArMapScan_getLineMaxPose__SWIG_1(swigCPtr, this), true);
  }

  public int getNumLines(String scanType) {
    return AriaJavaJNI.ArMapScan_getNumLines__SWIG_0(swigCPtr, this, scanType);
  }

  public int getNumLines() {
    return AriaJavaJNI.ArMapScan_getNumLines__SWIG_1(swigCPtr, this);
  }

  public boolean isSortedLines(String scanType) {
    return AriaJavaJNI.ArMapScan_isSortedLines__SWIG_0(swigCPtr, this, scanType);
  }

  public boolean isSortedLines() {
    return AriaJavaJNI.ArMapScan_isSortedLines__SWIG_1(swigCPtr, this);
  }

  public void setLines(SWIGTYPE_p_std__vectorT_ArLineSegment_t lines, String scanType, boolean isSortedLines, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScan_setLines__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArLineSegment_t.getCPtr(lines), scanType, isSortedLines, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setLines(SWIGTYPE_p_std__vectorT_ArLineSegment_t lines, String scanType, boolean isSortedLines) {
    AriaJavaJNI.ArMapScan_setLines__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArLineSegment_t.getCPtr(lines), scanType, isSortedLines);
  }

  public void setLines(SWIGTYPE_p_std__vectorT_ArLineSegment_t lines, String scanType) {
    AriaJavaJNI.ArMapScan_setLines__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArLineSegment_t.getCPtr(lines), scanType);
  }

  public void setLines(SWIGTYPE_p_std__vectorT_ArLineSegment_t lines) {
    AriaJavaJNI.ArMapScan_setLines__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__vectorT_ArLineSegment_t.getCPtr(lines));
  }

  public int getResolution(String scanType) {
    return AriaJavaJNI.ArMapScan_getResolution__SWIG_0(swigCPtr, this, scanType);
  }

  public int getResolution() {
    return AriaJavaJNI.ArMapScan_getResolution__SWIG_1(swigCPtr, this);
  }

  public void setResolution(int resolution, String scanType, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScan_setResolution__SWIG_0(swigCPtr, this, resolution, scanType, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setResolution(int resolution, String scanType) {
    AriaJavaJNI.ArMapScan_setResolution__SWIG_1(swigCPtr, this, resolution, scanType);
  }

  public void setResolution(int resolution) {
    AriaJavaJNI.ArMapScan_setResolution__SWIG_2(swigCPtr, this, resolution);
  }

  public void writeScanToFunctor(ArFunctor1_CString functor, String endOfLineChars, String scanType) {
    AriaJavaJNI.ArMapScan_writeScanToFunctor__SWIG_0(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, scanType);
  }

  public void writeScanToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapScan_writeScanToFunctor__SWIG_1(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor, String scanType, ArFunctor1_CString keywordFunctor) {
    AriaJavaJNI.ArMapScan_writePointsToFunctor__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor), scanType, ArFunctor1_CString.getCPtr(keywordFunctor), keywordFunctor);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor, String scanType) {
    AriaJavaJNI.ArMapScan_writePointsToFunctor__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor), scanType);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor) {
    AriaJavaJNI.ArMapScan_writePointsToFunctor__SWIG_2(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor));
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor, String scanType, ArFunctor1_CString keywordFunctor) {
    AriaJavaJNI.ArMapScan_writeLinesToFunctor__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor), scanType, ArFunctor1_CString.getCPtr(keywordFunctor), keywordFunctor);
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor, String scanType) {
    AriaJavaJNI.ArMapScan_writeLinesToFunctor__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor), scanType);
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor) {
    AriaJavaJNI.ArMapScan_writeLinesToFunctor__SWIG_2(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor));
  }

  public boolean addToFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapScan_addToFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean remFromFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapScan_remFromFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean readDataPoint(String line) {
    return AriaJavaJNI.ArMapScan_readDataPoint(swigCPtr, this, line);
  }

  public boolean readLineSegment(String line) {
    return AriaJavaJNI.ArMapScan_readLineSegment(swigCPtr, this, line);
  }

  public void loadDataPoint(double x, double y) {
    AriaJavaJNI.ArMapScan_loadDataPoint(swigCPtr, this, x, y);
  }

  public void loadLineSegment(double x1, double y1, double x2, double y2) {
    AriaJavaJNI.ArMapScan_loadLineSegment(swigCPtr, this, x1, y1, x2, y2);
  }

  public void clear() {
    AriaJavaJNI.ArMapScan_clear(swigCPtr, this);
  }

  public boolean unite(ArMapScan other, boolean isIncludeDataPointsAndLines) {
    return AriaJavaJNI.ArMapScan_unite__SWIG_0(swigCPtr, this, ArMapScan.getCPtr(other), other, isIncludeDataPointsAndLines);
  }

  public boolean unite(ArMapScan other) {
    return AriaJavaJNI.ArMapScan_unite__SWIG_1(swigCPtr, this, ArMapScan.getCPtr(other), other);
  }

  public ArTime getTimeChanged() {
    return new ArTime(AriaJavaJNI.ArMapScan_getTimeChanged(swigCPtr, this), true);
  }

  public String getScanType() {
    return AriaJavaJNI.ArMapScan_getScanType(swigCPtr, this);
  }

  public String getPointsKeyword() {
    return AriaJavaJNI.ArMapScan_getPointsKeyword(swigCPtr, this);
  }

  public String getLinesKeyword() {
    return AriaJavaJNI.ArMapScan_getLinesKeyword(swigCPtr, this);
  }

  public void writePointsToFunctor(ArFunctor1_CString functor, String endOfLineChars, String scanType) {
    AriaJavaJNI.ArMapScan_writePointsToFunctor__SWIG_3(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, scanType);
  }

  public void writePointsToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapScan_writePointsToFunctor__SWIG_4(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void writeLinesToFunctor(ArFunctor1_CString functor, String endOfLineChars, String scanType) {
    AriaJavaJNI.ArMapScan_writeLinesToFunctor__SWIG_3(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, scanType);
  }

  public void writeLinesToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapScan_writeLinesToFunctor__SWIG_4(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public boolean addExtraToFileParser(ArFileParser fileParser, boolean isAddLineHandler) {
    return AriaJavaJNI.ArMapScan_addExtraToFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser, isAddLineHandler);
  }

  public boolean remExtraFromFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapScan_remExtraFromFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

}
