package chap1_7.inherit.example.bank;

public class SavingsAccount extends BankAccount {

    private double interestRate; // 이자율

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // 예금 기능 (부모의 입금기능을 강화하고 싶음 - 오버라이딩)
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * interestRate;
            super.deposit(amount + interest);
            System.out.printf("이자가 %.2f원 추가되었습니다.\n", interest);
        }
    }
}
