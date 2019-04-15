package com.twc.javaBasic.Exercise.imageProcessing;

import java.util.function.Function;

public class GrayScaleImageProcessor {
    private static GrayScaleImage filter(
        GrayScaleImage image,
        Function<ThreePlusThreeSubImage, Byte> calculator) {
        if (image == null || calculator == null) {
            throw new IllegalArgumentException();
        }

        GrayScaleImage processed = new GrayScaleImage(image.getWidth(), image.getHeight());
        for (ThreePlusThreeSubImage subImage : image) {
            final Byte pixel = calculator.apply(subImage);
            processed.setPixel(subImage.getRowIndex(), subImage.getColumnIndex(), pixel);
        }

        return processed;
    }

    public static GrayScaleImage boxBlur(GrayScaleImage image) {
        // TODO:
        //  Please implement the box blur algorithm. A box blur (also known as a box linear filter) is a
        //  spatial domain linear filter in which each pixel in the resulting image has a value equal to
        //  the average value of its neighboring pixels in the input image. We will use a 3x3 filter to
        //  process each pixel. For a detailed introduction please refer to:
        //  https://en.wikipedia.org/wiki/Box_blur
        //
        // TODO:
        //  Please note that for the pixel at the edge. Null pixel should not be calculated into the average
        //  result. For example. For image:
        //  ```
        //  A   B   C
        //  D   E   F
        //  ```
        //  The sub-image for pixel A is:
        //  ```
        //  NA  NA  NA
        //  NA  A   B
        //  NA  D   E
        //  ```
        //  Thus the processed value should be (A + B + D + E) / 4.
        // <--start-
        throw new RuntimeException("Not implemented");
        // --end->
    }
}
