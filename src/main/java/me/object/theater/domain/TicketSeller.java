package me.object.theater.domain;

public class TicketSeller {

	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}

	public void sellTo(Audience audience) {
		if (audience.getBag().hasInvitation()) { // 초대장이 있는 경우
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().setTicket(ticket);
		} else { // 초대장이 없는 경우. 티켓을 판매해야 한다.
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			ticketOffice.plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
		}
	}
}
