/**
 * Name: Lianne Campbell
 * Project: Java QAP 2
 * Date: 5/28/2024
 * The Money class models an amount of money with dollars and cents.
 */
public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) Math.round((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Method to add another Money object to this Money object
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // Method to subtract another Money object from this Money object
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // Method to compare this Money object with another Money object
    public int compareTo(Money otherObject) {
        return Long.compare(this.toCents(), otherObject.toCents());
    }

    // Method to check if this Money object is equal to another Money object
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // Method to convert this Money object to a String
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // Helper method to convert the amount to cents
    private long toCents() {
        return dollars * 100 + cents;
    }
}