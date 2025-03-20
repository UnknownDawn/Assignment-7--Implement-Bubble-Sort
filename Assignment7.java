/**
 * Justin Klippstein
 * Assignment 7
 * 
 * Bubble sort implementation
 */


 //Handles User Input
import java.util.Scanner;

//Buffered Reader / Writer saves the sorted array of random intagers to file or reads new files.
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

//Handles random numbers
import java.util.Random;


public class Assignment7{


  //Static Public Variables (User Input)
  public static String userInput;
  public static int ArrayLength;
  public static Scanner scanner = new Scanner(System.in);

  public static int BigAray[];

  //Main thread
    public static void main(String[] args) throws Exception {


      System.out.println("Hello! This is my bubble sort implementation");
      System.out.println("");
      System.out.println("This program will create, sort, or read an array of random integers between 0 and 100");
      System.out.println("");
      System.out.println("Type 'CREATE FILE' to continue");
      //System.out.println("Type 'CREATE FILE' or 'READ FILE' or 'SORT FILE' to continue");


      userInput = scanner.nextLine();


      //User creates a file
      if (userInput.contains("CREATE FILE")) {


        System.out.println("");
        System.out.println("Cool! Lets make a file");
        System.out.println("How big do you want the array to be? Respond with a POSITIVE integer number.");

        userInput = scanner.nextLine();

        System.out.print("Making an array with ");
        System.out.print(userInput);
        System.out.println(" terms");


      createRandomArray(Integer.parseInt(userInput));


        System.exit(0);



      }
       //User reads an existing file
      else if (userInput.contains("READ FILE")) {

        System.exit(0);
      }


      //Sorts User File
      else if (userInput.contains("SORT FILE")) {

        System.exit(0);
      }

      else {

      System.out.println("No valid command found, please reload the program.");
      System.exit(0);
      }

    }


    // Given arrayLength as argument, create an array of random integers between 0 and 100; return the created array.
    public static int[] createRandomArray(int arrayLength) {

      int[] LoadedArray = new int[arrayLength];
      

      //Quick <0 check to stop program before it breaks
      if (arrayLength < 0) {
        System.out.println("Number < 0. Stopping program!!!");
        System.exit(0);
      }

      //Random number thing in java.
      Random randomNumberThing = new Random();

      //Add random arrayLength elements to array
      for (int i = 0; i < arrayLength; i++) {
        LoadedArray[i] = randomNumberThing.nextInt(101);
      }

      System.out.print("Here's is the array made: ");
      for (int num : LoadedArray) {
          System.out.print(num + " ");
      }

      bubbleSort(LoadedArray);







      System.exit(0);



      
          //Try in case of IOException fatal error occurs.
    try {
            //Writes to file, file will be created next to java program file.

            //Note to self
            // In order to write to file 3, use            writer3.write("Something");
            // You need to use                             writer.close();                to finish writing to file

    BufferedWriter writer = new BufferedWriter(new FileWriter("CreatedArray.txt"));

    writer.write(" ");

    for (int num : LoadedArray) {
      writer.write(num + " ");
   }




    writer.close();
    } catch (IOException obj) {
    obj.printStackTrace();
    }





      return LoadedArray;

    }





    // Given an integer array and filename, write the array to the file, with each line containing one integer in the array.
    public static void writeArrayToFile(int[] array, String filename) { 












    }


    // This is the reverse of writeArrayToFile; Given the filename, read the integers (one line per integer) to an array, and return the array
    public static int[] readFileToArray(String filename) {


      return BigAray;
    }


    // Given an integer array, sort it in-place, i.e., the order of the elements will be changed so that the final array is in sorted order.
    public static void bubbleSort(int[] array) {


      System.out.println("");
      System.out.print("Here's the array sorted : ");


      boolean switchedYet;
      int arraySize = array.length;
        for (int i = 0; i < arraySize - 1; i++) {

          //Determies if it has been switched or not
          switchedYet = false;




            //position is position in array. nextSpot repersents the position after it.
            for (int position = 0; position < arraySize - i - 1; position++) {

              int nextSpot = position + 1;


                if (array[position] > array[nextSpot]) {
                    
                    //Switched
                    switchedYet = true;

                    int valueToHold = array[position];
                    array[position] = array[nextSpot];
                    array[position + 1] = valueToHold;


                }
            }

            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!switchedYet) {
                break;
            }

    }
    
    for (int num : array) {
      System.out.print(num + " ");

  }

  }

}





