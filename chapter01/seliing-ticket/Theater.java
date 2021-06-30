public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 극장에 입장하는 메서드
    public void enter(Audience audience){
        // 관객이 초대장을 가지고 있다면
        if (audience.getBag().hasInvitation()){
            // 판매원이 초대장과 교환한 티켓이 관객의 가방에 들어간다.
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        // 관객이 초대장을 가지고 있지 않다면
        } else {
            // 관객은 판매원에개 티켓을 구매하여 가방에 집어넣는다.
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
