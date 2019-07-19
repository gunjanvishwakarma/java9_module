package com.gunjan.search;

import java.util.Arrays;

import com.gunjan.util.Util;

public class BinarySearch
{
    Util util = new Util();
    
    public int binarySearch(int[] array, int number)
    {
        util.sortArray(array);
        return Arrays.binarySearch(array, number);
    }
}
