/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009 MobileRobots Inc.
Copyright (C) 2010, 2011 Adept Technology, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
#include "ariaOSDef.h"
#include <list>
#include "Aria.h"
#include "ArRobotTypes.h"


void makePref(ArRobotParams *param)
{
  param->save();
}

int main()
{
  Aria::init();
  //ArLog::init(ArLog::StdOut, ArLog::Verbose);

  makePref(new ArRobotAmigo);
  makePref(new ArRobotAmigoSh);
  makePref(new ArRobotP2AT);
  makePref(new ArRobotP2AT8);
  makePref(new ArRobotP2IT);
  makePref(new ArRobotP2DX);
  makePref(new ArRobotP2CE);
  makePref(new ArRobotP2DXe);
  makePref(new ArRobotP2DF);
  makePref(new ArRobotP2D8);
  makePref(new ArRobotP2PB);
  makePref(new ArRobotP2PP);
  makePref(new ArRobotPerfPB);
  makePref(new ArRobotPion1M);
  makePref(new ArRobotPion1X);
  makePref(new ArRobotPionAT);
  makePref(new ArRobotPsos1X);
  makePref(new ArRobotPsos1M);
  makePref(new ArRobotPsos43M);
  makePref(new ArRobotPowerBot);
  makePref(new ArRobotP2AT8Plus);
  makePref(new ArRobotP2D8Plus);
  makePref(new ArRobotPerfPBPlus);
  makePref(new ArRobotP3AT);
  makePref(new ArRobotP3DX);
  makePref(new ArRobotP3DXSH);
  makePref(new ArRobotP3ATSH);
  makePref(new ArRobotP3ATIWSH);
  makePref(new ArRobotPatrolBotSH);
  makePref(new ArRobotPeopleBotSH);
  makePref(new ArRobotPowerBotSH);
  makePref(new ArRobotWheelchairSH);
  makePref(new ArRobotSeekur);
  makePref(new ArRobotPowerBotSHuARCS);
  makePref(new ArRobotMT400);
  makePref(new ArRobotResearchPB);
  makePref(new ArRobotSeekurJr);

  Aria::shutdown();
  return(0);
}
