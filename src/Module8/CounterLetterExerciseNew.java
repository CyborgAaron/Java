package Module8;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CounterLetterExerciseNew {
    public static void main(String[] args) {

        //Create a scanner to accept user input
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the location and the filename
        //Example: C:\SampleText.txt
        System.out.println("Enter a text filename *Remember to use C:*: ");
        String fileName = input.next();

        //Verify whether the file has already existed.
        File file = new File(fileName);
        if(!file.exists()) {
            System.out.println("The file " + fileName + " does not exist. ");
            System.exit(1);
        }

        // Create a SET to store vowels.
        Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int vowels = 0; // Counts the number of vowels
        int consonants = 0; // Counts the number of consonants

        try ( // Create an input file

              Scanner inputFile = new Scanner(file)
        ) {
            while (inputFile.hasNext()) {
                // Add your code here
                String word = inputFile.next();
               for (int i = 0; i < word.length(); i++) {
                   if (set.contains(Character.toUpperCase(word.charAt(i))))
                       vowels++;
                   else if (Character.isLetter((word.charAt(i))))
                       consonants++;
                }

                }

            }
        catch (Exception e) {

        }
        //Displays the number if Vs and Cs in the file
        System.out.println("The file " + fileName + " has " +
                vowels + " vowels and " + consonants + " consonants. ");
    }
}
