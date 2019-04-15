package com.twc.javaBasic.Exercise.imageProcessing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ImageProcessorTest {
    // So many tests to help you debugging your program. I am so kind :-D.

    @Test
    void should_throw_if_image_is_null() {
        assertThrows(IllegalArgumentException.class, () -> GrayScaleImageProcessor.boxBlur(null));
    }

    @Test
    void should_calculate_box_blur() {
        final GrayScaleImage image = new GrayScaleImage(3, 3, new int[]{
            10, 20, 30,
            40, 50, 60,
            70, 80, 90
        });

        final GrayScaleImage processed = GrayScaleImageProcessor.boxBlur(image);

        assertArrayEquals(new int[] {30, 35, 40, 45, 50, 55, 60, 65, 70}, processed.getRaw());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 3001})
    void should_throw_if_dimension_is_incorrect(int width) {
        assertThrows(IllegalArgumentException.class, () -> {
            final int validHeight = 200;
            new GrayScaleImage(width, validHeight);
        });
    }

    @Test
    void should_throw_if_raw_data_contains_invalid_pixel() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new GrayScaleImage(2, 2, new int[] {-1, 20, 256, 1}));
    }

    @Test
    void should_get_pixel_of_the_image() {
        final GrayScaleImage image = new GrayScaleImage(2, 2, new int[]{1, 2, 3, 4});

        assertEquals(2, image.getPixel(0, 1));
        assertNull(image.getPixel(0, 3));
    }

    @Test
    void should_set_pixel_of_the_image() {
        final GrayScaleImage image = new GrayScaleImage(2, 2, new int[]{1, 2, 3, 4});

        image.setPixel(0, 1, 50);
        assertEquals(50, image.getPixel(0, 1));
    }

    @Test
    void should_throw_if_index_or_pixel_is_not_valid_when_set_pixel() {
        final GrayScaleImage image = new GrayScaleImage(2, 2, new int[]{1, 2, 3, 4});

        assertThrows(IllegalArgumentException.class, () -> {
            final int invalidIndex = -1;
            image.setPixel(invalidIndex, 0, 50);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            final int invalidPixel = 500;
            image.setPixel(0, 1, invalidPixel);
        });
    }

    @Test
    void should_iterate_over_image() {
        GrayScaleImage image = new GrayScaleImage(3, 2, new int[] {
            10, 20, 30,
            40, 50, 60
        });

        final Iterator<ThreePlusThreeSubImage> iterator = image.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                null, null, null,null, 10, 20,null, 40, 50,
                0, 0),
            iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                null, null, null, 10, 20, 30, 40, 50, 60,
                0, 1
            ),
            iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                null, null, null, 20, 30, null, 50, 60, null,
                0, 2
            ),
            iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                null, 10, 20, null, 40, 50, null, null, null,
                1, 0
            ),
            iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                10, 20, 30, 40, 50, 60, null, null, null,
                1, 1
            ),
            iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(
            new ThreePlusThreeSubImage(
                20, 30, null, 50, 60, null, null, null, null,
                1, 2
            ),
            iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }
}
