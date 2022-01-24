package com.itea.dimka.lection10.homeTask;


public class LogInF {
    public static void main(String[] args) {
        String login = "juhijh";
        String password = "sdg54545645";
        String confirmPassword = "sdbg54545645";
        try {
            System.out.println(logIn(login, password, confirmPassword));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    private static boolean logIn(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean flag=true;
        if (login.length() > 20) {
            throw new WrongLoginException("login must be < 20 characters!");
        }

        if (!login.matches("[a-zA-z_0-9]*")) {
            throw new WrongLoginException("login must containe characters [a-zA-z_0-9]!");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Password must be < 20 characters!");
        }

        if (!password.matches("[a-zA-z_0-9]*")) {
            throw new WrongLoginException("login must containe characters [a-zA-z_0-9]!");
        }

        if(!password.equals(confirmPassword))
        {
            throw  new WrongPasswordException("Password and Confirm PAssword are't equals!");
        }
        return flag;
    }
}
