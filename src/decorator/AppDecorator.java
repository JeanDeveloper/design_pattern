package decorator;

import decorator.Inteface.IAccount;
import decorator.Inteface.SavingAccount;
import decorator.Model.Account;

public class AppDecorator {

    Account c =  new Account(1, "JeanDeveloper");
    IAccount account = new SavingAccount();

    IAccount accountBlindadas = new BlindajeDecorator(account);

    //accountBlindadas.openAccount(c);

}
