package rentalstore;

public class TextStatement extends Statement {

    public String getFooter(Customer customer) {
        String footer = "";
        footer += "Amount owed is " + customer.getTotalAmount() + "\n";
        footer += "You earned " + customer.getFrequentRenterPoints() + " frequent renter points";
        return footer;
    }

    public String getBody(Customer customer) {
        String body = "";
        for (Rental each : customer.getRentals()) {
            double thisAmount = each.getThisAmount();
            body = each.showFiguresForRental(body, thisAmount);
        }
        return body;
    }

    public String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
