package cat.prateducacio.dao.domain;

public class TicketUser extends Ticket {

    private String mail;

    public TicketUser() {
    }

    public TicketUser(long id, String title, String mail) {
        super(id, title);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString() {
        return "TicketUser{id=" + getId() + ", title=" + getTitle() + ", mail=" + mail + "}";
    }
}
