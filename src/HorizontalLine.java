/**
 * Created by liu on 5/29/15.
 */
public class HorizontalLine{
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        for (int i = 0; i < this.num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
