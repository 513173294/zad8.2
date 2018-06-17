public abstract class Shape {
    private double x;
    final double pi = 3.14;


    public Shape(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
