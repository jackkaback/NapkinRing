#include <iostream>
#include <cmath>

const double PI = 3.141592653589793;

int main() {

	while(1) {
		double height = 0.0;
		double volume = 0.0;
		std::cout << "Enter a Height for the napkin ring (-1 to exit): ";
		std::cin >> height;

		if (height <= 0){
			break;
		}

		volume = std::pow(height, 3.0) * PI / 6.0;

		printf("Volume: %10lf\n", volume);
	}

	return 0;
}