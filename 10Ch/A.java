import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class A {

    static class Student{
        private int id;
        public Student(int i){
            id = i;
        }

        public Student(Student s){
            id = s.id + (int)Math.random() + 323;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        final Stream<Object> generate = Stream.generate(() -> new Object());
        Stream<Student> x = Stream.iterate(new Student(12), Student::new);
       // x.forEach(System.out::println);
        Stream<Double> x2 = Stream.iterate(23, previousd -> previousd - 1);


    }

    public double getDouble(){
        return 2;
    }
}
