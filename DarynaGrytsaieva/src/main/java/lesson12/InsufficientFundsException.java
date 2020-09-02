package lesson12;

public class InsufficientFundsException extends Exception {
    private double missingAmount;

    public InsufficientFundsException(double missingAmount) {
        this.missingAmount = missingAmount;
    }

    public double getMissingAmount() {
        return missingAmount;
    }
}
