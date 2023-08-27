package Problem_8;

import java.util.Scanner;

public class ClassGeometryTester {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Please Enter a radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Please Enter a height: ");
        double height = scanner.nextDouble();

        Cube cube = new Cube(height);
        Sphere sphere = new Sphere(radius);
        Cylinder cylinder = new Cylinder(radius , height);
        Cone cone  = new Cone( radius , height);

        System.out.println("--------------------------------------------------------------------");

        System.out.printf("Volume of a Cube: %20.2f\n", cube.getVolume());
        System.out.printf("Surface Area of a Cube: %14.2f\n", cube.getSurfaceArea());
        System.out.printf("Volume of a Sphere: %18.2f\n", sphere.getVolume());
        System.out.printf("Surface Area of a Sphere: %12.2f\n", sphere.getSurfaceArea());
        System.out.printf("Volume of a Cylinder: %16.2f\n", cylinder.getVolume());
        System.out.printf("Surface Area of a Cylinder: %10.2f\n", cylinder.getSurfaceArea());
        System.out.printf("Volume of a Cone: %20.2f\n", cone.getVolume());
        System.out.printf("Surface Area of a Cone: %14.2f\n", cone.getSurfaceArea());

        scanner.close();




    }
}
