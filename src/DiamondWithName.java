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
        int n = this.num;
        String name = this.name;
        IsoscelesTriangle iTriangle = new IsoscelesTriangle();
        iTriangle.setNum(n);
        for (int i = 0; i < n; i++) {
            if(i == n-1){
                System.out.println(name);
                break;
            }
            for (int j = 0; j < n*2-1; j++) {
                if (j < n-i-1 || j > n+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        iTriangle.setNum(n);
        iTriangle.drawInverse();
    }
}
