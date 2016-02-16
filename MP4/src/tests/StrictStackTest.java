package tests;

import stack.StrictStack;

import static org.junit.Assert.*;

/**
 * Created by Wareus on 2016-02-16.
 */
public class StrictStackTest
{

    StrictStack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception
    {
        stack = new StrictStack<>();
    }

    @org.junit.After
    public void tearDown() throws Exception
    {

    }

    @org.junit.Test
    public void testPush() throws Exception
    {
        assertTrue(stack.isEmpty());
        stack.push("hej");
        assertEquals(stack.peek(), "hej");
    }

    @org.junit.Test
    public void testPop() throws Exception
    {
        stack.push("hej");
        assertFalse(stack.isEmpty());
        assertEquals(stack.pop(), "hej");
        assertTrue(stack.isEmpty());
    }

    @org.junit.Test
    public void testPeek() throws Exception
    {
        stack.push("hej");
        assertFalse(stack.isEmpty());
        assertEquals(stack.peek(), "hej");
        assertFalse(stack.isEmpty());
    }

    @org.junit.Test
    public void testIsEmpty() throws Exception
    {
        assertTrue(stack.isEmpty());
        stack.push("2");
        assertFalse(stack.isEmpty());
    }
}