package com.codedifferently;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GoFishTest {
    
@Test
public void goFishTest()
{
    //Given 
    CardGames cardGames = new CardGames();
    GoFish goFish = new GoFish();
    Player player = new Player();
    Dealer deal = new Dealer();
    ArrayList <Card> deckie =cardGames.dealerSetup(deal);
    player.setName("Tasha"); player.setMoney(1000.00); player.setBet(500.0);
    deal.takeBets(player);
    //When 
    goFish.goFish(player,deal);
    Integer expected = 1;
    Integer actual = player.cards.size();
    //Then 
    Assert.assertEquals(expected, actual);
}

    


}