package chap1_7.practice.q5;

public class OnlineOrder extends Order {

    private double deliveryFee;

    public OnlineOrder(String orderId, double amount, double deliveryFee) {
        super(orderId, amount);
        this.deliveryFee = deliveryFee;
    }

    @Override
    public void process() {
        System.out.println(orderId + "번 온라인 주문이 처리되었습니다.");
    }

    public double calculateTotalAmount() {
        return amount + deliveryFee;
    }
}
