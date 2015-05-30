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

    public void run(){
//        if(isPrime(this.num)){
//            System.out.println("The prime factor of " + this.num + " are [1, " + this.num + "]");
//        }else{
//            for (int i = 4; i < this.num+1; i++) {
//                if(i/)
//            }
//        }

//        if(this.num <= 1){
//            System.out.println(this.num + " doesn't have prime factor!");
//        }else{
//            for (int i = 2; i < this.num+1; i++) {
//                if(isPrime(this.num%i)){
//                    this.primeFactorList.add();
//                }
//            }
//        }

        int n = this.num;
        int flag = 0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                flag++;
                if(!primeFactorList.contains(i)){
                    primeFactorList.add(i);
                }
//                if(flag==1)
//                    System.out.print(n+"="+i);
//                else
//                    System.out.print("×"+i);
                n = n/i;
                i--;
            }
        }
//        for (int i = 0; i < primeFactorList.size(); i++) {
//            System.out.println("prime Factor is " + primeFactorList.;
//        }
        for (int i: primeFactorList){
            System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
