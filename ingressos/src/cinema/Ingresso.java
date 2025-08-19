package cinema;
public sealed abstract class Ingresso permits IngressoMeia, IngressoFamilia, IngressoInteira {
    
    protected double price = 30; 
    protected String movie; 
    protected String language;
    protected String ticketType;
    protected int person;

    public String getMovie() {
        return movie;
    }
    
    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public abstract double getPrice();
}
