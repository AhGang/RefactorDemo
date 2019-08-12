package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title,int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public double getMovieType(int dayRented) {
        double thisAmount = 0;

        switch (this.getPriceCode()) {
            case Movie.REGULAR:
                return new RegularStrategy().getAmount(dayRented);
            case Movie.NEW_RELEASE:
                return new NewReleaseStrategy().getAmount(dayRented);
            case Movie.CHILDRENS:
                return new ChildrenStrategy().getAmount(dayRented);
        }
        return thisAmount;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
}
