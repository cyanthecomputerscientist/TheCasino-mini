package com.codedifferently.casino;

import java.util.ArrayList;
import com.codedifferently.Card;
import com.codedifferently.Dealer;
import com.codedifferently.Player;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {
    
    @Test
    public void hitMeTest()
    {
        //Given
        Player p = new Player();
        Dealer d = new Dealer();
        BlackJack blackJack = new BlackJack();
        p.setName("Shelly");
        p.setMoney(1000.00);
        p.setBet(200.00);
        ArrayList<Card> deckie =blackJack.dealerSetup(d);
        d.takeBets(p);
        //When 
        blackJack.hitMe(p, deckie, d);
        Integer actual = p.cards.size();
        Integer expected = 1;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void winningConditionTest()
    {
        //Given
        Player p = new Player();
        BlackJack blackJack = new BlackJack();
        Dealer d = new Dealer();
        p.setName("Monica");
        p.setMoney(1000.00);
        p.setBet(500.00);
        d.takeBets(p);
        Card card1 = new Card();
        card1.setRank(1);
        card1.setSuit(1);
        Card card2 = new Card();
        card2.setRank(10);
        card2.setSuit(1);
        Card card3 = new Card();
        card3.setRank(10);
        card3.setSuit(2);
        p.cards.add(card1);
        p.cards.add(card2);
        p.cards.add(card3);
        //When
        Boolean actual = blackJack.winningCondition(p, d.deck, d);
        Boolean expected  = true; 
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void losingConditionTest()
    {
        //Given
        Player p = new Player();
        BlackJack blackJack = new BlackJack();
        Dealer d = new Dealer();
        p.setName("Monica");
        p.setMoney(1000.00);
        p.setBet(500.00);
        d.takeBets(p);
        Card card1 = new Card();
        card1.setRank(1);
        card1.setSuit(1);
        Card card2 = new Card();
        card2.setRank(11);
        card2.setSuit(1);
        Card card3 = new Card();
        card3.setRank(10);
        card3.setSuit(2);
        p.cards.add(card1);
        p.cards.add(card2);
        p.cards.add(card3);
        //When
        Boolean actual = blackJack.loosingCondition(p, d.deck, d);
        Boolean expected  = true; 
        //Then 
        Assert.assertEquals(expected, actual);
    }

    

}