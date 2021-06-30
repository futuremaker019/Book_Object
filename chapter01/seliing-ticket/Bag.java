public class Bag {
    private Long amount;
    private Inviation inviation;
    private Ticket ticket;

    public boolean hasInvitation() {
        return inviation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Bag(Long amount) {
        this.amount = amount;
    }

    public Bag(Long amount, Inviation inviation) {
        this.amount = amount;
        this.inviation = inviation;
    }
}
