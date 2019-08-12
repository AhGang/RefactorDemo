package rentalstore;

public class NewReleaseStrategy extends PriceStrategy{
    @Override
    public double getAmount(int dayRented) {
        return dayRented * 3;
    }
}
