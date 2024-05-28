/**
 * The CreditCard class models a credit card with an owner, balance, and credit
 * limit.
 */
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0);
    }

    // Accessor method to get the balance
    public Money getBalance() {
        return new Money(balance);
    }

    // Accessor method to get the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Accessor method to get the owner's information
    public String getPersonals() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}