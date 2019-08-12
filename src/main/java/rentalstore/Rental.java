package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    double getThisAmount() {
        return movie.getMovieType(getDayRented());
    }

    String showFiguresForRental(String result, double thisAmount) {
        result += "\t" + getMovie().getTitle() + "\t" + thisAmount + "\n";
        return result;
    }

    int getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            return 2;
        }
        return 1;
    }

    public String showHTMLFiguresForRental(String result, double thisAmount) {
        result += getMovie().getTitle() + ": " + thisAmount + "<BR>\n";
        return result;
    }
}
