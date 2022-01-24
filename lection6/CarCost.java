package com.itea.dimka.lection6;

public abstract class CarCost {

    public double countPrimeCost(){
        return 50000.0;
    }

    /**
     * Вычисление стоимости перевозки
     * @param Country - страна
     * @return - стоимость перевозки
     */
    public abstract double countTransoprationCosts(String Country);

    /**
     * Вычисление стоимости автомобиля в салонах продаж
     * @return - окончательная цена автомобиля в определенной стране
     */
    public abstract double countLocaleCost();
}
