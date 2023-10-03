package ra;


@FunctionalInterface // chuong trinh se sinh ra loi neu k thoa man la 1 functionalInterface
public interface MyFunctionalInterface extends IFace{
    default void move(){
    };
}
