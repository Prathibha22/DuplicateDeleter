package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int counter=0;
        if(maxNumberOfDuplications<=1) return new String[0];
        StringBuilder sb=new StringBuilder();
        for( String ele:super.array) {
            for (String ele1 : super.array)
                if (ele == ele1) counter++;
            if(counter<maxNumberOfDuplications)  sb.append(ele).append(",");
            counter=0;
        }
        return sb.toString().split(",");
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int counter=0;
        StringBuilder sb=new StringBuilder();
        for( String ele:super.array) {
            for (String ele1 : super.array)
                if (ele == ele1) counter++;
            if(counter!=exactNumberOfDuplications)  sb.append(ele).append(",");
            counter=0;
        }
        return sb.toString().split(",");
    }
}
