package OOPS.Polymorphism.Overloading;

public class Main {
    public static void main(String[] args) {
        Area a = new Area();
        int res1 = a.areaOfAny(5);
        int res2 = a.areaOfAny(10, 10);

        System.out.println("area of square : "+res1);
        System.out.println("area of rectangle : "+res2);
    }
}
