import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    private static Scanner sc = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);  

    
    public static images img = new images();
    public static Update upd = new Update();

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
            img.Input_mat();
            System.out.println();
            main(args);
        }
        
        else if(obj.ret().equals(2))
        {
            img.create_mat();
            System.out.println();
            main(args);
        }

        else if(obj.ret().equals(3))
        {
            upd.update_mat(img);
            main(args);
        }

        else if(obj.ret().equals(4))
        {
            display_mat();
            main(args);
        }

        else if(obj.ret().equals(5))
        {
            compute_negatives();
            main(args);
        }

        else if(obj.ret().equals(6))
        {
            System.out.println("Thank you, Exiting.......");
            System.exit(0);
        }

        else if(!(obj.ret() instanceof Integer))
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

    public static void display_mat()
    {
        System.out.println("Enter the kind of matrix you want to display");
        System.out.println("1. Colour");
        System.out.println("2. Grayscale");

        int ch = sc.nextInt();

        System.out.println("Enter the id of the matrix you want to display: ");
        String id_disp = scan.next();

        if(ch == 1)
        {
            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_red());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_red = new HashMap<>();
            d_red = dd.ret();
            ArrayList<ArrayList<Integer>> red_disp = new ArrayList<>();
            red_disp = d_red.get(id_disp);
            System.out.println("Red matrix  " + red_disp);

            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd2 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_green());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_green = new HashMap<>();
            d_green = dd2.ret();
            ArrayList<ArrayList<Integer>> green_disp = new ArrayList<>();
            green_disp = d_green.get(id_disp);
            System.out.println("Green matrix  " + green_disp);

            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd3 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_blue());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_blue = new HashMap<>();
            d_blue = dd3.ret();
            ArrayList<ArrayList<Integer>> blue_disp = new ArrayList<>();
            blue_disp = d_blue.get(id_disp);
            System.out.println("Blue matrix  " + blue_disp);
        }

        else if(ch == 2)
        {
            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd3 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_gray());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_blue = new HashMap<>();
            d_blue = dd3.ret();
            ArrayList<ArrayList<Integer>> blue_disp = new ArrayList<>();
            blue_disp = d_blue.get(id_disp);
            System.out.println(blue_disp);
        }

        else
        {
            System.out.println("Wrong option, Enter again.....");
            display_mat();
        }
    }
    
    public static void compute_negatives()
    {
        System.out.println("Enter the kind of matrix you want to compute negatives for");
        System.out.println("1. Colour");
        System.out.println("2. Grayscale");

        int ch = sc.nextInt();

        System.out.println("Enter the id of the matrix you want to display: ");
        String id_disp = scan.next();

        if(ch == 1)
        {
            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_red());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_red = new HashMap<>();
            d_red = dd.ret();
            ArrayList<ArrayList<Integer>> red_disp = new ArrayList<>();
            red_disp = d_red.get(id_disp);
            int r = red_disp.size();
            int c = red_disp.get(0).size();

            System.out.println("Red Matrix :");

            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    int element = red_disp.get(i).get(j);
                    element = element-255;
                    System.out.print(element + " ");
                }

                System.out.println();
            }

            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd2 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_green());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_green = new HashMap<>();
            d_green = dd2.ret();
            ArrayList<ArrayList<Integer>> green_disp = new ArrayList<>();
            green_disp = d_green.get(id_disp);
            r = green_disp.size();
            c = green_disp.get(0).size();

            System.out.println("Green Matrix :");


            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    int element = green_disp.get(i).get(j);
                    element = element-255;
                    System.out.print(element + " ");
                }

                System.out.println();
            }

            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd3 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_blue());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_blue = new HashMap<>();
            d_blue = dd3.ret();
            ArrayList<ArrayList<Integer>> blue_disp = new ArrayList<>();
            blue_disp = d_blue.get(id_disp);
            r = blue_disp.size();
            c = blue_disp.get(0).size();

            System.out.println("Blue Matrix :");

            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    int element = blue_disp.get(i).get(j);
                    element = element-255;
                    System.out.print(element + " ");
                }

                System.out.println();
            }
        }

        else if(ch == 2)
        {
            Display<HashMap<String,ArrayList<ArrayList<Integer>>>> dd3 = new Display<HashMap<String,ArrayList<ArrayList<Integer>>>>(img.get_gray());
            HashMap<String,ArrayList<ArrayList<Integer>>> d_blue = new HashMap<>();
            d_blue = dd3.ret();
            ArrayList<ArrayList<Integer>> blue_disp = new ArrayList<>();
            blue_disp = d_blue.get(id_disp);
            int r = blue_disp.size();
            int c = blue_disp.get(0).size();

            System.out.println("Gray Matrix :");

            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    int element = blue_disp.get(i).get(j);
                    element = element-255;
                    System.out.print(element + " ");
                }

                System.out.println();
            }
        }

        else
        {
            System.out.println("Wrong option, Enter again.....");
            display_mat();
        }
    }
}