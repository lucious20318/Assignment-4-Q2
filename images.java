import java.util.*;
import java.io.*;

public class images 
{
    private static HashMap<Integer,ArrayList<ArrayList<Integer>>> Colour_red = new HashMap<>();    
    private static HashMap<Integer,ArrayList<ArrayList<Integer>>> Colour_green = new HashMap<>();
    private static HashMap<Integer,ArrayList<ArrayList<Integer>>> Colour_blue = new HashMap<>();
    
    private static HashMap<Integer,ArrayList<ArrayList<Integer>>> Gray = new HashMap<>();    

    private static Scanner sc = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);

    public void Input_mat()
    {
        System.out.println("Enter the kind of matrix you want to input: ");
        System.out.println("1. Grayscale");
        System.out.println("2. Colour");

        int choice = sc.nextInt();

        Menu ch = new Menu(choice);

        if(ch.ret().equals(1))
        {

        }

        else if(ch.ret().equals(2))
        {

        }

        else
        {
            System.out.println("Wrong option, start again...");
            Input_mat();
        }
    }

}
