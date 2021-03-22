package lecture;

public class NewBox2 {

    double height;
    double width;
    double depth;

    public NewBox2(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

}

