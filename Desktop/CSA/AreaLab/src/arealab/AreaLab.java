/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arealab;
import java.util.Scanner;

/**
 *
 * Javier Duran 21122
 */

public class AreaLab 
{
    private static Scanner in = new Scanner(System.in);
   
    public static void main(String[] args) 
    {    
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += parallelogram();
        surfaceArea += square();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        System.out.println("\nThe total area of Michael's truck is : " + surfaceArea);
    }
  public static int triangle()
  {
      System.out.println("\nThe total area of a triangle is: 1/2 * base * height");
      System.out.print("base >");
      int base = in.nextInt();
      System.out.println("height > ");
      int height = in.nextInt();
      int area = (int) (0.5 * base * height);
      System.out.println("The area of this shape is: " + area);
      return area;
  }

public static int parallelogram()
{
    System.out.println("\nThe total area of a parallelogram is: base * height ");
    System.out.println("base > ");
    int base = in.nextInt();
    System.out.println("height > ");
    int height = in.nextInt();
    int area = (base * height);
    System.out.println("The area of this shape is: " + area);
    return area;
}    
public static int square()
{
    System.out.println("\nThe total area of the outer square is: Outer Side squared - Inner Side squared ");
    System.out.println("Outer Square side > ");
    int oSide = in.nextInt();
    int oArea = (int)Math.pow(oSide, 2); 
    System.out.println("Inner Square side > ");
    int iSide = in.nextInt();
    int iArea = (int)Math.pow(iSide, 2);
    int area = (oArea - iArea);
    System.out.println("The area of this shape is: " + area);
    return area;
} 
public static int circle()
{
    System.out.println("\nThe total area of the circle is: Pi * Radius Squared ");
    System.out.println("Radius > ");
    int radius = in.nextInt();
    int radius2 = (int)Math.pow(radius, 2);
    double pi = Math.PI;
    double area = radius2 * pi;
    System.out.println("The total area of this shape is: " + area);
    return (int) area;
}        
}


