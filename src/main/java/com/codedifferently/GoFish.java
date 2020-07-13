package com.codedifferently;

import java.util.ArrayList;

public class GoFish extends CardGames {
    
    Dealer dealer = new Dealer();
    CardGames cardGames = new CardGames();
    ArrayList <Card> deck = cardGames.dealerSetup(dealer);


    
    public void goFish(Player player, Dealer dealer)
    {
        dealer.deal(deck, player);

    }

    public Boolean winningCondition(Player player, Deck deck,Dealer dealer )
    {
        return true; 
    }

    public Boolean loosingCondition(Player player, Deck deck,Dealer dealer )
    {
        return true; 
    }
}