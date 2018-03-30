
import java.util.Scanner; // takes input from standard input

public class input_to_output{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Whats's your Name?");

        if(userInput.hasNextLine()){
            String username = userInput.nextLine();  // has many more like nextInt(), nextChar(), nextByte()
            System.out.println("\nHowdy " + username + " \n:)");
            }    
    }
}