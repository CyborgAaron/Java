package Module8;

import java.util.Map;

public class _01_CircleDemo {
    double radius = 1;

    _01_CircleDemo() {
        radius = 1;
    }

    _01_CircleDemo(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;

    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
