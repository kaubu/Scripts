package calculatetheareaofobjects;

import java.util.Scanner;

public class CalculateTheAreaOfObjects {
    public static void main(String[] args) {
        double pi = 3.1415926535;
        
        System.out.print("Calculate The Area Of Objects \n" + 
                "Included Shapes: \n" +
                "[1] Square \n" +
                "[2] Rectangle \n" +
                "[3] Parallelogram \n" +
                "[4] Triangle \n" +
                "[5] Circle \n" +
                "[6] Trapezoid \n" +
                "[7] Sphere (Surface Area) \n" + 
                "[8] Cube (Surface Area) \n" +
                "[9] Cylinder (Surface Area) \n\n" +
                "Choose a shape by typing in the number associated with it. \n" + 
                ">> ");
        
        Scanner sc = new Scanner(System.in);
        int selectedShape = sc.nextInt();
        
        switch (selectedShape) {
            case 1: // Square
                System.out.print("Side Length: ");
                double sc1 = sc.nextDouble();
                System.out.println(Math.pow(sc1, 2)); // Formula: s^2
                break;
            case 2: // Rectangle
                System.out.print("Length: ");
                double lc2 = sc.nextDouble();
                System.out.print("Height: ");
                double hc2 = sc.nextDouble();
                System.out.println(lc2 * hc2); // Formula: lh
                break;
            case 3: // Parallelogram
                System.out.print("Base: ");
                double bc3 = sc.nextDouble();
                System.out.print("Height: ");
                double hc3 = sc.nextDouble();
                System.out.println(bc3 * hc3); // Formula: bh
                break;
            case 4: // Triangle
                System.out.print("Base: ");
                double bc4 = sc.nextDouble();
                System.out.print("Height: ");
                double hc4 = sc.nextDouble();
                System.out.println(1.0 / 2.0 * bc4 * hc4); // Formula: 1/2bh
                break;
            case 5: // Circle
                System.out.print("Radius: ");
                double rc5 = sc.nextDouble();
                System.out.println(pi * Math.pow(rc5, 2)); // Formula: (pi)r^2
                break;
            case 6: // Trapezoid
                System.out.print("Base 1: ");
                double b1c6 = sc.nextDouble();
                System.out.print("Base 2: ");
                double b2c6 = sc.nextDouble();
                System.out.print("Height: ");
                double hc6 = sc.nextDouble();
                System.out.println(1.0 / 2.0 * (b1c6 + b2c6) * hc6); // Formula: 1/2(b1 + b2)h
                break;
            case 7: // Sphere
                System.out.print("Radius: ");
                double rc7 = sc.nextDouble();
                System.out.print("Surface Area: ");
                System.out.println(4 * pi * Math.pow(rc7, 2)); // Formula: 4(pi)r^2
                break;
            case 8: // Cube
                System.out.print("Side Area: ");
                double sc8 = sc.nextDouble();
                System.out.println(6 * Math.pow(sc8, 2)); // Formula: 6s^2
                break;
            case 9: // Cylinder
                System.out.print("Radius: ");
                double rc9 = sc.nextDouble();
                System.out.print("Height:");
                double hc9 = sc.nextDouble();
                System.out.println(2 * pi * rc9 * hc9); // Formula: 2(pi)rh
                break;
        }
    }    
}
