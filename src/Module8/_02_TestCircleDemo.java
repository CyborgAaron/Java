package Module8;

public class _02_TestCircleDemo {

    public static void main(String[] args) {
        _01_CircleDemo circle1 = new _01_CircleDemo();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());

        _01_CircleDemo circle2 = new _01_CircleDemo(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        _01_CircleDemo circle3 = new _01_CircleDemo(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100; //or circle2.setRadius(100) (100) means arguments
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }
}
