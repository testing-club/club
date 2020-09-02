package lesson12;

public class Bank {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(345234);
        checkingAccount.deposit(300);

        try {
            checkingAccount.withdraw(400);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry but you need another " + e.getMissingAmount());
        }

        System.out.println("Balance: " + checkingAccount.getBalance());
    }
}
