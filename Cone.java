package Problem_8;

public class Cone {
    private double radius;
    private double height;
    public Cone(double radius , double height){
        this.radius = radius;
        this.height = height;
    }
    public double getVolume()
    {
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
        return volume;
    }
    public double getSurfaceArea()
    {
        double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        return surfaceArea;
    }

}
