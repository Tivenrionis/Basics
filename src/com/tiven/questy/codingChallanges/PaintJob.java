package com.tiven.questy.codingChallanges;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double areaToPaint = width * height;
        double howManyNeeded = areaToPaint / areaPerBucket;

        return (int) Math.ceil(howManyNeeded - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double areaToPaint = width * height;
        double howManyNeeded = areaToPaint / areaPerBucket;

        return (int) Math.ceil(howManyNeeded);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        double howManyNeeded = area / areaPerBucket;

        return (int) Math.ceil(howManyNeeded);
    }

}
