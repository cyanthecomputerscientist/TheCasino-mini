package com.codedifferently.casino;
import java.util.ArrayList;
import org.junit.Assert;
import com.codedifferently.Deck;
import com.codedifferently.Card;
import org.junit.Test;

public class DeckTest{

    @Test
    public void getDeckTest()
    {
        //Given
        Deck deckTest = new Deck();
        ArrayList <Card> expected = deckTest.deck;
        //When 
        ArrayList <Card> actual = deckTest.getDeck();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setDeckTest()
    {
        //Given
        Deck deckTest = new Deck();
        Integer expected = 52;
        ArrayList <Card> deck = deckTest.getDeck();
        //when 
        deckTest.setDeck(deck);
        Integer actual = deck.size();
        //then
        Assert.assertEquals(expected, actual);
    }
    
}