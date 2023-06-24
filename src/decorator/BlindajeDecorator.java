package decorator;
import decorator.Inteface.IAccount;
import decorator.Model.Account;

public class BlindajeDecorator extends DecoratorAccount{

    public BlindajeDecorator(IAccount accountDecorada) {
        super(accountDecorada);
    }

    @Override
    public void openAccount(Account account) {
        //accountDecorada.openAccount(account);
        addBlindaje(account);
    }

    public void addBlindaje(Account account){
        System.out.println(" Se agregó un blindaje a la cuenta " + account.getClient());
    }
}
