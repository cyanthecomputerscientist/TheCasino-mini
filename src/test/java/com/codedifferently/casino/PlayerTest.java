package com.codedifferently.casino;
import com.Player;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void setMoneyTest() 
    {
        //Given
        Player player  = new Player();
        Double expected = 500.00;
        //When 
        player.setMoney(expected);
        Double actual = player.getMoney();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getMoneyTest()
    {
      //Given
      Player player  = new Player();
      Double expected = 500.00;
      player.setMoney(expected);
      //When
      Double actual = player.getMoney();
      //Then 
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBetTest()
    {
        //Given
        Player player  = new Player();
        Double expected = 500.00;
        player.setMoney(2000.00);
        //when 
        player.setBet(expected);
        Double actual = player.getBet();
        //Then  
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void winMoneyTest()
    {
        //Given
        Player player  = new Player();
        Double expected = 500.00;
        player.setMoney(1000.00);
        player.setBet(250.00);
        // when
        Double actual =player.winMoney(250.00);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBetTest()
    {
        // Given 
        Player player = new Player();
        Double expected = 1000.0;
        player.setMoney(2000.00);
        player.setBet(expected);
        // when 
        Double actual = player.getBet();
        // Given 
        Assert.assertEquals(expected, actual);
        
    }
}