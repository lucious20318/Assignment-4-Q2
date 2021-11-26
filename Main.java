import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    private static Scanner sc = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);  

    public static void main(String[] args) 
    {
        System.out.println("    Main-Menu   ");
        System.out.println("1. Input");
        System.out.println("2. Create");
        System.out.println("3. Update");
        System.out.println("4. Display");
        System.out.println("5. Compute negatives");
        System.out.println("6. Exit");
        
        System.out.print("\nEnter your option: ");
        int opt = sc.nextInt();

        Menu obj = new Menu(opt);

        if(obj.ret().equals(1))
        {

        }
        
        else if(obj.ret().equals(2))
        {

        }

        else if(obj.ret().equals(3))
        {

        }

        else if(obj.ret().equals(4))
        {

        }

        else if(obj.ret().equals(5))
        {

        }

        else if(obj.ret().equals(6))
        {
            System.out.println("Thank you, Exiting.......");
            System.exit(0);
        }

        else if(obj.ret() instanceof String)
        {
            System.out.println("Wrong option, start again.");
            System.out.println();
            main(args);
        }

        else
        {
            System.out.println("Wrong option, start again.");
            System.out.println();
            main(args);
        }
    }
}