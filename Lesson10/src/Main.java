import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Compile-time error:
//         apples.add(new Orange());
        for (Apple apple : apples) {
            System.out.println(apple.getId());
        }

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());

        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                ((Apple) fruit).getId();
            }
        }

        // ArrayList 10 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        /// array[0] -> 1


        Map<String, Integer> myMap = new HashMap<>();
        if (!myMap.containsKey("Hello")) {
            myMap.put("Hello", 1);
        } else {
            myMap.put("Hello", myMap.get("Hello") + 1);
        }
    }
}
