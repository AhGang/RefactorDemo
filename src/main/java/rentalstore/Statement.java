package rentalstore;

public abstract class Statement {
    public String statement(Customer customer){
        String result = getHeader(customer);

        result += getBody(customer);

        result += getFooter(customer);
        return result;
    }

    protected abstract String getFooter(Customer customer);

    protected abstract String getBody(Customer customer);

    protected abstract String getHeader(Customer customer);
}
