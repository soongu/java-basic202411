package chap1_7.practice.q5;

public class Order {

    public String orderId;
    protected double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public void process() {
        System.out.println(orderId + "번 주문이 처리되었습니다.");
    }
}
