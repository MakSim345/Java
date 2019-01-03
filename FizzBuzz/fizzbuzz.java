public class fizzbuzz
{
    public static void main (String [] args)  
    {        
        // System.out.println("Hello world!");
        FizzBuzz(15);
    }

    public static void FizzBuzz(int x)
    {
        // System.out.println("Hello world!");
        for (int i = 1; i <= x; i++)
        {
            if (0 == i % 3 && 0 == i % 5)
            {
                System.out.println(" FizzBuzz");
            }
            else if (0 == i % 3)
            {
                System.out.println(" Fizz");
            }
            else if (0 == i % 5)
            {
                System.out.println(" Buzz");
            }
            else System.out.println(i);
        }
    }
}
