package main;
import java.io.IOException;
import java.util.Scanner;
import randomint.App;


public class run extends App {
    public static void main(String[] args) throws IOException{
    Scanner scnr = new Scanner(System.in);
    int arrlength;
    String readarray = "presetarray.txt";
    String Choice = "None";
        while (!"Exit".equals(Choice)){
            System.out.println("Please enter selection: Random (create and store random array), Read (Read array from text file and sort array and store in new text file), Exit (finish using app)");
            Choice = scnr.nextLine();
        
        
                if ("Random".equals(Choice)){
                    System.out.println("Please select length of list: ");
                    arrlength = scnr.nextInt();
                    scnr.nextLine();
                    
                
                        try {
                        createRandomArray(arrlength);
                        } 
                        catch (IOException e) {
                    
                        e.printStackTrace();
                        }
                
                }
                else if ("Read".equals(Choice)) {
                int[] newreadarray = readFileToArray(readarray);
                bubbleSort(newreadarray);
            }
                else {
                    System.out.println("Invalid choice, please select either Random or Read.");
                }
        
        }
    }
}


