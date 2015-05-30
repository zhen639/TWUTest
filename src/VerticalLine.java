/**
 * Created by liu on 5/30/15.
 */
public class VerticalLine {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        for (int i = 0; i < this.num; i++) {
            System.out.println("*");
        }
        System.out.print("");
    }
}
