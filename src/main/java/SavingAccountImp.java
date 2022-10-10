public class SavingAccountImp {
    public static void main (String[]args){
        SavingAccount savingaccount=new SavingAccount();
        savingaccount.display();
        savingaccount.withdrawCash(2000);
        savingaccount.depositCash(1000);

    }

}
