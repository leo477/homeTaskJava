package com.itea.dimka.lection8.task8;

import java.util.ArrayList;

public class City {
private Info info;
    public City() {
        info = new Info("BestCity");
    }

    public void printInfo() {
        System.out.println("Streets of " + info.name + ": ");
        for (Info.Street street : info.getStreets())
            System.out.println(street.name + " begin: " + street.firstNumber+ " end: " + street.lastNumber);

            System.out.println("Avenues : ");
        for(Info.Avenue avenue : info.getAvenues())
            System.out.println(avenue.name + " begin: " + avenue.firstNumber + " end: " + avenue.lastNumber);

            System.out.println("Squares : ");
        for (Info.Square square : info.getSquares())
            System.out.println(square.name);
    }

    private static class Info {

        private ArrayList<Street> streets;
        private ArrayList<Square> squares;
        private ArrayList<Avenue> avenues;

        public ArrayList<Street> getStreets() {
            return streets;
        }

        public ArrayList<Square> getSquares() {
            return squares;
        }

        public ArrayList<Avenue> getAvenues() {
            return avenues;
        }

        private String name;

        private void addStreet() {
            streets = new ArrayList<>();
            Street street = new Street();
            street.name = "Street1";
            street.firstNumber = 1;
            street.lastNumber = 48;
            streets.add(street);
            street = new Street();
            street.name = "Street2";
            street.firstNumber = 1;
            street.lastNumber = 48;
            streets.add(street);
            street = new Street();
            street.name = "Street3";
            street.firstNumber = 1;
            street.lastNumber = 48;
            streets.add(street);
        }

        private void addAvenue() {
            avenues = new ArrayList<>();
            Avenue avenue = new Avenue();
            avenue.name = "Avenue1";
            avenue.firstNumber = 1;
            avenue.lastNumber = 48;
            avenues.add(avenue);
            avenue = new Avenue();
            avenue.name = "Avenue2";
            avenue.firstNumber = 1;
            avenue.lastNumber = 48;
            avenues.add(avenue);
            avenue = new Avenue();
            avenue.name = "Avenue3";
            avenue.firstNumber = 1;
            avenue.lastNumber = 48;
            avenues.add(avenue);
        }

        private void addSquare() {
            squares = new ArrayList<>();
            squares.add(new Square("Square1"));
            squares.add(new Square("Square2"));
        }

        public Info(String name) {
            this.name = name;
            addStreet();
            addAvenue();
            addSquare();
        }

        private class Street implements CityInfo {

            private String name;
            private int firstNumber;
            private int lastNumber;

            @Override
            public void setName(String name) {
                this.name = name;
            }

            @Override
            public void setFirstNumber(int firstNumber) {
                this.firstNumber = firstNumber;
            }

            @Override
            public void setLastNumber(int lastNumber) {
                this.lastNumber = lastNumber;
            }
        }

        private class Square {
            private String name;

            public Square(String name) {
                this.name = name;
            }
        }

        private class Avenue implements CityInfo {
            private String name;
            private int firstNumber;
            private int lastNumber;

            @Override
            public void setName(String name) {
                this.name = name;
            }

            @Override
            public void setFirstNumber(int firstNumber) {
                this.firstNumber = firstNumber;
            }

            @Override
            public void setLastNumber(int lastNumber) {
                this.lastNumber = lastNumber;
            }
        }
    }
}
