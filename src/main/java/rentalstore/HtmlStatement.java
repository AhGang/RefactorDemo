package rentalstore;

public class HtmlStatement extends Statement{

    public String getFooter(Customer customer) {
        String footer = "";
        footer += "<P>You owe<EM>" + customer.getTotalAmount() + "</EM><P>\n";
        footer += "On this rental you earned <EM>" + customer.getFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
        return footer;
    }

    public String getBody(Customer customer) {
        String body = "";
        for (Rental each : customer.getRentals()) {
            double thisAmount = each.getThisAmount();
            body = each.showHTMLFiguresForRental(body, thisAmount);
        }
        return body;
    }

    public String getHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
