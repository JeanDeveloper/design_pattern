package prototype.Model;

import prototype.Interface.IAccount;

public class SavingAccount implements IAccount {

    private String type;
    private double amount;

    public SavingAccount(){
        type = "Ahorros";
    }

    @Override
    public IAccount clone() {

        SavingAccount account = null;
        account = (SavingAccount) clone();

        return account;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
