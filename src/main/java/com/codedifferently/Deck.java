package com.codedifferently;

import java.util.ArrayList;
public class Deck {
    
    public ArrayList<Card> deck = new ArrayList <Card> ();

    public ArrayList<Card> getDeck()
    {
        return this.deck;
    }

    public void setDeck(ArrayList<Card> deck)
    {
        Integer suit = 4; 
        Integer rank = 13;
        for(int i = 0; i<suit; i++)
        {
            for(int j =0; j<rank; j++)
            {
                Card card = new Card();
                card.setSuit(i);
                card.setRank(j);
                deck.add(card);
                
            }
        }
    }
    
    

}