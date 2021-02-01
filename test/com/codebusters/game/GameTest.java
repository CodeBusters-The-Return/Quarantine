package com.codebusters.game;

import com.codebusters.data.ChapterBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class GameTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void promptPlayerWhenInvalidCommandIsEntered() {

       assertEquals("enter store", TextParser.validInput());

    @Test
    public void testAddingItemsToInventory(){
        ArrayList<Items> inventory = new ArrayList<Items>();
        inventory.add("matches");
        inventory.add("water");
        inventory.add("water");
        assertEquals(inventory, Game.updateInventory(new String[] { "matches", "water", "water" }));
    }

    @Test
    public void testRemovingItemsFromInventory() {
        ArrayList<Items> inventory = new ArrayList<Items>();
        inventory.remove("matches");
        inventory.remove("water");
        inventory.remove("water");
        assertEquals(inventory, Game.updateInventory(new String[] {""}));
    }

    @Test
    public void testFindingItemsInInventory() {
        ArrayList<Items> inventory = new ArrayList<Integer>();
        items.toFind("");
        assertTrue(inventory, Game.findItemInInventory());
    }

}