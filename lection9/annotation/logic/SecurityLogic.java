package com.itea.dimka.lection9.annotation.logic;

import com.itea.dimka.lection9.annotation.SecurityLevelEnum;

import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum levelEnum, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for (Object arg : args) {
            argsString.append(arg.toString()).append(" :");
        }

        argsString.setLength(argsString.length() - 1);
        System.out.printf("Method %S was invoked with parameters : %s",
                method.getName(), argsString);
        switch (levelEnum) {
            case LOW:
                System.out.println("Низкий уровень проверки безопасности : " + levelEnum);
                break;
            case NORMAL:
                System.out.println("Обычный уровень проверки безопасности : " + levelEnum);
                break;
            case HIGHT:
                System.out.println("Высокий уровень проверки безопасности : " + levelEnum);
                break;
        }
    }
}
