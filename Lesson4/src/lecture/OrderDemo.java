package lecture;

public class OrderDemo {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.items.size());
        Item item = new Item("Sugar");
        order.items.add(item);
        order.items.add(new Item("Water"));
        System.out.println(order.items);
    }
}
