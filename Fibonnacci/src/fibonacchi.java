import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class fibonacchi
{
  public static void main(String[] args) throws InterruptedException
  {
    ArrayList<Integer> talrække = new ArrayList<>();
    talrække.add(1);
    talrække.add(1);
    for (int i = 0;; i++) {
      talrække.add(talrække.get(i) + talrække.get(i+1));
      System.out.println(talrække.get(i));
      TimeUnit.SECONDS.sleep(1);
    }
  }
}
