/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsshakespeare;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class TextSorter {
    private static String[] shakespeare;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sizeLimit = 100000;
        long timeStart = 0;
        long timeEnd = 0;
        long timeTotal = 0;
        
        String path = "C:\\datamatiker\\algorithms_course\\shakespeare\\shakespeare_original_complete.txt";
        String delimiterPattern = "[^A-Za-z]";
        try {
            shakespeare = FileUtility.toStringArray(path, delimiterPattern);
        } catch (IOException ex) {
            Logger.getLogger(TextSorter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] toBeSorted = Arrays.copyOfRange(shakespeare, 0, sizeLimit);
        
        String[] insertionSorted = toBeSorted.clone();
        String[] selectionSorted = toBeSorted.clone();
        
        timeStart = System.nanoTime();
        SortingAlgorithms.selectionSort(selectionSorted);
        timeEnd = System.nanoTime();
        boolean ok = SortingAlgorithms.isSorted(selectionSorted);
        System.out.println("is it sorted: " + ok);
        timeTotal = timeEnd - timeStart;
        
        System.out.println("selection sort took " + timeTotal/1000 + " micro seconds");

        timeStart = System.nanoTime();
        SortingAlgorithms.insertionSort(insertionSorted);
        timeEnd = System.nanoTime();
        ok = SortingAlgorithms.isSorted(insertionSorted);
        System.out.println("is it sorted: " + ok);
        timeTotal = timeEnd - timeStart;
        
        System.out.println("insertion sort took " + timeTotal/1000 + " micro seconds");
        
        /*
        for (String string : toBeSorted) {
            System.out.println(string);
        }
        */
        
    }
}
