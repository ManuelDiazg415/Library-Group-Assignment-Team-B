package net.dtcc.lib;

public class AllInOne {
    // Hugo codes start

	// Area methods
    public double CalcRectangleArea(double b, double h) {
		return b * h;
	}
	
	public double CalcSquareArea(double s) {
		return s * s;
	}
	
	public double CalcTriangleArea(double b, double h) {
		return 0.5 * (b * h);
	}
	
	public double CalcCircleArea(double radius) {
		return Math.PI * (radius * radius);
	}
	
	public double CalcTrapezoidArea(double base, double base2, double h) {
		return 0.5 * h * (base + base2);
		
	}
	
	public double CalcEllipseArea(double radius1, double radius2) {
		return Math.PI * radius1 * radius2;
	}
	
	public double CalcPentagonArea(double apothem, double side) {
		return 0.5 * apothem * (5 * side);
		
	}
	
	public double CalcParalleglogramArea(double base, double height) {
		return base * height;
	}
	
	public double CalcRhombusArea(double distance1, double distance2) {
		return 0.5 * distance1 * distance2;
	}
	
	public double CalcHexagonArea(double side) {
		return (3/2) *  Math.sqrt(3) * (side*side);
	}
	
	public double CalcPolygonArea(double perimeter, double apothem) {
		return 0.5 * perimeter * apothem;
	}
	
	
	//Fraction methods
	
	public double FractionAddition(int numerator1, int denominator1, int numerator2, int denominator2) {
		int commonDenominator = denominator1 * denominator2;
		int newNumerator1 = numerator1 * denominator2;
		int newNumerator2 = numerator2 * denominator1;
		
		int finalNumerator = newNumerator1 + newNumerator2;
		return finalNumerator/commonDenominator;
		
		
		
	}
	
	public double FractionSubtraction(int numerator1, int denominator1, int numerator2, int denominator2) {
		int commonDenominator = denominator1 * denominator2;
		int newNumerator1 = numerator1 * denominator2;
		int newNumerator2 = numerator2 * denominator1;
		
		int finalNumerator = newNumerator1 - newNumerator2;
		return finalNumerator/commonDenominator;
		
		
		
	}
	
	public double FractionMultiplication(int numerator1, int denominator1, int numerator2, int denominator2) {
		int finalNumerator = numerator1 * numerator2;
		int commonDenominator = denominator1 * denominator2;
		
		return finalNumerator/commonDenominator;
	}
	
	public double FractionDivision(int numerator1, int denominator1, int numerator2, int denominator2) {
		int finalNumerator = numerator1 * denominator2;
		int finalDenominator = denominator1 * numerator2;
		return finalNumerator/finalDenominator;
	}
	
//Temperature Methods
	public double CelciusToFahren(double c) {
		return (9/5)* c + 32;
	}
	public double CelciusToKelvin(double c) {
		return c + 273.15;
	}
	public double FahrenToCelcius(double f) {
		return (f - 32) * (5/9);
	}
	public double KelvinToCelcius(double k) {
		return k - 273.15;
	}
	
	
	
	
	
	
	
//Volume Methods
	public double CubeVolume(double edge) {
		return Math.pow(edge, 3);
		
	}
	public double BoxVolume(double length, double width, double height) {
		return length * width * height;
	}
	public double CylinderVolume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	public double ConeVolume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * (height/3);
		
	}
	public double SphereVolume(double radius) {
		return (4/3)* Math.PI * Math.pow(radius, 3);
		
	}
	// Hugo codes ends
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
