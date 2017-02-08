/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.Shakespear; 

/**
 *
 * @author michael
 */
public class SortingAlgorithms { 
   public static String[] insertionSort(String[] insertionArray){
        
//        String key;
//        int counter;
//        int comparison = 0;
        for (int i = 1; i < insertionArray.length; i++) {
            String key = insertionArray[i];
            if(key.compareTo(insertionArray[i-1])<0){
//                // System.out.println("if " + key + " : " + " : " + insertionArray[i-1] + " : " + key.compareTo(insertionArray[i-1]));
//                continue;
//            }
//            else{
                int counter = i;
                while(counter - 1 >= 0 && key.compareTo(insertionArray[counter - 1])<0){
                    // System.out.println("else " + key + " : " + insertionArray[i-1] + " : " + key.compareTo(insertionArray[i-1]));
                    insertionArray[counter] = insertionArray[counter-1];
                    counter--;
                }
                insertionArray[counter] = key;
            }
        }
        return insertionArray;
    }
    
    
    public static String[] selectionSort(String[] selectionArray){
        int indexOfLowest;
        String temp;
        for (int i = 0; i < selectionArray.length; i++){
            indexOfLowest = i;
            for (int j = i+1; j < selectionArray.length; j++){
                if (selectionArray[j].compareTo(selectionArray[indexOfLowest])<0){
                    indexOfLowest = j;
                }
            }
            temp = selectionArray[i];
            selectionArray[i] = selectionArray[indexOfLowest];
            selectionArray[indexOfLowest] = temp;
        }
        return selectionArray;
    }
    
    public static boolean isSorted(String[] testThis){
        String temp = testThis[0];
        for (int i = 1; i < testThis.length; i++) {
            if (temp.compareTo(testThis[i])>0){
                return false;
            }
            temp = testThis[i];
        }
        return true;
    }
    
    //Nicklas merge sort addition:
    
    //Sorts stupidly fast!
    public static void mergeSort(String[] names) {
        //Split the list if more than 1 element
        //base case would therefore be when 1 element is left in the array.
        if (names.length > 1) {
            String[] left = new String[names.length / 2];
            String[] right = new String[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }
            //recursive calls to split the lists again.
            mergeSort(left);
            mergeSort(right);
            
            //merge it all back together :)
            merge(names, left, right);
        }
    }

    private static void merge(String[] names, String[] left, String[] right) {
        int a = 0;//index for list a
        int b = 0;//index for list b
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }
}
