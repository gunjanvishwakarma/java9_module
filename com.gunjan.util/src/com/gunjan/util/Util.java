package com.gunjan.util;

import java.util.Arrays;
import com.gunjan.logger.Logger;

public class Util
{
    Logger logger = new Logger();
    public void printArray(int[] array){
        System.out.println();
        for(int i = 0 ; i < array.length ; i++){
            logger.log(array[i] + " ");
        }
    }
    
    public int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }
}
