import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       /*Stream.of(1,23,4,56,7,8)
                .map(x->x*x).forEach(System.out::println);
*/
      /*  List<Integer> numbers = List.of(100);

        numbers.stream().map(x->x*0.10).forEach(System.out::println);*/

       /* List<Student> studentList =  new ArrayList<>();
        studentList.add(new Student(12432,"Tony Stark"));
        studentList.add(new Student(12445,"artur"));
        studentList.add(new Student(12423," John"));
        studentList.add(new Student(12415,"Michael Jackson"));
        studentList.stream().map(Student::getFIO).forEach(System.out::println);*/

        /* Stream.of("olla", "anton").map(x -> x + x.toUpperCase() + " ").forEach(System.out::println);*/

       /* Integer[]numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(numbers);
        List<Integer>integerList = list.stream().map(number->number%3 == 0?0:number*10).collect(Collectors.toList());
        System.out.println(Arrays.toString(numbers));
        System.out.println(integerList);*/

        Integer[] number = {23, 45, 5643, 5, 6542, 3, 56, 42, 45, 12,72,14};
        System.out.println(Arrays.stream(number).filter(x -> x % 2 == 0).max(Integer::compareTo).orElse(0));

      /*          int maxSquare=Arrays.stream(number)
        .max(Integer::compareTo).orElse(0);
        System.out.println(maxSquare);*/


    }
}