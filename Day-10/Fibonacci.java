import java.util.Scanner;
public class Fibonacci
{
  public static void main(String[] args)
  {
    int n1 = 0, n2 = 1, sum = 0, num, count = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("*** FIBONACCI NUMBERS ***");
    System.out.print("Enter the number of fibbonacci numbers you want me to print :  ");
    num = sc.nextInt();
    System.out.println();

    if (num > 0) {
      System.out.print(n1 + "\t\t");
      count++;
    }
    
    if (num > 1) {
      System.out.print(n2 + "\t\t");
      count++;
    }
    
    if (num > 2) {
      while(num > count) {
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
        System.out.print(sum + "\t\t");
        count++;
        if(count % 5 == 0) {
          System.out.println();
        }
      }
    }

    System.out.println();
  }
}