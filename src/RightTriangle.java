/**
 * Created by liu on 5/30/15.
 */
public class RightTriangle {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        for (int i = 0; i < this.num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
