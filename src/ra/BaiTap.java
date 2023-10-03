package ra;

import java.util.*;
import java.util.stream.Collectors;

public class BaiTap {
    // cho danh sach sinh vien co 10 hoc sinh
    // moi hoc sinh gom cac thuoc tinh : id, name, age, gender, dtb
    // Tu chen du lieu ngau nhien
    // Loc cac hoc sinh co diem TB > 5 va < 6.5
    // Dem so luong sinh vien nam , nu trong danh sach,
    // lay ra sinh vien co diem cao nhat, thap nhat
    // tính điêm trung bình của danh sách các học sinh
    // tihs điểm trung bình của các bạn nam, nữ
    // tính tổng số tuổi của tất cả các học sinh
    public static void main(String[] args) {
        List<Student1> student1List = new ArrayList<>();
        student1List.add(new Student1(1, 23,6.5,"hung",true));
        student1List.add(new Student1(2, 21,8.5,"Hoa",false));
        student1List.add(new Student1(3, 20,5.5,"Hanh",false));
        student1List.add(new Student1(4, 30,9.5,"Toan",true));
        student1List.add(new Student1(5, 26,6.5,"Duc",true));
        student1List.add(new Student1(6, 23,6.5,"Manh",true));
        student1List.add(new Student1(7, 29,4.5,"Sang",true));
        student1List.add(new Student1(8, 24,7.5,"Huyen",false));
        student1List.add(new Student1(9, 21,6.5,"Ngoc",false));
        student1List.add(new Student1(10, 23,5.3,"Hoang",true));
        List<Student1> list = student1List.stream().filter(e-> e.getDtb() > 5 && e.getDtb() < 6.5).collect(Collectors.toList());
        int soluongHSNam = (int) student1List.stream().filter(Student1::isGender).count();
        int soluongHSNu = (int) student1List.stream().filter(e->!e.isGender()).count();
        Optional<Student1> maxSTD = student1List.stream().max(Comparator.comparingDouble(Student1::getDtb));
        Optional<Student1> minSTD = student1List.stream().min(Comparator.comparingDouble(Student1::getDtb));
        double diemTBHS = student1List.stream().map(Student1::getDtb).reduce(0.0, Double::sum) / (double) student1List.size();
        double diemTBHSNam = student1List.stream().filter(Student1::isGender).map(Student1::getDtb).reduce(0.0, Double::sum) / (double) soluongHSNam;
        double diemTBHSNu = student1List.stream().filter(e->!e.isGender()).map(Student1::getDtb).reduce(0.0, Double::sum) / (double) soluongHSNu;
        System.out.println("Các học sinh có DTB > 5 và < 6.5 là :");
        System.out.println(list);
        System.out.println("Số lượng học sinh nam là : ");
        System.out.println(soluongHSNam);
        System.out.println("Số lượng học sinh nữ là :");
        System.out.println(soluongHSNu);
        System.out.println("Học sinh có điểm trung bình thấp nhất là :");
        System.out.println(minSTD.orElse(new Student1()));
        System.out.println("Hoc sinh có điểm trunh bình cao nhất là :");
        System.out.println(maxSTD.orElse(new Student1()));
        System.out.println("Điểm trung bình của toàn bộ học sinh là :");
        System.out.println(diemTBHS);
        System.out.println("Điểm trung bình của toàn bộ học sinh nam là :");
        System.out.println(diemTBHSNam);
        System.out.println("Điểm trung bình của toàn bộ học sinh nữ là :");
        System.out.println(diemTBHSNu);

    }


}
