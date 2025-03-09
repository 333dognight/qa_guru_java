package ru.caranga.data;

public class AmericanExpressCard extends Card {
    public AmericanExpressCard() {
        super(PaymentSystem.AMERICANEXPRESS);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return country == Country.US;
    }
}

