import java.util.Scanner;

public class SectorAreaCalculator {
    public static void main (String[] args){
        double area;
        double pi = 3.14;
        int r, alpha;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle in mm: ");
        r = sc.nextInt();
        System.out.println("Enter the angle of the major sector: ");
        alpha = sc.nextInt();

        area = (pi * Math.pow(r,2) * alpha) / 360;

        System.out.println("--------------------------------");
        System.out.println("The area of the sector is " + area + " mm");
        System.out.println("--------------------------------");

    }
}