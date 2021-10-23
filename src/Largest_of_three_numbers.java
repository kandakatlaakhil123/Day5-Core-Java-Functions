public class Largest_of_three_numbers
{
    public static void main(String[] args)
    {
        int n1 = 5, n2 = 9, n3 = 10;

        if(n1 >= n2 && n1>= n3 )
            System.out.println(n1 + "is the largest number.");

        else if(n2 >= n1 && n2 >= n3)
            System.out.println(n2 + "is the largest number." );

        else

            System.out.println(n3 + "is the largest number.");
    }


}
