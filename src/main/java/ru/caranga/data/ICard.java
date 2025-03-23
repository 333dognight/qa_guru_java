package ru.caranga.data;

//Все методы должны быть ПУБЛИЧНЫМИ. Определяет какой будет метод без наполнения (тела).
//У интерфейса нет СОСТОЯНИЯ, он должен описывать только поведение.

public interface ICard {
    public void payInCountry(Country country, int amount);
}
