import ra.Caculator;
import ra.Student;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Functional Interface : chi co 1 phuong thuc abstract duy nhat
        // co the khoi tao thong qua lamda epresstion : ()->{}
        // neu interface duoc ke thua tu 1 interface chi co 1 phuong thuc abstract duy nhat
        // thi interface do van la 1 functionalInterface
        // consumer
        List<String> list = Arrays.asList("Hung","Nam","Khanh");
        list.forEach(System.out::println);
        // predicates
        Stream<String> stream1 = list.stream().filter((str)->str.length() >= 4);
        stream1.forEach(str-> System.out.println(str));

        // supplier
        // yeu cau tao 1 danh sach ngau nhien tu 1-10
        Supplier<Integer> supplier = ()-> new Random().nextInt(10);
        Stream<Integer> stream2 = Stream.generate(supplier).limit(5);
        List<Integer> list2 = stream2.collect(Collectors.toList());
        System.out.println(list2);

        //function
        //Function
        Function<Integer, Integer> function = (a)->a*a;
        List<Integer> list3 = Arrays.asList(1,2,3,4);
        Stream<Integer> stream3 = list3.stream().map(function);
        List<Integer> list4 = stream3.collect(Collectors.toList());
        System.out.println(list4);

        // Method reference : tham chieu cua phuong thuc
        // co the goi tham chieu cua 1 phuong thuc tong qua lop (::)
        // tinh tong cua 1 danh sach
        List<Integer> list5 = Arrays.asList(1,2,3,4,5);
        int total = list5.stream().reduce(0, Integer::sum);
        System.out.println(total);
        // trong java da xay dung san ham tinh tong trong lop Integer

        // sap xep cac phan tu trong danh sach sinh vien theo tuoi tang dan
        List<Student> listStudent = Arrays.asList(new Student("Hung", 26), new Student("Nam", 18), new Student("Khanh", 30));
        Collections.sort(listStudent, Comparator.comparing(Student::getName).reversed());
        System.out.println(listStudent);

        // bai toan cho danh sach ten sinh vien va tuoi
        // Khoi tao cac doi tuong student tuong ung va dua vao list
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Hung", 23);
        map.put("Nam", 24);
        map.put("Tuan", 20);
        map.put("An", 18);
        map.put("Duc", 30);
//        List<String> names = Arrays.asList("Hung", "Anh", "Tuan","Hai");
        List<Student> students = map.entrySet().stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students);

        // Loc cac so nguyen lon hon 4 va tinh luy thua bac 3 cua cac so do

        List<Integer> list6 = list2.stream().filter(o->o>4).map(a->a*a*a).collect(Collectors.toList());
        list6.forEach(System.out::println);

        // DateTime API
        // java.util.Date co the bi thay doi / chinh sua thoi gian
        // Date time API khong the thay doi thoi gian cua doi tuong
        // Ho tro nhieu hon cac phuong thuc lam viec voi ngay thang

        // Local
        LocalDate localDate = LocalDate.now();
        System.out.println("Ngay hien tai " + localDate );
        LocalTime localTime = LocalTime.now();
        System.out.println("Thoi gian hien tai " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Ngay gio hien tai " + localDateTime);

        // Zone: theo vung
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Thoi gian + mui gio " +zonedDateTime);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japan = ZonedDateTime.now(zoneId);
        System.out.println("Thoi gian cua tokyo " + japan);
        // Ho tro tinh khoang cach giua 2 date
        LocalDate localDate1 = LocalDate.of(1999,6,18);
        Period period = Period.between(localDate, localDate1);
        System.out.println("thoi gian cach ngay 18/6/1999 la " +period);
        LocalDateTime yesterday = localDateTime.minus(1, ChronoUnit.DAYS);
        // tinh khoang cach giua 2 date time den nano s
        Duration duration = Duration.between(localDateTime, yesterday);
        System.out.println(duration);
        Year year = Year.now();
        System.out.println(year);
        YearMonth ym = YearMonth.now();
        System.out.println(ym);

        // format dateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - hh:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));

        // Optional <> xu li cac truong hop null
        Optional<String> optionalS = Optional.ofNullable("hello");
        String str = optionalS.orElse("dang bi null");
        System.out.println(str);
        optionalS.orElseThrow(()-> new NullPointerException());


        Student[] students1 = new Student[10];
        students1[5] = new Student("hung", 18);
        for (Student ss: students1) {
            System.out.println(Optional.ofNullable(ss).orElse(null));
        }
    }
    public static String inputString(String str){
        return str;
    }

}