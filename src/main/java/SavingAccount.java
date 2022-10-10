public class SavingAccount {
    long accountNumber = 885522769;
    String accountHolderName = "Sam";
    long accountBalance = 5000;
    String accountStatus = "Active";
    long amountAfterWithdraw;
    long remainingBalance;

    void withdrawCash(long withdrawAmount) {
        if (accountBalance > withdrawAmount)
            remainingBalance = accountBalance - withdrawAmount;
        System.out.println("Withdraw Amount :-  "+withdrawAmount);
        System.out.println("Balance After Withdraw:- " + remainingBalance);

    }

    void depositCash(long depositAmount) {
        remainingBalance = remainingBalance + depositAmount;
        System.out.println("Deposit Amount:-  " +depositAmount);
        System.out.println("Balance After Deposit :-  " + remainingBalance);
    }

    void display() {
        System.out.println("Account Number:-  " + accountNumber);
        System.out.println("Account Holder Name:-  " + accountHolderName);
        System.out.println("Account Balance:-  " + accountBalance);
        System.out.println("Account Status:-  " + accountStatus);
    }
}

