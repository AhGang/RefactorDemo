package rentalstore;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Customer {
    private String name;

    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
       return  new TextStatement().statement(this);
    }

    public String htmlStatement() {
        return  new HtmlStatement().statement(this);
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for(Rental rental : this.rentals){
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getThisAmount).sum();
    }

}
