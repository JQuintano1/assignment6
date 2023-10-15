package randomint;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static int[] createRandomArray(int arrayLength) throws IOException{
        Random rd = new Random();
        FileWriter writer = new FileWriter("randomints.txt");
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            arr[i] = rd.nextInt(100);
            String writearr = String.valueOf(arr[i]) + "\r";
            writer.write(writearr);
            
        }
        writer.close();
        return arr;
    }
    public static int[] readFileToArray(String filename) throws IOException{
        int textarrlength = 0;       
        
        File read = new File(filename);
        
        Scanner fileReader = new Scanner(read);
        String line;
        ArrayList<Integer> textarr = new ArrayList<Integer>();
        while (fileReader.hasNextInt()) {       
            textarr.add(fileReader.nextInt());                 
        }               
        int arsize = textarr.size();
        int[] presetarr = new int[arsize];
        for (int i = 0; i < arsize; i++){
            presetarr[i] = textarr.get(i);            
        }
        fileReader.close();
        return presetarr;
    }
    public static void bubbleSort(int[] array) throws IOException {
        FileWriter wr = new FileWriter("sortedarray.txt");
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    int hold = array[j];
                    array[j] = array[j+1];
                    array[j+1] = hold;
                }
            }
                    
        }
        for (int i = 0; i < array.length; i++){
            String sorted = String.valueOf(array[i]) + "\r";
            wr.write(sorted);
            
        }
        wr.close();
    }
}




