import net.dtcc.lib.*;
public class Tester {

	public static void main(String[] args) {
		
		// Test areaOfRectangle
        double rectangleArea = AllInOne.areaOfRectangle(5.0, 7.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        
        
        // Test addFractions
        double fractionSum = AllInOne.addFractions(1, 2, 2, 3);
        System.out.println("Sum of fractions: " + fractionSum);

        // Add tests for the rest of the methods here

	}// end main

}// end Tester class
