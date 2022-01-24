package com.itea.dimka.lection9.run;

import com.itea.dimka.lection9.accountlogic.AccountOperationManager;
import com.itea.dimka.lection9.accountlogic.AccountOperationManagerImpl;
import com.itea.dimka.lection9.annotation.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336,6);
        securityAccount.withdraw(64092376,2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376,300);
    }
}
