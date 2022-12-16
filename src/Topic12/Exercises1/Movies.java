/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises1;

/**
 *
 * @author simeonyav
 */
public class Movies {
    private String name;
    private float ticketPrice;
    private float budget;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        if(ticketPrice > 0) this.ticketPrice = ticketPrice;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        if(budget > 0) this.budget = budget;
    }
    
    public Movies() {
        ticketPrice = 1;
        budget = 1;
        name = "Default Name";
    }
    
    public Movies(String name, float budget, float ticketPrice) {
        this.name = name;
        this.budget = budget;
        this.ticketPrice = ticketPrice;
    }
    
    public Movies(Movies movie) {
        this(movie.getName(), movie.getBudget(), movie.getTicketPrice());
    }
    
    public boolean isTheMoviePerformedGood(int numberOfTickets) {
        return budget - (numberOfTickets * ticketPrice) > 0;
    }
    
    @Override
    public String toString() {
        return String.format(
                "The movie %s has price for its tickets equal to %f and a budget equals to %f",
                name,
                ticketPrice,
                budget
        );
    }
}
