package com.zipcodewilmington.looplabs;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int counter=0;
      if(maxNumberOfDuplications<=1) return new Integer[0];
        StringBuilder sb=new StringBuilder();
        for( Integer ele:super.array) {
            for (Integer ele1 : super.array)
                if (ele == ele1) counter++;
            if(counter<maxNumberOfDuplications)  sb.append(ele).append(",");
            counter=0;
        }
        String[] outputStringFormat=sb.toString().split(",");
        Integer[] output=new Integer[outputStringFormat.length];
        for(int i=0;i<outputStringFormat.length;i++)
            output[i]=Integer.parseInt(outputStringFormat[i]);
        return output;
    }
    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int counter=0;
        StringBuilder sb=new StringBuilder();
        for( Integer ele:super.array) {
            for (Integer ele1 : super.array)
                if (ele == ele1) counter++;
            if(counter!=exactNumberOfDuplications)  sb.append(ele).append(",");
            counter=0;
        }
        String[] outputStringFormat=sb.toString().split(",");
        Integer[] output=new Integer[outputStringFormat.length];
        for(int i=0;i<outputStringFormat.length;i++)
            output[i]=Integer.parseInt(outputStringFormat[i]);
        return output;
    }
}
