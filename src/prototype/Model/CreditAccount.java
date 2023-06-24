package prototype.Model;

import prototype.Interface.IAccount;

public class CreditAccount implements IAccount {

    private String type;
    private double amount;

    public CreditAccount(){
        type = "Credito";
    }

    @Override
    public IAccount clone() {
        CreditAccount account = null;
        account = (CreditAccount) clone();
        return account;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
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
