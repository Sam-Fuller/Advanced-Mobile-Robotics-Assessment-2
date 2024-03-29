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
#include "Aria.h"

ArKeyHandler keyHandler;

void up(void)
{
  printf("Up\n");
}

void down(void)
{
  printf("Down\n");
}

void right(void)
{
  printf("Right\n");
}

void left(void)
{
  printf("Left\n");
}

void escape(void)
{
  printf("Escape\n");
  printf("exiting\n");
  keyHandler.restore();
  Aria::shutdown();
  exit(0);
}

void space(void)
{
  printf("Space\n");
}

void a(void)
{
  printf("a\n");
}


int main(int argc, char **argv)
{
  Aria::init();
  ArGlobalFunctor upCB(&up);
  ArGlobalFunctor downCB(&down);
  ArGlobalFunctor aCB(&a);
  ArGlobalFunctor escapeCB(&escape);
  ArGlobalFunctor spaceCB(&space);

  puts("Adding key handlers for: up, down, escape (also exits program), space, 'a', 'a' (again; should warn)");
  keyHandler.addKeyHandler(ArKeyHandler::UP, &upCB);
  keyHandler.addKeyHandler(ArKeyHandler::DOWN, &downCB);
  keyHandler.addKeyHandler(ArKeyHandler::ESCAPE, &escapeCB);
  keyHandler.addKeyHandler(ArKeyHandler::SPACE, &spaceCB);
  keyHandler.addKeyHandler('a', &aCB);
  keyHandler.addKeyHandler('a', &aCB);
  

  while (1)
  {
    keyHandler.checkKeys();
    ArUtil::sleep(100);
  }
}
