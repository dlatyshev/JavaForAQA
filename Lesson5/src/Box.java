public class Box {

    private double width;
    private double height;

    public Box(double width, double height) {
        this.height = height;
        this.width = height;
    }

    public double getArea() {
        return height * width;
    }
}
