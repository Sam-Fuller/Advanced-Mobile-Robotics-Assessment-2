# Microsoft Developer Studio Project File - Name="AriaDLL" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Dynamic-Link Library" 0x0102

CFG=AriaDLL - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "AriaDLL.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "AriaDLL.mak" CFG="AriaDLL - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "AriaDLL - Win32 Release" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "AriaDLL - Win32 Debug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
MTL=midl.exe
RSC=rc.exe

!IF  "$(CFG)" == "AriaDLL - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "../lib"
# PROP Intermediate_Dir "../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MT /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /YX /FD /c
# ADD CPP /nologo /MT /W3 /GR /GX /O2 /I "../include" /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /FD /c
# SUBTRACT CPP /YX
# ADD BASE MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "NDEBUG"
# ADD RSC /l 0x409 /d "NDEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /machine:I386
# ADD LINK32 wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /version:0.7 /dll /pdb:none /machine:I386 /out:"../bin/ARIA.DLL"

!ELSEIF  "$(CFG)" == "AriaDLL - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "AriaDLL___Win32_Debug"
# PROP BASE Intermediate_Dir "AriaDLL___Win32_Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "../lib"
# PROP Intermediate_Dir "../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W3 /GR /GX /Zi /Od /I "../include" /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /FR /FD /GZ /c
# SUBTRACT CPP /YX
# ADD BASE MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "_DEBUG"
# ADD RSC /l 0x409 /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /debug /machine:I386 /pdbtype:sept
# ADD LINK32 wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /version:0.7 /dll /pdb:none /debug /machine:I386 /out:"../bin/ARIA.DLL"

!ENDIF 

# Begin Target

# Name "AriaDLL - Win32 Release"
# Name "AriaDLL - Win32 Debug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Source File

SOURCE=.\ArAction.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionAvoidFront.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionAvoidSide.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionBumpers.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionColorFollow.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionConstantVelocity.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionDesired.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionGoto.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionGroup.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionGroups.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionInput.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionIRs.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionJoydrive.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionKeydrive.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionLimiterBackwards.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionLimiterForwards.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionLimiterTableSensor.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionStallRecover.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionStop.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionTriangleDriveTo.cpp
# End Source File
# Begin Source File

SOURCE=.\ArActionTurn.cpp
# End Source File
# Begin Source File

SOURCE=.\ArACTS.cpp
# End Source File
# Begin Source File

SOURCE=.\ArAMPTU.cpp
# End Source File
# Begin Source File

SOURCE=.\ArAnalogGyro.cpp
# End Source File
# Begin Source File

SOURCE=.\ArArg.cpp
# End Source File
# Begin Source File

SOURCE=.\ArArgumentBuilder.cpp
# End Source File
# Begin Source File

SOURCE=.\ArArgumentParser.cpp
# End Source File
# Begin Source File

SOURCE=.\ArASyncTask.cpp
# End Source File
# Begin Source File

SOURCE=.\ArBasePacket.cpp
# End Source File
# Begin Source File

SOURCE=.\ArBumpers.cpp
# End Source File
# Begin Source File

SOURCE=.\ArCondition_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArConfig.cpp
# End Source File
# Begin Source File

SOURCE=.\ArConfigArg.cpp
# End Source File
# Begin Source File

SOURCE=.\ArConfigGroup.cpp
# End Source File
# Begin Source File

SOURCE=.\ArDeviceConnection.cpp
# End Source File
# Begin Source File

SOURCE=.\ArDPPTU.cpp
# End Source File
# Begin Source File

SOURCE=.\ArFileParser.cpp
# End Source File
# Begin Source File

SOURCE=.\ArForbiddenRangeDevice.cpp
# End Source File
# Begin Source File

SOURCE=.\ArFunctorASyncTask.cpp
# End Source File
# Begin Source File

SOURCE=.\ArGripper.cpp
# End Source File
# Begin Source File

SOURCE=.\Aria.cpp
# End Source File
# Begin Source File

SOURCE=.\ariaUtil.cpp
# End Source File
# Begin Source File

SOURCE=.\ArInterpolation.cpp
# End Source File
# Begin Source File

SOURCE=.\ArIrrfDevice.cpp
# End Source File
# Begin Source File

SOURCE=.\ArIRs.cpp
# End Source File
# Begin Source File

SOURCE=.\ArJoyHandler.cpp
# End Source File
# Begin Source File

SOURCE=.\ArJoyHandler_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArKeyHandler.cpp
# End Source File
# Begin Source File

SOURCE=.\ArLineFinder.cpp
# End Source File
# Begin Source File

SOURCE=.\ArLog.cpp
# End Source File
# Begin Source File

SOURCE=.\ArLogFileConnection.cpp
# End Source File
# Begin Source File

SOURCE=.\ArMap.cpp
# End Source File
# Begin Source File

SOURCE=.\ArMode.cpp
# End Source File
# Begin Source File

SOURCE=.\ArModes.cpp
# End Source File
# Begin Source File

SOURCE=.\ArModule.cpp
# End Source File
# Begin Source File

SOURCE=.\ArModuleLoader.cpp
# End Source File
# Begin Source File

SOURCE=.\ArMutex_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArNetServer.cpp
# End Source File
# Begin Source File

SOURCE=.\ArP2Arm.cpp
# End Source File
# Begin Source File

SOURCE=.\ArPriorityResolver.cpp
# End Source File
# Begin Source File

SOURCE=.\ArPTZ.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRangeBuffer.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRangeDevice.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRangeDeviceThreaded.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRecurrentTask.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobot.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotConfigPacketReader.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotPacket.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotPacketReceiver.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotPacketSender.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotParams.cpp
# End Source File
# Begin Source File

SOURCE=.\ArRobotTypes.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSensorReading.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSerialConnection_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSick.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSickLogger.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSickPacket.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSickPacketReceiver.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSignalHandler_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSimpleConnector.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSocket.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSocket_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSonarDevice.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSonyPTZ.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSyncLoop.cpp
# End Source File
# Begin Source File

SOURCE=.\ArSyncTask.cpp
# End Source File
# Begin Source File

SOURCE=.\ArTCM2.cpp
# End Source File
# Begin Source File

SOURCE=.\ArTcpConnection.cpp
# End Source File
# Begin Source File

SOURCE=.\ArThread.cpp
# End Source File
# Begin Source File

SOURCE=.\ArThread_WIN.cpp
# End Source File
# Begin Source File

SOURCE=.\ArTransform.cpp
# End Source File
# Begin Source File

SOURCE=.\ArVCC4.cpp
# End Source File
# End Group
# Begin Group "Header Files"

# PROP Default_Filter "h;hpp;hxx;hm;inl"
# Begin Source File

SOURCE=..\include\ArAction.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionAvoidFront.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionAvoidSide.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionBumpers.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionColorFollow.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionConstantVelocity.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionDesired.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionGoto.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionGroup.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionGroups.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionInput.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionIRs.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionJoydrive.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionKeydrive.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionLimiterBackwards.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionLimiterForwards.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionLimiterTableSensor.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionStallRecover.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionStop.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionTriangleDriveTo.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActionTurn.h
# End Source File
# Begin Source File

SOURCE=..\include\ArActs.h
# End Source File
# Begin Source File

SOURCE=..\include\ArAMPTU.h
# End Source File
# Begin Source File

SOURCE=..\include\ArAnalogGyro.h
# End Source File
# Begin Source File

SOURCE=..\include\ArArg.h
# End Source File
# Begin Source File

SOURCE=..\include\ArArgumentBuilder.h
# End Source File
# Begin Source File

SOURCE=..\include\ArArgumentParser.h
# End Source File
# Begin Source File

SOURCE=..\include\ArASyncTask.h
# End Source File
# Begin Source File

SOURCE=..\include\ArBasePacket.h
# End Source File
# Begin Source File

SOURCE=..\include\ArBumpers.h
# End Source File
# Begin Source File

SOURCE=..\include\ArCommands.h
# End Source File
# Begin Source File

SOURCE=..\include\ArCondition.h
# End Source File
# Begin Source File

SOURCE=..\include\ArConfig.h
# End Source File
# Begin Source File

SOURCE=..\include\ArConfigArg.h
# End Source File
# Begin Source File

SOURCE=..\include\ArConfigGroup.h
# End Source File
# Begin Source File

SOURCE=..\include\ArDeviceConnection.h
# End Source File
# Begin Source File

SOURCE=..\include\ArDPPTU.h
# End Source File
# Begin Source File

SOURCE=..\include\ArDrawingData.h
# End Source File
# Begin Source File

SOURCE=..\include\ArExport.h
# End Source File
# Begin Source File

SOURCE=..\include\ArFileParser.h
# End Source File
# Begin Source File

SOURCE=..\include\ArForbiddenRangeDevice.h
# End Source File
# Begin Source File

SOURCE=..\include\ArFunctor.h
# End Source File
# Begin Source File

SOURCE=..\include\ArFunctorASyncTask.h
# End Source File
# Begin Source File

SOURCE=..\include\ArGripper.h
# End Source File
# Begin Source File

SOURCE=..\include\Aria.h
# End Source File
# Begin Source File

SOURCE=..\include\ariaInternal.h
# End Source File
# Begin Source File

SOURCE=..\include\ariaOSDef.h
# End Source File
# Begin Source File

SOURCE=..\include\ariaTypedefs.h
# End Source File
# Begin Source File

SOURCE=..\include\ariaUtil.h
# End Source File
# Begin Source File

SOURCE=..\include\ArInterpolation.h
# End Source File
# Begin Source File

SOURCE=..\include\ArIrrfDevice.h
# End Source File
# Begin Source File

SOURCE=..\include\ArIRs.h
# End Source File
# Begin Source File

SOURCE=..\include\ArJoyHandler.h
# End Source File
# Begin Source File

SOURCE=..\include\ArKeyHandler.h
# End Source File
# Begin Source File

SOURCE=..\include\ArLineFinder.h
# End Source File
# Begin Source File

SOURCE=..\include\ArLog.h
# End Source File
# Begin Source File

SOURCE=..\include\ArLogFileConnection.h
# End Source File
# Begin Source File

SOURCE=..\include\ArMap.h
# End Source File
# Begin Source File

SOURCE=..\include\ArMode.h
# End Source File
# Begin Source File

SOURCE=..\include\ArModes.h
# End Source File
# Begin Source File

SOURCE=..\include\ArModule.h
# End Source File
# Begin Source File

SOURCE=..\include\ArModuleLoader.h
# End Source File
# Begin Source File

SOURCE=..\include\ArMutex.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetServer.h
# End Source File
# Begin Source File

SOURCE=..\include\ArP2Arm.h
# End Source File
# Begin Source File

SOURCE=..\include\ArPriorityResolver.h
# End Source File
# Begin Source File

SOURCE=..\include\ArPTZ.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRangeBuffer.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRangeDevice.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRangeDeviceThreaded.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRecurrentTask.h
# End Source File
# Begin Source File

SOURCE=..\include\ArResolver.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobot.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotConfigPacketReader.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotPacket.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotPacketReceiver.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotPacketSender.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotParams.h
# End Source File
# Begin Source File

SOURCE=..\include\ArRobotTypes.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSensorReading.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSerialConnection.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSick.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSickLogger.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSickPacket.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSickPacketReceiver.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSignalHandler.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSimpleConnector.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSocket.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSonarDevice.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSonyPTZ.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSyncLoop.h
# End Source File
# Begin Source File

SOURCE=..\include\ArSyncTask.h
# End Source File
# Begin Source File

SOURCE=..\include\ArTaskState.h
# End Source File
# Begin Source File

SOURCE=..\include\ArTCM2.h
# End Source File
# Begin Source File

SOURCE=..\include\ArTcpConnection.h
# End Source File
# Begin Source File

SOURCE=..\include\ArThread.h
# End Source File
# Begin Source File

SOURCE=..\include\ArTransform.h
# End Source File
# Begin Source File

SOURCE=..\include\ArVCC4.h
# End Source File
# End Group
# End Target
# End Project
