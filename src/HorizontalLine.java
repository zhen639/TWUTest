/**
 * Created by liu on 5/29/15.
 */
public class HorizontalLine{
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("");
        }
    }
}
