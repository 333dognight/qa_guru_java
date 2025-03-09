package ru.caranga.data;

public class MasterCard extends Card {
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    @Override
    public void payInCountry(Country country, int amount) {
        if (isCountryValidForTheseCard(country) && isBalanceGreaterThen(amount)) {
            System.out.println("Accepted!");
        }
    }

    public boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
