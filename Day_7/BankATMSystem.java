public class BankATMSystem {

    private double account_balance = 1000;

    public synchronized void withdraw_amount(double amount, String user) {

        if(amount > account_balance) {

            System.out.println(user + " attempted to withdraw " + amount + " - Insufficient Balance: " + account_balance);

        }else {

            System.out.println(user + " is withdrawing " + amount);
            account_balance = account_balance - amount;
            System.out.println("Transaction Successful. Balance: " + account_balance);

        }
    }

    public double getbalance() {

        return account_balance;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BankATMSystem bankaccount = new BankATMSystem();

        Thread t1 = new Thread(
                () -> {
                    bankaccount.withdraw_amount(20, "Revathi");
                }
        );

        Thread t2 = new Thread(
                () -> {
                    bankaccount.withdraw_amount(90, "Reva");
                }
        );

        t1.start();



        try {

            t1.join();
            t2.join();

        }catch(InterruptedException e) {

            e.printStackTrace();

        }
        t2.start();
        System.out.println("Final Balance: " + bankaccount.getbalance());
    }


}


