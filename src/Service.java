class Service{
    public void processPayment(PaymentMethod method, double totalSum) {
        method.pay(totalSum);
        System.out.println("Заказ успешно оплачен!");
    }
}