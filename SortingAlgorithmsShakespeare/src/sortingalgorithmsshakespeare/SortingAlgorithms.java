/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsshakespeare; 

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
    
}
