package lesson12;

public class CheckingAccount {
    private int number;
    private double balance;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount<=balance){
            balance -=amount;
        }else {
            double missing = amount-balance;
            throw new InsufficientFundsException(missing);
        }
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
