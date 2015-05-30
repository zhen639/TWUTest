/**
 * Created by liu on 5/30/15.
 */
public class FizzBuzz {
    private String str1 = "Fizz";
    private String str2 = "Buzz";
    private int num = 100;

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void run(){
        for (int i = 1; i < this.num+1; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.println(this.str1+str2);
            }else if(i%3 == 0){
                System.out.println(this.str1);
            }else if(i%5 == 0){
                System.out.println(str2);
            }else{
                System.out.println(i);
            }
        }
    }
}
