package com.twc.javaBasic.Exercise.imageProcessing;

import java.util.Arrays;
import java.util.Iterator;

/**
 * A gray scale image is an image whose pixels are all one byte data. The valid range for a pixel is
 * from 0-255.
 */
public class GrayScaleImage implements Iterable<ThreePlusThreeSubImage> {
    // Surprisingly, the best type to represent pixel data is int, since byte is a signed integer.
    private final int[] data;
    private final int width;
    private final int height;

    public GrayScaleImage(int width, int height) {
        this(width, height, null);
    }

    public GrayScaleImage(int width, int height, int[] raw) {
        // TODO:
        //  In this constructor, we will validate and save the `width` and `height` information of the
        //  image to corresponding fields. We will create data array to hold all the pixels of the image.
        //  And if the `raw` argument is not null, we will copy its data to the `data` field.
        //  Since we store each pixel in a 32-bit integer, we have to make sure that the value of the
        //  pixel is from 0-255. Or else it should throw an IllegalArgumentException.
        // <--start--
        throw new RuntimeException("Not implemented");
        // --end->
    }

    Integer getPixel(int rowIndex, int columnIndex) {
        // TODO:
        //  This method will return the pixel value at a specific index. If the index is not valid, this
        //  function should return null.
        // <--start--
        throw new RuntimeException("Not implemented");
        // --end->
    }

    void setPixel(int rowIndex, int columnIndex, int pixel) {
        // TODO:
        //  This method will set the pixel value at a specific index. If the index or the pixel is not valid,
        //  it should throw an IllegalArgumentException.
        // <--start--
        throw new RuntimeException("Not implemented");
        // --end->
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    public int[] getRaw() {
        return data.clone();
    }

    @Override
    public Iterator<ThreePlusThreeSubImage> iterator() {
        return new GrayScaleImageIterator(this);
    }

    // TODO: You can add private helper methods of course
    // <--start-

    // --end-->
}
