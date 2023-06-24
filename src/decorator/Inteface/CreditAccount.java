package decorator.Inteface;

import decorator.Model.Account;

public class CreditAccount implements IAccount{

    @Override
    public void openAccount(Account account) {
        System.out.println("===============");
        System.out.println("Se abrió una cuenta de CREDITO");
        System.out.println(account.getClient());
        System.out.println("===============");
    }
}
