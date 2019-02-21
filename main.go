package main

import (
	"fmt"
	"math"
)

func main() {

	for {
		var height float64
		var volume float64
		fmt.Print("Enter Height: ")
		_, _ = fmt.Scanf("%f", &height)

		volume = math.Pow(height, 3) * math.Pi / 6

		fmt.Print("The voume of the napkin ring is: ", volume, "\n")
	}
}
