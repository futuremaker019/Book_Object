public class TicketSeller {
    // 자신이 일하는 매표소(ticketOffice)를 알고 있어야 한다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
