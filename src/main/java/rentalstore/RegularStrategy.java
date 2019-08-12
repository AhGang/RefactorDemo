package rentalstore;

public class RegularStrategy extends PriceStrategy{

    @Override
    public double getAmount(int dayRented) {
        double thisAmount = 2;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
