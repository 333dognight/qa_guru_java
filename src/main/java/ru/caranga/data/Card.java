package ru.caranga.data;

public abstract class Card {
    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paymentSystem;

    PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    abstract void payInCountry(Country country, int amount);
}
