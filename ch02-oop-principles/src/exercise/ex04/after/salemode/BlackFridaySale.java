package exercise.ex04.after.salemode;

public class BlackFridaySale extends DiscountMode {
    @Override
    public double getDiscountRate() {
        return 0.5;
    }
}