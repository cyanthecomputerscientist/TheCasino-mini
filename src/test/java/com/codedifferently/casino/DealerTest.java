package com.codedifferently.casino;

import java.util.ArrayList;

import com.Dealer;
import com.Player;
import com.codedifferently.Card;
import com.codedifferently.Deck;

import org.junit.Assert;
import org.junit.Test;
public class DealerTest {
    @Test
    public void dealTest()
    {
        //Given
        Dealer dealer = new Dealer();
        Player player = new Player(); 
        Deck deck1 = new Deck();
        ArrayList<Card> deck = deck1.getDeck();
        deck1.setDeck(deck);
        player.setName("Ari");
        player.setMoney(500.00);
        player.setBet(100.00);
        dealer.bets.add(player);
        //When 
        dealer.deal(deck, player);
        Integer expected = 51;
        Integer actual = deck.size();
        //Then
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void takeBetsTest()
    {
        //Given
        Dealer dealer  = new Dealer(); 
        Player player = new Player();
        player.setName("Chyna");
        player.setMoney(1000.00);
        player.setBet(500.00);
        //When 
        dealer.takeBets(player);
        Integer expected = 1;
        Integer actual = dealer.bets.size();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    
}