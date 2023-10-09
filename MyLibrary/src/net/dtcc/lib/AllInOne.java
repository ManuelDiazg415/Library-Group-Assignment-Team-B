package net.dtcc.lib;

public class AllInOne {
	// Area methods
	// test
	
	// Fractions methods

	
    // Binary methods
    public int binaryToDecimal(String binary) {
        // Implement binary to decimal conversion and return the result as an int
        int decimal = 0;
        int binaryLength = binary.length();
        for (int i = 0; i < binaryLength; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binaryLength - 1 - i);
            }
        }
        return decimal;
    }

    // Temperature methods

    // Volume methods

 


    // Perimeter methods
    public double perimeterOfSquare(double sideLength) {

        return 4 * sideLength;
    }

    public double perimeterOfRectangle(double length, double width) {

        return 2 * (length + width);
    }

    // Circumference methods
    public double circumferenceOfCircle(double radius) {

        return 2 * Math.PI * radius;
    }

    // Pythagorus theorem
    public double pythagorasTheorem(double a, double b) {
      
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
	
}// end AllInOne class
