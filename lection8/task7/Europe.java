package com.itea.dimka.lection8.task7;

import java.util.ArrayList;

public class Europe {
    private static ArrayList<Changing> changings = new ArrayList<>();

    public Europe() {
        changings.add(new Changing("1991-12-26", "End of USSR"));
        changings.add(new Changing("1991-09-25", "Yugoslavia -> Slovenia, Croatia"));
        changings.add(new Changing("1991-09-08", "Yugoslavia -> Makedonia"));
    }

    public void printChanging(){
        for (Changing changing : changings)
            System.out.println(changing.Action + " - " + changing.date);
    }

    private class Changing{
        private String date;
        private String Action;

        public Changing(String date, String action) {
            this.date = date;
            Action = action;
        }
    }
}
