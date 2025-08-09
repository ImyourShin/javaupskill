/*
 * 
 * 3. NoDiscountPolicy class
 * This class implements the DiscountPolicy interface and provides a method to apply no discount to an amount.
 */
public class NoDiscountPolicy implements DiscountPolicy {
    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must not be negative");
        }
        return amount; 
    }

    @Override
    public String toString() {
        return "No Discount";
    }
}
