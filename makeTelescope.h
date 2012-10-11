/*
 * makeTelescope.h
 *
 *  Created on: Oct 11, 2012
 *      Author: efcl
 */

#ifndef MAKETELESCOPE_H_
#define MAKETELESCOPE_H_

struct initiateTelescopeStruct
{
	bool spaceFlag;
	bool aoFlag;
	float mirrorDiameter;
};

struct configureTelescopeSettingsStruct  //only used if 'intelligent
{                                        //auto flag set to 'off'
	float exposureTime;
	float exposureFrequency;
};

struct telescopeToTransitStruct
{
	float sn;
	float exposureFrequency;
};

struct telescopeToImagingStruct
{
	float sn;
	float skyNoise;
};

int makeTelescope();

#endif /* MAKETELESCOPE_H_ */
