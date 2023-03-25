package me.object.theater;

import me.object.theater.domain.Audience;
import me.object.theater.domain.Ticket;
import me.object.theater.domain.TicketSeller;

public class Theater {

	private TicketSeller ticketSeller;

	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}
}
