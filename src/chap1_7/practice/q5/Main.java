package chap1_7.practice.q5;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("ORD12345", 50000);
        order.process();

        System.out.println("=============");
        OnlineOrder onlineOrder = new OnlineOrder("ORD98765", 70000, 4000);
        onlineOrder.process();
        double totalAmount = onlineOrder.calculateTotalAmount();
        System.out.println("totalAmount = " + totalAmount);

    }
}
