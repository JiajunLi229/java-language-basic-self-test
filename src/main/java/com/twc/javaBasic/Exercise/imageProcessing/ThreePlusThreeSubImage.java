package com.twc.javaBasic.Exercise.imageProcessing;

import java.util.Objects;

public class ThreePlusThreeSubImage {
    private final int topLeft;
    private final int top;
    private final int topRight;
    private final int left;
    private final int current;
    private final int right;
    private final int bottomLeft;
    private final int bottom;
    private final int bottomRight;
    private final int rowIndex;
    private final int columnIndex;
    private int validPixels = 0;

    ThreePlusThreeSubImage(
        Integer topLeft, Integer top, Integer topRight,
        Integer left, Integer current, Integer right,
        Integer bottomLeft, Integer bottom,  Integer bottomRight,
        int rowIndex, int columnIndex) {
        this.topLeft = normalize(topLeft);
        this.top = normalize(top);
        this.topRight = normalize(topRight);
        this.left = normalize(left);
        this.current = normalize(current);
        this.right = normalize(right);
        this.bottomLeft = normalize(bottomLeft);
        this.bottom = normalize(bottom);
        this.bottomRight = normalize(bottomRight);
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    private int normalize(Integer topLeft) {
        if (topLeft == null) return 0;
        else {
            ++validPixels;
            return topLeft;
        }
    }

    int getTopLeft() {
        return topLeft;
    }

    int getTop() {
        return top;
    }

    int getTopRight() {
        return topRight;
    }

    int getLeft() {
        return left;
    }

    int getCurrent() {
        return current;
    }

    int getRight() {
        return right;
    }

    int getBottomLeft() {
        return bottomLeft;
    }

    int getBottom() {
        return bottom;
    }

    int getBottomRight() {
        return bottomRight;
    }

    int getRowIndex() {
        return rowIndex;
    }

    int getColumnIndex() {
        return columnIndex;
    }

    int getValidPixels() {
        return validPixels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreePlusThreeSubImage that = (ThreePlusThreeSubImage) o;
        return topLeft == that.topLeft &&
            top == that.top &&
            topRight == that.topRight &&
            left == that.left &&
            current == that.current &&
            right == that.right &&
            bottomLeft == that.bottomLeft &&
            bottom == that.bottom &&
            bottomRight == that.bottomRight &&
            rowIndex == that.rowIndex &&
            columnIndex == that.columnIndex &&
            validPixels == that.validPixels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            topLeft, top, topRight, left, current, right, bottomLeft, bottom, bottomRight,
            rowIndex, columnIndex, validPixels);
    }

    @Override
    public String toString() {
        return String.format("%d %d %d %d %d %d %d %d %d (%d, %d)",
            topLeft, top, topRight, left, current, right, bottomLeft, bottom, bottomRight, rowIndex, columnIndex);
    }
}
