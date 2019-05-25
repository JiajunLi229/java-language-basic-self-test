package com.twc.javaBasic.Exercise.experimentOnFindFirst;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstTest {
    @Test
    void should_throw_if_the_input_is_null() {
        assertThrows(IllegalArgumentException.class, () -> FindFirstExperiment.getFirstFiveLongWords(null));
    }

    // TODO:
    //  In this test, we would like to do some experiment on streaming API. We would like to know
    //  the way that chained API calls are executed. You have to implement both the functional part
    //  as well as the testing part.
    @Test
    void should_filter_the_first_five_words_that_is_long_than_or_equal_to_5() {
        final String[] words = { "we", "would", "streaming", "know", "chained", "executed", "experiment", "implement"};

        // Hint, please open FindFirstExperiment.java
        String[] longWords = FindFirstExperiment.getFirstFiveLongWords(words);

        assertEquals(5, longWords.length);
        assertTrue(Arrays.stream(longWords).allMatch(w -> w.length() >= 5));
    }

    @Test
    void should_prove_how_many_times_a_filter_api_is_called() {
        final String[] arrayWith6LongWords = {
            "we", "would", "streaming", "know", "chained", "executed", "experiment", "implement"
        };

        // TODO:
        //  Please write a test to prove that how many times the `filter()` API will be called in
        //  above expression.
        // <--start-
        final Optional<String> finalResult = Arrays.stream(arrayWith6LongWords)
            .filter(w -> w.length() > 2)
            .skip(2)
            .limit(3)
            .findAny();

        fail("Please write a test");
        // --end-->
    }
}
