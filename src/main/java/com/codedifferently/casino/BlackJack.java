package com.codedifferently.casino;

import java.util.ArrayList;
import com.codedifferently.Card;
import com.codedifferently.CardGames;
import com.codedifferently.Dealer;
import com.codedifferently.Deck;
import com.codedifferently.Player;

public class BlackJack extends CardGames{

    public Dealer dealer = new Dealer();
    
    public ArrayList<Card> dealerSetup(Dealer deal)
    {
        ArrayList<Card> deck1 = deal.deck.getDeck();
        deal.deck.setDeck(deck1);
        deal.shuffle(deck1);  
        return deck1;  
    }

    public void hitMe(Player p1 , ArrayList <Card> deck, Dealer deal1)
    {
        deal1.deal(deck, p1);

    }

    public Boolean winningCondition(Player player,Deck deck,Dealer dealer)
    {
        int size =player.cards.size();
        int sum = 0;
        for(int i = 0; i<size; i++)
        {
            sum+=player.cards.get(i).getRank();
        }
        if(sum == 21)
        {
            return true;
        }
        return false;
    }
 
    public Boolean losingCondition(Player player, Deck deck, Dealer dealer)
    {
        int size =player.cards.size();
        int sum = 0;
        for(int i = 0; i<=size; i++)
        {
            sum+=player.cards.get(i).getRank();
        }
        if(sum >21)
        {
            return true;
        }
        return false;
    }

}
