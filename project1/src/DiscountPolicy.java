/*
 * DiscountPolicy Interface
 */

public interface DiscountPolicy {
    /*
     * @param amount the original amount before discount
     * @return the amount after applying the discount
     */
    double applyDiscount(double amount);
}
