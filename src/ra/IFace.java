package ra;

public interface IFace {
    // trước java8 chỉ được định nghĩa các phương thức trừu tượng
    // sau khi java8 ra đời cho phép khai báo các phương thức mặc định

    void display(String s);
    default void makeMove(){
        System.out.println("Hello");
    };
    static void move(){
        System.out.println("Moving....");
    }
}
