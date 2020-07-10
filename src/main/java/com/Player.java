package com;

public class Player {
    
    private Double money;
    public Double bet;

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