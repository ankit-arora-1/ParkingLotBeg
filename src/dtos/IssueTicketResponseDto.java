package dtos;

import models.Ticket;
import models.Vehicle;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String failureReason;

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}
