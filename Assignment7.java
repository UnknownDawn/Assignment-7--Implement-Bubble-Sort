/**
 * Justin Klippstein
 * 
 * BubbleSort 
 */

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Assignment{
  public static String userInput;
  public static  int userInputNumber;
  public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


      System.out.println("Hello! Type an intager that is > 0 to make a randomized matrix of that size");


      //Try in case of IOException fatal error occurs.
      try {
                //Writes to file, file will be created next to java program file.


                //Note to self
                // In order to write to file 3, use            writer3.write("Something");
                // You need to use                             writer.close();                to finish writing to file

      BufferedWriter writer = new BufferedWriter(new FileWriter("matrix3.txt"));

      writer.write("");
      writer.close();
      } catch (IOException obj) {
        obj.printStackTrace();
      }

        Decide_To_Import_Or_Create_Random_Verticies();

    }

    public static void Decide_To_Import_Or_Create_Random_Verticies() {

        userInput = scanner.nextLine();

      try {
      userInputNumber = Integer.valueOf(userInput);
      
      } catch (NumberFormatException e) {
        System.out.println("Unable to turn input into integer, checking for filenames");
        
      }

      if (userInputNumber > 0){
        
      System.out.println("Input detected with a valid intager!");

        createMatrixWithRandomNumbers();
      }

        if (userInput.contains("EXIT")) {
            scanner.close();
            System.exit(0); 
          }

    }

    public static void createMatrixWithRandomNumbers() {

      try {
      BufferedWriter writer1 = new BufferedWriter(new FileWriter("matrix1.txt"));

      writer1.write("");
      writer1.close();

      } catch (IOException obj) {
        obj.printStackTrace();
      }


      try {
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("matrix2.txt"));
  
        writer2.write("");
        writer2.close();
  
        } catch (IOException obj) {
          obj.printStackTrace();
          
        }

    }

  }




