package com.itea.dimka.lection9.accountlogic;

import com.itea.dimka.lection9.annotation.BankingAnnotation;
import com.itea.dimka.lection9.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl implements AccountOperationManager{
    @Override
    @BankingAnnotation(secutrityLevel = SecurityLevelEnum.HIGHT)
    public double depositInCash(int accountNumber, int amount) {
        return 0;
    }

    @Override
    @BankingAnnotation(secutrityLevel = SecurityLevelEnum.HIGHT)
    public boolean withdraw(int accountNumber, int amount) {
        return true;
    }

    @Override
    @BankingAnnotation(secutrityLevel = SecurityLevelEnum.LOW)
    public boolean convert(double amount) {
        return true;
    }

    @Override
    @BankingAnnotation
    public boolean transfer(int accountNumber, double amount) {
        return true;
    }
}
