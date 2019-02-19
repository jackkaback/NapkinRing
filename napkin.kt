import java.util.Scanner
import kotlin.math.*

fun main(args : Array<String>) {

	while (true) {
		val reader = Scanner(System.`in`)
		print("Enter the height of the napkin ring: ")
		var height:Double = reader.nextDouble()

		println("You entered: $height")
		val volume:Double = height.pow(3) * PI * (1.0/6.0)
		println("Volume of napkin ring is: $volume")
	}
}