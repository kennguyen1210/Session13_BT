package ra;

public class Test {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.makeMove();
        // goi phuong thuc tinh
        IFace.move();
        MyFunctionalInterface myFunctionalInterface = (s)->{};

        // bai toan
        // Xay dung phuong thuc tinh tong, hieu, tich
        // tinh tong 2 so
        calculator(2,3,(a,b)->{
            System.out.println(a+b);
        });
        // tinh hieu 2 so
        calculator(2,3,(a,b)->{
            System.out.println(a-b);
        });
        // tinh tich 2 so
        calculator(2,3,(a,b)->{
            System.out.println(a*b);
        });
    }
    public static void calculator(int a,int b,Calculator cal){
        cal.cal(a,b);
    }
}
