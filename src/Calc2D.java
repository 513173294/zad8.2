public interface Calc2D {

    static double circleArea(Circle circle) {
        return (circle.r * circle.r) * circle.pi;
    }

    static double rectangleArea(Rectangle rectangle) {
        return (rectangle.bok * rectangle.x);
    }
}
