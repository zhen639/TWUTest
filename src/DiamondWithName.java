/**
 * Created by liu on 5/30/15.
 */
public class DiamondWithName {
    private int num;
    private String name;

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw(){
        System.out.println("Test Diamond with Name");
        IsoscelesTriangle iTriangle = new IsoscelesTriangle();
        iTriangle.setNum(this.num);
        for (int i = 0; i < this.num; i++) {
            if(i == this.num-1){
                System.out.println(this.name);
                break;
            }
            for (int j = 0; j < this.num*2-1; j++) {
                if (j < this.num-i-1 || j > this.num+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        iTriangle.setNum(this.num);
        iTriangle.drawInverse();
    }
}
