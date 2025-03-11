package ru.caranga.data;

public class VisaCard extends Card implements ICard {
    public VisaCard() {
        super(PaymentSystem.VISA);
    }


    protected boolean isCountryValidForTheseCard(Country country) {

        return true;
    }
}
