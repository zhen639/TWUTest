/**
 * Created by liu on 5/30/15.
 */
public class IsoscelesTriangle {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void draw(){
        for (int i = 0; i < this.num; i++) {
            for (int j = 0; j < this.num*2-1; j++) {
                if (j < this.num-i-1 || j > this.num+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public void drawInverse(){
        for (int i = this.num-2; i >-1; i--) {
            for (int j = 0; j < this.num*2-1; j++) {
                if(j < this.num-i-1 || j > this.num+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
