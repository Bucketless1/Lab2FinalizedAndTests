package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void countSymbols_NullInput_ReturnsZero() {
        int result = TextCounter.countSymbols(null);
        assertEquals(0, result);
    }

    @Test
    public void countSymbols_EmptyInput_ReturnsZero() {
        int result = TextCounter.countSymbols("");
        assertEquals(0, result);
    }

    @Test
    public void countSymbols_ValidInput_ReturnsCorrectCount() {
        int result = TextCounter.countSymbols("Hello, World!");
        assertEquals(13, result);
    }

    @Test
    public void countWords_NullInput_ReturnsZero() {
        int result = TextCounter.countWords(null);
        assertEquals(0, result);
    }

    @Test
    public void countWords_EmptyInput_ReturnsZero() {
        int result = TextCounter.countWords("");
        assertEquals(0, result);
    }

    @Test
    public void countWords_ValidInput_ReturnsCorrectCount() {
        int result = TextCounter.countWords("This is a test sentence.");
        assertEquals(5, result);
    }
}