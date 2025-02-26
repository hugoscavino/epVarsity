package com.ep.lab;

/**
 * Submission detail is:
 * - This iS individual work.
 * - Submit a working . java file.
 * - Create a video explaining your code in detail
 * In an n-sided regular polygon, all sides have the same length and alt angles have
 * the same degree (i.e., the polygon is both equilateral and equiangular) .
 * Design a class named RegularPolygon that contains:
 * - A private int data field named n that defines the number of sides in the polygon
 * with default value 3.
 * - A private double data field named side that stores the length of the side with
 * default value 1.
 * - A private double data field named x that defines the x-coordinate of the
 * polygon's center with default value O.
 * - A private double data field named y that defines the y-coordinate of the
 * polygon's center with default value
 * - A no-arg constructor that creates a regular polygon with default values.
 * - A constructor that creates a regular polygon with the specified number of Sides
 * and length of side, centered at (O, O).
 * - A constructor that creates a regular polygon With the specified number Of sides,
 * length of side, and x- and y-coordinates.
 * - The accessor and mutator methods for all data fields.
 * - The method getPerimeter() returns the perimeter of the polygon.
 * - The method getArea( ) that returns the area Of the polygon.
 * The formula for computing the area of a regular polygon is:
 * Area n * s^2 / 4 * tan(pi / n))
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that creates three Regular polygon Objects, created using the
 * no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
 * For each object, display its perimeter and area.
 * Sample Run
 * RegularPolygon 1 perimeter 3
 * RegularPolygon 1 area: O.43301270189221946
 * RegularPolygon 2 perimeter: 24.0
 * RegularPolygon 2 area: 41.569219381653056
 * RegularPolygon 3 perimeter: 40.0
 * RegularPolygon 3 area: 123.10734148701015
 */
public class RegularPolygon {

    /**
     * - A private int data field named n that defines the number of sides in the polygon
     * with default value 3.
     */

    int n = 3;

    /* A private double data field named side that stores the length
    of the side with default value 1 */
    private double side = 1;

    /* A private double data field named x that defines the x-coordinate of the
     * polygon's center with default value O.
     */
    private double x = 0;

    /* A private double data field named y that defines the y-coordinate of the
     * polygon's center with default value
     */
     private double y = 0;

     /**
      * A no-arg constructor that creates a regular polygon with default values.
      */
    public RegularPolygon(){

    }

    /** A constructor that creates a regular polygon with the specified number of Sides
     * and length of side, centered at (O, O).
     */
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    /**
     * A constructor that creates a regular polygon With the specified number Of sides,
     * length of side, and x- and y-coordinates.
     */

    public RegularPolygon(int n, double side, double x, double y){
        this.side = side;
        this.n = n;
        this.x=x;
        this.y=y;
    }

    /**
     * The accessor and mutator methods for all data fields
     */
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    /** - The method getPerimeter() returns the perimeter of the polygon.
     *
     */
    double getPerimeter(){
        return side*n;
    }

       /** The method getArea( ) that returns the area Of the polygon.
            * The formula for computing the area of a regular polygon is:
            * Area n * s^2 / (4 * tan(pi / n))
        */
       double getArea(){
            double numerator =  n*(side*side);
            double divisor = 4 * Math.tan(Math.PI / n);

            return numerator/divisor;
       }

       public static void main(String[] args) {
           RegularPolygon run1 = new  RegularPolygon();
           System.out.println(run1.getPerimeter());
           System.out.println(run1.getArea());

           RegularPolygon run2 = new  RegularPolygon(6,4);
           System.out.println(run2.getPerimeter());
           System.out.println(run2.getArea());

           RegularPolygon run3 = new  RegularPolygon(10,4, 5.6, 7.8);
           System.out.println(run3.getPerimeter());
           System.out.println(run3.getArea());
       }

}
