import prototype.Model.SavingAccount;

public class AppPrototype {

    public static void main(String[] args) {
        SavingAccount cuentaAhorro = new SavingAccount();
        cuentaAhorro.setAmount(200);
        SavingAccount cuentaClonada = (SavingAccount) cuentaAhorro.clone();

        if(cuentaClonada != null){
            System.out.println(cuentaClonada);
        }

        System.out.println(cuentaClonada == cuentaAhorro);



    }


}
