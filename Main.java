import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {

        GeometricBody cube = new Cube(5);
        GeometricBody sphere = new Sphere(5);
        GeometricBody parallelepiped = new Parallelepiped(5, 15, 25);

        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();

        System.out.println("Basic Level:");

        System.out.println("\nCube:");
        System.out.println("Volum: " + cube.getVolume());
        System.out.println("Suptafata: " + cube.getSurface());

        System.out.println("\nSfera:");
        System.out.println("Volum: " + sphere.getVolume());
        System.out.println("Suprafata: " + sphere.getSurface());

        System.out.println("\nParalelipiped:");
        System.out.println("Volum: " + parallelepiped.getVolume());
        System.out.println("Suprafata: " + parallelepiped.getSurface());


        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        System.out.println("\nAvansat Level:\n");
        System.out.println("The biggest volume: " + GeometricBodyController.getBiggestSurfaceBody(bodies).getSurface());
        System.out.println("The biggest surface: " + GeometricBodyController.getBiggestVolumeBody(bodies).getVolume());
    }
}