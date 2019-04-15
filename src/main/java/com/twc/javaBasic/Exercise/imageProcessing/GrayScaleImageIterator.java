package com.twc.javaBasic.Exercise.imageProcessing;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class is an iterator that can iterate through a gray-scale image. Each time it will generate
 * a 3x3 sub-image. So that we can implement filter operations.
 */
class GrayScaleImageIterator implements Iterator<ThreePlusThreeSubImage> {
    private final GrayScaleImage image;
    private int currentRow;
    private int currentColumn;

    GrayScaleImageIterator(GrayScaleImage image) {
        this.image = image;

        // TODO: Please initialize the `currentRow` and `currentColumn` here.
        // <--start-

        // --end-->
    }

    @Override
    public boolean hasNext() {
        // TODO: Please implement the hasNext() method. It should returns true if the iteration has more
        //  elements. (In other words, returns true if next() would return an element rather than throwing
        //  an exception.)
        // <--start--
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Override
    public ThreePlusThreeSubImage next() {
        // TODO: Please implement the next() method. It should returns the next element in the iteration.
        //  If the iteration has no more elements, it should throw a NoSuchElementException.
        //
        // TODO: Here are some details on how to return a 3x3 sub-image.
        //  If the image matrix is as follows:
        //  ```
        //  A   B   C   D
        //  E   F   G   H
        //  I   J   K   L
        //  ```
        //  Then the sub-image of pixel A should be (NA represents `null`):
        //  ```
        //  NA  NA  NA
        //  NA  A   B
        //  NA  E   F
        //  ```
        //  And the sub-image of pixel G should be:
        //  ```
        //  B   C   D
        //  F   G   H
        //  J   K   L
        //  ```
        // <--start-
        throw new RuntimeException("Not implemented");
        // --end-->
    }
}
