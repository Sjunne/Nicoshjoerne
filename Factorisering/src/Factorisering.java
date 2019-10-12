import java.util.Scanner;
public class Factorisering
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Vælg start værdi: ");
    int startAntal = keyboard.nextInt();
    int holder = 0;
    for (int i = startAntal; i >= 1 ; i--)
    {
      holder += i;
    }
    System.out.println(holder);
  }
}
