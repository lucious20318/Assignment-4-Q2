import java.util.*;
import java.io.*;

public class Update <T extends images>
{
    private static Scanner sc = new Scanner(System.in);
    private static Scanner scan = new Scanner(System.in);  

    public static void update_mat(images img)
    {
        System.out.println("Enter the kind of matrix you want to update: ");
        System.out.println("1. Colour");
        System.out.println("2. Grayscale");

        int x = sc.nextInt();

        System.out.print("\nEnter the matrix id that you want to update: ");
        String id_up = scan.next();


        if(x==1)
        {
            System.out.println("Enter the operation:");
            System.out.println("1. Update red");
            System.out.println("2. Update blue");
            System.out.println("3. Update green");
            System.out.println("4. Return to Main-Menu");

            int operation = sc.nextInt();

            Menu op = new Menu(operation);

            if(op.ret().equals(1))
            {
                HashMap<String,ArrayList<ArrayList<Integer>>> updated = new HashMap<>();
                updated = img.get_red();

                ArrayList<ArrayList<Integer>> y = new ArrayList<>();

                ArrayList<ArrayList<Integer>> y_up = new ArrayList<>();

                y = updated.get(id_up);

                int r = y.size();
                int c = y.get(0).size();

                for(int i=0; i<r; i++)
                {
                    ArrayList<Integer> r_temp = new ArrayList<>();

                    for(int j=0; j<c; j++)
                    {
                        System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                        int ele = sc.nextInt();
                        r_temp.add(ele);
                    }

                    y_up.add(r_temp);
                }

                updated.put(id_up, y_up);

                img.set_red(updated);
                
            }

            else if(op.ret().equals(2))
            {
                HashMap<String,ArrayList<ArrayList<Integer>>> updated = new HashMap<>();
                updated = img.get_blue();

                ArrayList<ArrayList<Integer>> y = new ArrayList<>();

                ArrayList<ArrayList<Integer>> y_up = new ArrayList<>();

                y = updated.get(id_up);

                int r = y.size();
                int c = y.get(0).size();

                for(int i=0; i<r; i++)
                {
                    ArrayList<Integer> r_temp = new ArrayList<>();

                    for(int j=0; j<c; j++)
                    {
                        System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                        int ele = sc.nextInt();
                        r_temp.add(ele);
                    }

                    y_up.add(r_temp);
                }

                updated.put(id_up, y_up);

                img.set_blue(updated);
            }

            else if(op.ret().equals(3))
            {
                HashMap<String,ArrayList<ArrayList<Integer>>> updated = new HashMap<>();
                updated = img.get_green();

                ArrayList<ArrayList<Integer>> y = new ArrayList<>();

                ArrayList<ArrayList<Integer>> y_up = new ArrayList<>();

                y = updated.get(id_up);

                int r = y.size();
                int c = y.get(0).size();

                for(int i=0; i<r; i++)
                {
                    ArrayList<Integer> r_temp = new ArrayList<>();

                    for(int j=0; j<c; j++)
                    {
                        System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                        int ele = sc.nextInt();
                        r_temp.add(ele);
                    }

                    y_up.add(r_temp);
                }

                updated.put(id_up, y_up);

                img.set_green(updated);
            }

            else if(op.ret().equals(4))
            {
                System.out.println("Returning....");
                Main.main(args);
            }

            else
            {
                System.out.println("Wrong operation, Start again.....");
                update_mat();
            }
        }

        else if(x==2)
        {
            HashMap<String,ArrayList<ArrayList<Integer>>> updated = new HashMap<>();
            updated = img.get_gray();

            ArrayList<ArrayList<Integer>> y = new ArrayList<>();

            ArrayList<ArrayList<Integer>> y_up = new ArrayList<>();

            y = updated.get(id_up);

            int r = y.size();
            int c = y.get(0).size();

            for(int i=0; i<r; i++)
            {
                ArrayList<Integer> r_temp = new ArrayList<>();

                for(int j=0; j<c; j++)
                {
                    System.out.print("Enter the element at (" + i +"," + j+ ") :" );
                    int ele = sc.nextInt();
                    r_temp.add(ele);
                }

                y_up.add(r_temp);
            }

            updated.put(id_up, y_up);

            img.set_gray(updated);
        }

        else
        {
            System.out.println("Wrong option, start again.");
            System.out.println();
            update_mat();
        }
    }
}
