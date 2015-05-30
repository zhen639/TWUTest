/**
 * Created by liu on 5/30/15.
 */
public class Diamond {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        IsoscelesTriangle iTriangle = new IsoscelesTriangle();
        iTriangle.setNum(this.num);
        iTriangle.draw();
        iTriangle.drawInverse();
    }
}
