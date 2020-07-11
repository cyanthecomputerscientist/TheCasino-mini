package com.codedifferently;
import java.util.ArrayList;

public class Dealer {
    Player player = new Player();
    public ArrayList<Player> bets = new ArrayList<Player>();
    public Deck deck = new Deck();
    

    public void deal(ArrayList<Card> deck,Player player)
    {
        Integer size = bets.size();
        for(int i = 0; i<size; i++)
        {
            Card card = deck.get(0);
            player.cards.add(card);
            deck.remove(0);
        }
    }
    public void takeBets(Player player)
    {
        bets.add(player);
    }


    
}