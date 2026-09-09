import java.util.Scanner;


class addiply
{
     static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();

        for(int i = 0; i < testCases; i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println((a + b) +  " " + (a * b));
            
            
        }
        s.close();

    }


}