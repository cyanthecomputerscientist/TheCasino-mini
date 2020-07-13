package com.codedifferently;
import java.util.ArrayList;



public class CardGames {
    
    public Player player = new  Player();
    public Deck deck = new Deck();
    public Dealer dealer = new Dealer();

    public ArrayList<Card> dealerSetup(Dealer deal)
    {
        ArrayList<Card> deck1 = deal.deck.getDeck();
        deal.deck.setDeck(deck1);
        deal.shuffle(deck1);  
        return deck1;  
    }

    public void addPlayers(Player p1)
    {
        dealer.takeBets(p1);
    }

    public Boolean winningCondition(Player player,Deck deck, Dealer dealer)
    {
        
        return true;
    }

    public Boolean loosingCondition(Player player, Deck deck, Dealer dealer)
    {
      
        return true;
    }
}