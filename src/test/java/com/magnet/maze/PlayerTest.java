package com.magnet.maze;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import static org.junit.Assert.*;


public class PlayerTest {
    Map tMap = new Map();
    Player tPlayer = new Player();
    //Maze tMaze = new Maze();

    @Before
    public void setUp() {
        System.out.println("setup");
    }

    @After
    public void finish() {
        System.out.println("finish");
    }

    @Test
    public void testGetPlayer() throws Exception {
        /*
        int a = 1, b =2, expected = 4;
        int actual = a + b;
        assertEquals(expected, actual);
        */
        System.out.println("testgetplayer");
    }

    @Test
    public void testGetTileX() throws Exception {
        tPlayer.setTileX(5);
        tPlayer.setTileY(6);
        tPlayer.move(1,0);
        assertEquals(tPlayer.getTileX(),tPlayer.getTileY());
        System.out.println("tileX = "+tPlayer.getTileX());
    }

    @Test
    public void testGetTileY() throws Exception {
        System.out.println("testgety");
    }

    @Test
    public void testSetTileX() throws Exception {
    }

    @Test
    public void testSetTileY() throws Exception {
    }

    @Test
    public void testMove() throws Exception {
    }
}
