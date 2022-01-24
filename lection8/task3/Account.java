package com.itea.dimka.lection8.task3;

import com.itea.dimka.lection8.task1.Notepad;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private final ArrayList<Action> entries = new ArrayList<>();
    private int idAccount;
    private static int addCash=1;

    private class Action {
        private String action;
        private int idAccount;
        private double cash;

        public Action(String action, int idAccount, double cash) {
            this.action = action;
            this.idAccount = idAccount;
            this.cash = cash;
            addCash++;
        }

        @Override
        public String toString() {
            return "ID - " + idAccount + "\n Operation - " + action + "\n" +
                    "Cash - " + cash + "\n";
        }
    }

    public void addAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. снятие");
        System.out.println("2. платежи");
        System.out.println("3. поступления");
        System.out.println("4. завершить операции");
        System.out.print("Ваш выбор: ");
        int flag = scanner.nextInt();
        while (flag != 4) {
            newEntry(flag);
            System.out.print("Ваш выбор: ");
            flag = scanner.nextInt();
        }
    }

    private void newEntry(int flag) {
        switch (flag) {
            case 1:
                entries.add(new Action("снятие", 101, 23.0*addCash));
                break;
            case 2:
                entries.add(new Action("платежи", 101, 23.0+addCash));
                break;
            case 3:
                entries.add(new Action("поступления", 101, 23.0+addCash+26));
                break;
            default:
                break;
        }
        System.out.println("Added!");
    }

    @Override
    public String toString() {
        return entries.toString();
    }
}
