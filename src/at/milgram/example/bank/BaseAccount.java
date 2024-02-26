package at.milgram.example.bank;

public class BaseAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
}
