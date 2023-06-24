package decorator.Inteface;

import decorator.Model.Account;

public class SavingAccount implements IAccount{


    @Override
    public void openAccount(Account account) {
        System.out.println("===============");
        System.out.println("Se abrió una cuenta de ahorros");
        System.out.println(account.getClient());
        System.out.println("===============");
    }
}
