package tenth_task;

public class Transactions {
    java.util.Date date;
    char type;
    double amount, balance;
    String description;

    public Transactions(char type, double amount, double balance, String desciption) {
        this.amount = amount;
        this.balance = balance;
        this.description = desciption;
        this.type = type;
        this.date = new java.util.Date();
    }

    public void tostring() {
        System.out
                .println("type:" + this.type + " Date:" + date + " amount:" + this.amount + " balance:" + this.balance);
    }
}
