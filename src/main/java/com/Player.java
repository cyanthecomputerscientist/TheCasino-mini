package com;
import com.codedifferently.Card;
import java.util.ArrayList;

public class Player {
    private String name; 
    private Double money;
    private Double bet;
   public ArrayList<Card> cards = new ArrayList<Card> ();

    public String getname()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name; 
    }
    public void setMoney(Double mon)
    {
        this.money = mon;
    }
    public Double getMoney()
    {
        return this.money;
    }
    
    public Double winMoney(Double bet)
    {
        Double casinoRate = 2.0;
        Double win = bet * casinoRate;
        this.money+=win;
        return win;
    }

    public void setBet(Double bet)
    {
        this.money -= bet;
        this.bet = bet;
    }

    public Double getBet()
    {
        return bet;
    }
}