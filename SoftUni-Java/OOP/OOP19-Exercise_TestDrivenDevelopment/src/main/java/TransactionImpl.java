public class TransactionImpl implements Comparable<TransactionImpl>, Transaction {

    private int id;
    private TransactionStatus status;
    private String from;
    private String to;
    private double amount;

    public TransactionImpl(int id, TransactionStatus status, String from, String to, double amount) {
        this.id = id;
        this.status = status;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @Override
    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    protected void setTo(String to) {
        this.to = to;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(TransactionImpl o) {
        return 0;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public TransactionStatus getStatus() {
        return status;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
