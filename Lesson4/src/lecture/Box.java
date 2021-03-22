package lecture;

public class Box {

    public static int count = 0;

    public double width; // 0.0
    public double height;// 0.0
    public double depth; // 0.0


    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        count++;
    }

}
