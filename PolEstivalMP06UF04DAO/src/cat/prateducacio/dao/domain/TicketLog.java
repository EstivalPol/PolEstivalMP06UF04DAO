package cat.prateducacio.dao.domain;

public class TicketLog extends Ticket {

    private String application;

    public TicketLog() {
    }

    public TicketLog(long id, String title, String application) {
        super(id, title);
        this.application = application;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String toString() {
        return "TicketLog{id=" + getId() + ", title=" + getTitle() + ", application=" + application + "}";
    }
}



