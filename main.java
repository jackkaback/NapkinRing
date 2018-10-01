import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double height = 0.0;
		double volume = 0.0;
		String temp;

		while(true) {
			System.out.print("Enter height of Napkin Ring: ");
			temp = keyin.nextLine();
			if(isNumeric(temp)){
				height = Double.parseDouble(temp);
				volume = calcVolume(height);

				System.out.println("Volume is: " + volume);
			}
		}
	}


	public static double calcVolume(double height){
		double retval = Math.pow(height, 3) * Math.PI * (1.0 / 6.0);
		return retval;
	}


	//checks if the value is Nuemeric
	public static boolean isNumeric(String checkString) {
		int ii = 0;

		if (checkString == null) {
			return false;
		}

		for ( ;ii < checkString.length(); ii++) {
			if (checkString.charAt(ii) < '0' || checkString.charAt(ii) > '9') { //this checks if the input is only numbers
				return false;
			}
		}
		return true;
	}

}