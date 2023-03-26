package me.object.theater.domain;

public class Bag {

	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Bag(long amount) {
		this(null, amount); // 이벤트 미당첨 : 현금
	}

	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}

	private boolean hasInvitation() {
		return invitation != null;
	}

	private void setTicket(Ticket ticket) {
		// 초대장을 티켓으로 교환한다
		this.ticket = ticket;
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
}
