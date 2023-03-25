package me.object.theater.domain;

public class TicketSeller {

	private TicketOffice ticketOffice; // 자신이 일하는 매표소를 알고 있어야 한다.

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public void sellTo(Audience audience) {
		ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
	}
}
