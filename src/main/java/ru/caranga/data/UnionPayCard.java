package ru.caranga.data;

public class UnionPayCard extends Card {
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return country == Country.CN;
    }
}
