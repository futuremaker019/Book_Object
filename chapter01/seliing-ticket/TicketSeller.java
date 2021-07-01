public class TicketSeller {
    // 자신이 일하는 매표소(ticketOffice)를 알고 있어야 한다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // TicketSeller 클래스에서 getTicketOffice 메서드가 사라진다.
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience){
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
