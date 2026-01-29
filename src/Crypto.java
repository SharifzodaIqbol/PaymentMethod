class Crypto implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой:" + amount);
    }
}