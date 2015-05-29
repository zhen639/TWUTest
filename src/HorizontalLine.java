/**
 * Created by liu on 5/29/15.
 */
public class HorizontalLine{
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        int n = this.num;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
