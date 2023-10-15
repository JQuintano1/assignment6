package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
    public static int[] readFileToArray(String filename) throws IOException{
        int textarrlength = 0;
        
        File read = new File(filename);
        FileWriter writer = new FileWriter(read);
        Scanner fileReader = new Scanner(read);
        while (fileReader.hasNextLine()) {            
            textarrlength = textarrlength + 1;
        }
        
        int[] textarr = new int[textarrlength];
        for (int i = 0; i < textarrlength; i++){
            textarr[i] = Integer.parseInt(fileReader.nextLine());
            System.out.println(textarr[i]);
        }
        return textarr;
    }
    
}
