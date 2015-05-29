/**
 * Created by liu on 5/30/15.
 */
public class Diamond {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        int n = this.num;
        IsoscelesTriangle iTriangle = new IsoscelesTriangle();
        iTriangle.setNum(n);
        iTriangle.draw();
        for (int i = n-1; i >0; i--) {
            for (int j = 0; j < n*2-1; j++) {
                if(j < n-i-1 || j > n+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
