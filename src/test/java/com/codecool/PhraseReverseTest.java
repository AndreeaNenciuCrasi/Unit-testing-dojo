package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {
    private PhraseReverse phraseReverse;

    @BeforeEach
    void setUp() {
        phraseReverse =new PhraseReverse();
    }

    @Test
    void reverse() {
        assertEquals("detnemelpmi ton si tset sihT", phraseReverse.reverse("This test is not implemented"));
    }

    @Test
    void reverseWords() {
        assertEquals("sihT tset si ton detnemelpmi", phraseReverse.reverseWords("This test is not implemented"));
    }

    @Test
    void reverseWordOrder() {
        assertEquals("implemented not is test This", phraseReverse.reverseWordOrder("This test is not implemented"));
    }

    @Test
    void reverseN() {
        assertEquals("ecnetnes gnol eno si siht", phraseReverse.reverseN("this is one long sentence without punctuation",5));
        assertEquals("si tset sihT noitautcnup tuohtiw ecnetnes gnol eno si siht", phraseReverse.reverseN("this is one long sentence without punctuation This test is not implemented",10));
    }

    @Test
    void reverseArray() {
        String str1 = "this is one long sentence without punctuation This test is not implemented";
        String str2 = "implemented not is test This punctuation without sentence long one is this";
        String[] words1 = str1.split(" ");
        String[] expected =str2.split(" ");
        String[] result = phraseReverse.reverseArray(words1);
        assertArrayEquals(expected, result);
    }

    @Test
    void join() {
        String expected = "this is one long sentence without punctuation This test is not implemented";
        String[] words = {"this", "is", "one", "long", "sentence", "without", "punctuation", "This", "test", "is", "not", "implemented"};
        String result = phraseReverse.join(words, " ");
        assertEquals(expected, result);

    }
}