import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu on 5/30/15.
 */
public class PrimeFactors {
    private int num;
    //    private ArrayList primeFactorList = new ArrayList();
    private ArrayList<Integer> primeFactorList = new ArrayList<Integer>();
//    private int[] pfList;

    public void setNum(int num) {
        this.num = num;
    }

    public void run() {
        int n = this.num;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (!primeFactorList.contains(i)) {
                    primeFactorList.add(i);
                }
                n = n / i;
                i--;
            }
        }
        System.out.println("The prime factors of " + this.num + " are: ");
        for (int i : primeFactorList) {
            System.out.print(i+ " ");
        }
    }
}
