import java.util.*;
import java.io.*;

public class images 
{
    private static HashMap<String,ArrayList<ArrayList<Integer>>> Colour_red = new HashMap<>();    
    private static HashMap<String,ArrayList<ArrayList<Integer>>> Colour_green = new HashMap<>();
    private static HashMap<String,ArrayList<ArrayList<Integer>>> Colour_blue = new HashMap<>();
    
    private static HashMap<String,ArrayList<ArrayList<Integer>>> Gray = new HashMap<>();    

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
            System.out.println("\nEnter the id of the matrix: ");
            String id = scan.next();

            System.out.print("\nEnter the rows in the matrix: ");
            int rows = sc.nextInt();

            System.out.print("\nEnter the columns in the matrix: ");
            int cols = sc.nextInt();

            ArrayList<ArrayList<Integer>> g_mat = new ArrayList<>();

            System.out.println("Enter the grayscale values (0-255):");
            System.out.println();
            
            for(int i=1; i<rows+1; i++)
            {
                ArrayList<Integer> g_temp = new ArrayList<>();

                for(int j=1; j<cols+1; j++)
                {
                    System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                    int ele = sc.nextInt();
                    g_temp.add(ele);
                }

                g_mat.add(g_temp);
            }

            Gray.put(id, g_mat);
        }

        else if(ch.ret().equals(2))
        {
            System.out.println("\nEnter the id of the matrix: ");
            String id = scan.next();

            System.out.print("\nEnter the rows in the matrix: ");
            int rows = sc.nextInt();

            System.out.print("\nEnter the columns in the matrix: ");
            int cols = sc.nextInt();

            ArrayList<ArrayList<Integer>> r_mat = new ArrayList<>();
            ArrayList<ArrayList<Integer>> gr_mat = new ArrayList<>();
            ArrayList<ArrayList<Integer>> b_mat = new ArrayList<>();


            System.out.println("Enter the red colour matrix values (0-255):");
            System.out.println();

            for(int i=1; i<rows+1; i++)
            {
                ArrayList<Integer> r_temp = new ArrayList<>();

                for(int j=1; j<cols+1; j++)
                {
                    System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                    int ele = sc.nextInt();
                    r_temp.add(ele);
                }

                r_mat.add(r_temp);
            }

            Colour_red.put(id, r_mat);

            System.out.println("Enter the green colour matrix values (0-255):");
            System.out.println();

            for(int i=1; i<rows+1; i++)
            {
                ArrayList<Integer> g_temp = new ArrayList<>();

                for(int j=1; j<cols+1; j++)
                {
                    System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                    int ele = sc.nextInt();
                    g_temp.add(ele);
                }

                gr_mat.add(g_temp);
            }

            Colour_green.put(id, gr_mat);

            System.out.println("Enter the blue colour matrix values (0-255):");

            System.out.println();

            for(int i=1; i<rows+1; i++)
            {
                ArrayList<Integer> b_temp = new ArrayList<>();

                for(int j=1; j<cols+1; j++)
                {
                    System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                    int ele = sc.nextInt();
                    b_temp.add(ele);
                }

                b_mat.add(b_temp);
            }

            Colour_blue.put(id, b_mat);
        }

        else
        {
            System.out.println("Wrong option, start again...");
            Input_mat();
        }
    }

}
