package ru.caranga;

import ru.caranga.data.*;

public class Main {
    public static void main(String[] args) {
        invoke(new MasterCard());
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(Country.RU, 70);
        System.out.println("Current balance: " + card.getBalance());

    }
}
