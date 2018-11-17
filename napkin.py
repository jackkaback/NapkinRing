#!/usr/bin/python2.7

import math

while True:	
	height = input("Enter the height of the napkin ring: ")
	volume = 0.0
	
	volume = height**3 * math.pi / 6
	
	print "Volume is " + str(volume)
	
	