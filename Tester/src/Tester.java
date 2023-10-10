import net.dtcc.lib.*;
public class Tester {

	public static void main(String[] args) {
		
		AllInOne x = new AllInOne();

		//Area Testing
		// Test areaOfRectangle
        System.out.println("Area of rectangle: " + x.CalcRectangleArea(4, 2));

        // test areaOfSquare
        System.out.println("Area of square: " + x.CalcSquareArea(5));

        // test areaOfTriangle
        System.out.println("Area of Triangle: " + x.CalcTriangleArea(6, 2));

        // Test Circle
        System.out.println("Area of Circle: " + x.CalcCircleArea(16));

        // Test Circle
        System.out.println("Area of Trapezoid: " + x.CalcTrapezoidArea(2, 6, 8));

        // Test Ellipse
        System.out.println("Area of Ellipse: " + x.ElCalcEllipseArealipse(6, 8));

        // Test Pentagon
        System.out.println("Area of Pentagon: " + x.areaOfPentagon(13));

        // Test Parallelogram
        System.out.println("Area of Parallelogram: " + x.CalcParalleglogramArea(16, 6));

        // Test Rhombus
        System.out.println("Area of Rhombus: " + x.CalcRhombusArea(11, 6));

        // Test Hexagon
        System.out.println("Area of Hexagon: " + x.CalcHexagonArea(3));

        // Test Polygon
        // this is for a general Polygon assuming all sides are equal,  n = number of sides, a = first side length.
        System.out.println("Area of Polygon: " + x.CalcPolygonArea(4, 2));


        // Fractions
        // Adding 2 fractions
        System.out.println("Sum of fractions: " + x.FractionAddition(3, 6, 5, 3));

        // Test Subtracting 2 fractions
        System.out.println("Subtracting of fractions: " + x.FractionSubtraction(3, 6, 5, 3)); 

        // Test MultiplyFractions
        System.out.println("Multiplying of fractions: " + x.FractionMultiplication(3, 6, 5, 3)); 

        //Test DivideFractions
        System.out.println("Divide of fractions: " + x.FractionDivision(3, 6, 5, 3)); 


        // Binary
        // Test Binary
        System.out.println("The decimal is: " + x.binaryToDecimal("0110")); 


        //Temperature
        // Test Celcius to Fahrenheit
        System.out.println("Celcius to Fahrenheit: " + x.CelciusToFahren(50)); 

        // Test Celcius to Kelvin
        System.out.println("Celcius to Kelvin: " + x.CelciusToKelvin(42)); 

        // Test Fahrenheit to Celcius
        System.out.println("Fahrenheit to Celcius: " + x.FahrenToCelcius(104)); 

        // Test Fahrenheit to Kelvin
        System.out.println("Fahrenheit to Kelvin: " + x.FahrenToKelvin(50));


        //Volume
        //Test Volume of Cube
        System.out.println("Volume of Cube: " + x.CubeVolume(4));

        // Test Volume of Box
        System.out.println("Volume of Box: " + x.BoxVolume(13, 8, 2));

        //Test Volume of Cylinder
        System.out.println("Volume of Cylinder: " + x.CylinderVolume(8, 2));

        // Test Volume of Cone
        System.out.println("Volume of Cone: " + x.ConeVolume(9, 2));

        // TestVolume of Sphere
        System.out.println("Volume of Sphere: " + x.SphereVolume(9));


        // Perimeter
        // Test Perimter of Square
        System.out.println("Perimter of Square: " + x.perimeterOfSquare(9));

        // Test Perimeter of Rectangle
        System.out.println("Perimeter of Rectangle: " + x.perimeterOfRectangle(5, 6));


        // Circumference
        // Test Circumference of Circle
        System.out.println("Circumference of Circle: " + x.circumferenceOfCircle(5));


        // Pythagorus Theorem
        // Test Pythagorus Theorem
        System.out.println("Pythagorus Theorem: " + x.pythagorasTheorem(5, 6));

        // Add tests for the rest of the methods here

	}// end main

}// end Tester class