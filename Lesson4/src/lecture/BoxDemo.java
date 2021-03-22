package lecture;

public class BoxDemo {

    public static void main(String[] args) {
        //instanceMethod();
        staticMethod();
//        Box myBox = new Box();
//        System.out.println("Initial height: " + myBox.height);
//        System.out.println("Initial width: " + myBox.width);
//        System.out.println("Initial depth: " + myBox.depth);
//        System.out.println(myBox);
//
//        double vol;
//
//        myBox.height = 10;
//        myBox.width = 12;
//        myBox.depth = 10;
//
//        System.out.println("Final height: " + myBox.height);
//        System.out.println("Final width: " + myBox.width);
//        System.out.println("Final depth: " + myBox.depth);
//
//        // Compute the volume of the box
//        vol = myBox.width * myBox.height * myBox.depth;
//
//        System.out.println("Volume is " + vol);

        Box box = new Box(1, 2, 3);
        Box box2 = new Box(4, 5,6);
        Box box3 = new Box(4, 5,6);
    }

    public void instanceMethod() {
        System.out.println("!!!");
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("???");
    }
}
