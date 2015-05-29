public class Main {

    public static void main(String[] args) {
        System.out.println("--------Triangle Exercises---------");
        System.out.println("");

        TestAsterisk testAste = new TestAsterisk();
        testAste.run();

        TestHorizontalLine testHL = new TestHorizontalLine();
        testHL.run();

        TestVerticalLine testVL = new TestVerticalLine();
        testVL.run();

        TestRightTriangle testRT = new TestRightTriangle();
        testRT.run();
        System.out.println("");
        System.out.println("--------------------------------");

        System.out.println("--------Diamond Exercises---------");
        System.out.println("");

        TestIsoscelesTriangle testIT = new TestIsoscelesTriangle();
        testIT.run();

        TestDiamond testD = new TestDiamond();
        testD.run();

        TestDiamondWithName testDiamondWithName = new TestDiamondWithName();
        testDiamondWithName.run();

    }
}
