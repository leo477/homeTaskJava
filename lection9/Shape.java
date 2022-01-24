package com.itea.dimka.lection9;

public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE, NEW;

    public double defineSquare(double... x) {
        switch (this) {
            case RECTANGLE:
                return x[0] * x[1];
            case TRIANGLE:
                return x[0] * x[1] / 2;
            case CIRCLE:
                return Math.pow(x[0], 2) * Math.PI;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

    public double defineSquare2(double... x) {
        return switch (this) {
            case CIRCLE -> Math.pow(x[0], 2) * Math.PI;
            case TRIANGLE -> x[0] * x[1] / 2;
            case RECTANGLE -> x[0] * x[1];
            default -> throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        };

        //return result;
    }
}
