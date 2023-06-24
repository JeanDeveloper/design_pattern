package decorator;

import decorator.Inteface.IAccount;
import decorator.Model.Account;

public abstract class DecoratorAccount implements IAccount {

    protected IAccount cuentaDecorada;
    public DecoratorAccount(IAccount account){
        this.cuentaDecorada = account;
    }

    @Override
    public void openAccount(Account account) {
        this.cuentaDecorada.openAccount(account);
    }
}
