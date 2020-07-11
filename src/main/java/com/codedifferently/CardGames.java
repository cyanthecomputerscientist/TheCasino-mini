package com.codedifferently;


public class CardGames {
    
    public Player player = new  Player();
    public Deck deck = new Deck();
    public Dealer dealer = new Dealer();

    public Boolean winningCondition(Player player,Deck deck, Dealer dealer)
    {

        return true;
    }

    public Boolean loosingCondition(Player player, Deck deck, Dealer dealer)
    {
        return true;
    }
}