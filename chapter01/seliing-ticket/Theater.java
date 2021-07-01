public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 극장에 입장하는 메서드
    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
