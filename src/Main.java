import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double long1 = 0;
        double long2 = 0;
        double short1 = 0;
        double short2 = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        String trash = "";


        System.out.print("Enter the length of the long side of the rectangle: ");
        if(in.hasNextDouble())
        {
            long1 = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter the length of the second long side of the rectangle: ");
        if(in.hasNextDouble())
        {
            long2 = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter the length of the short side of the rectangle: ");
        if(in.hasNextDouble())
        {
            short1 = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter the length of the second short side of the rectangle: ");
        if(in.hasNextDouble())
        {
            short2 = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

            area = long1 *short1;
        System.out.println("The area of this rectangle is: " + area);

            perimeter = long1 + long2 + short1 + short2;
        System.out.println("The perimeter of this rectangle is: " + perimeter);

        hypotenuse = Math.sqrt(Math.pow(long1, 2) + Math.pow(short1, 2));
        System.out.println("Hypotenuse of the triangle is: " + hypotenuse);




    }
}