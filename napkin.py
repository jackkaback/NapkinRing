#!/usr/bin/python2.7
from __future__ import print_function
from six.moves import *
import math

while True:	
	height = float(input("Enter the height of the napkin ring: "))
	volume = height**3 * math.pi / 6
	
	print("Volume is " + str(volume))
