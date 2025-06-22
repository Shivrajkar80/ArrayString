class BankAccount {
    String name;
    double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient balance");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Shivraj", 1000);
        acc.display();
        acc.deposit(500);
        acc.withdraw(200);
        acc.display();
    }
}
