import java.io.*;
import java.util.*;


public class addiply
{
     static void main(String[] args) 
    {
       // File myFile = new File("input.txt");
        Scanner s = new Scanner(myFile);
        int times = s.nextInt();

        for(int i = 0; i < times; i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println((a + b) +  " " + (a * b));
            
            
        }
        s.close();

    }


}