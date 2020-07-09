package com;
import com.codedifferently.Card;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void setSuitTest()
    {
        //Given 
        Card card = new Card();
        Integer expected = 3;
        //When 
        card.setSuit(expected);
        Integer actual = card.getSuit();
        //Then
        Assert.assertEquals(expected, actual);
      
    }
    @Test
    public void getSuitTest()
    {
        //Given 
        Card card = new Card();
        Integer expected = 2;
        card.setSuit(expected);
        //When
        Integer actual = card.getSuit();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getValueTest()
    {
        //Given
        Card card = new Card();
        Integer expected = 10;
        card.setValue(expected);
        //When
        Integer actual = card.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setValueTest()
    {
        //Given 
        Card card = new Card();
        Integer expected= 5;
        //When 
        card.setValue(expected);
        Integer actual = card.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }
    
}