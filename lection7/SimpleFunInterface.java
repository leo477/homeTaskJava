package com.itea.dimka.lection7;

@FunctionalInterface
public interface SimpleFunInterface {
    public void doWork();

    default void doWork3() {

    }
}
