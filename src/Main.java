class Main{
    public static void main(String[] args) {
        Service service = new Service();

        PaymentMethod myCard = new BankCard();
        service.processPayment(myCard, 1500.0);

        PaymentMethod ton = new Crypto();
        service.processPayment(ton, 2000.0);

        PaymentMethod cash = new Cash();
        service.processPayment(cash, 1000.0);
    }
}