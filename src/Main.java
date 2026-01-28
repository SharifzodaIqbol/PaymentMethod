interface PaymentMethod{
    void pay(double amount);
}
class BankCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой:" + amount);
    }
}

class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата наличными:" + amount);
    }
}
class CryptoPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой:" + amount);
    }
}

class ServicePayment{
    public void processPayment(PaymentMethod method, double totalSum) {
        method.pay(totalSum);
        System.out.println("Заказ успешно оплачен!");
    }
}
class Main{
    public static void main(String[] args) {
        ServicePayment service = new ServicePayment();

        PaymentMethod myCard = new BankCardPayment();
        service.processPayment(myCard, 1500.0);

        PaymentMethod ton = new CryptoPayment();
        service.processPayment(ton, 2000.0);

        PaymentMethod cash = new CashPayment();
        service.processPayment(cash, 1000.0);
    }
}