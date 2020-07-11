package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CardGamesTest {
    @Test
    public void winningConditionTest()
    {
        //Given 
        CardGames cardGames = new CardGames();
      
        //When 
        Boolean expected = true;
        Boolean actual = cardGames.winningCondition(cardGames.player, cardGames.deck, cardGames.dealer);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void losingConditionTest()
    {
        //Given 
        CardGames cardGames = new CardGames();
        //When 
        Boolean actual = cardGames.winningCondition(cardGames.player, cardGames.deck, cardGames.dealer);
        Boolean expected = true;
        //Then
        Assert.assertEquals(expected, actual);
    }
    
}