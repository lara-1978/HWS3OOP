// public class Main {
    
    // public static void main(String[] args) {
//         Student student1 = new Student(1, "aaa");
//         Student student2 = new Student(2, "BBB");
//         Student student3 = new Student(3, "AAA");


//         //теперь из этих студентов сделаем группу студентов

//         StudentGroup studentGroup = new StudentGroup();
//         studentGroup.addStudent(student3);
//         studentGroup.addStudent(student1);
//         studentGroup.addStudent(student2);

//     // и теперь после того как мы сделали с студентгрупп метод Iterator тут теперь можеи перебрать студентов просто через foreach
//         for (Student student : studentGroup) {    // перебираем студентгрупп (:StudentGroup-экземпляр)
//             System.out.println(student);
//         }

//         System.out.println();
//         for (Student student : getSortedStudentGroup(studentGroup)){   //в этот метод передаем для сортировки студентов
//             System.out.println(student);
//         }


//         System.out.println();
//         for (Student student : getSortedStudentGroupByName(studentGroup)){   //в этот метод передаем для сортировки студентов по имени
//             System.out.println(student);
//         }

        
//     }
//     //     //при помощи итератора их переберем
//     //     StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);// передаем сюда группу студентов
//     //     // а теперь будем  перебирать наших студентов т.е.через цикл while
//     //     while(iterator.hasNext()) {
//     //         System.out.println(iterator.next());
//     //     }
//     // }


//            // пишем метод сорт и он будет возвращать отсортированную группу студентов
//         public  static List<Student> getSortedStudentGroup(StudentGroup s){ // тут будет создоватся новый массив (static что б не создовать экземпляр класса)
//             List<Student> studentList = new ArrayList<>(s.getStudentList());
//             Collections.sort(studentList);
//             return studentList;  // отсоритрованый список нам вернется
//         }


//         public static List<Student> getSortedStudentGroupByName(StudentGroup studentGroup){ // пишем метод сортировки по имени
//             List<Student> studentList = new ArrayList<>(studentGroup. getStudentList());
//             studentList.sort(new StudentComparator()); // тут мы напрямую обращаемся к нашему списку
//             return studentList;
//         }
// }


// // Student [studentId=3, name=AAA]
// // Student [studentId=1, name=aaa]
// // Student [studentId=2, name=BBB] произвольный список

// // Student [studentId=1, name=aaa]
// // Student [studentId=2, name=BBB]   отсортированный по id
// // Student [studentId=3, name=AAA]

// // Student [studentId=3, name=AAA] отсоритрованный по имени тут код  у буквы А меньше соответственно вывелось первым
// // Student [studentId=2, name=BBB]
// // Student [studentId=1, name=aaa]


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream("поток 2021");
        Stream stream2 = new Stream("поток 2022");
        Stream stream3 = new Stream("поток 2023");

        stream1.addStudentGroup(new StudentGroup("A111"));
        stream1.addStudentGroup(new StudentGroup("B112"));
        stream1.addStudentGroup(new StudentGroup("G113"));

        stream2.addStudentGroup(new StudentGroup("R223"));
        stream2.addStudentGroup(new StudentGroup("R224"));

        stream3.addStudentGroup(new StudentGroup("Q333"));
        stream3.addStudentGroup(new StudentGroup("Q334"));
        stream3.addStudentGroup(new StudentGroup("Q335"));
        // System.out.println();

        // System.out.println("поток1");
        // for (StudentGroup group : stream1) {
        // System.out.println(group);
        // }
        // System.out.println();

        // System.out.println("поток2");
        // for (StudentGroup group : stream2) {
        // System.out.println(group);
        // }
        // System.out.println();

        // System.out.println("поток3");
        // for (StudentGroup group : stream3) {
        // System.out.println(group);
        // }
        // System.out.println();

        StreamIterator iterator = new StreamIterator(stream1);
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        }

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // список потоков до сортировки
        for (Stream stream : streams) {
            System.out.print(stream.getName());
            for (StudentGroup group : stream) {
                System.out.print(" " + group.getStudentList());
            }
            System.out.println();
        }
        System.out.println();

        // Создаем объект StreamComparator
        StreamComparator comparator = new StreamComparator();

        // Сортируем список потоков
        Collections.sort(streams, comparator);

        // список потоков после сортировки
        for (Stream stream : streams) {
            System.out.print(stream.getName());
            for (StudentGroup group : stream) {
                System.out.print(" " + group.getStudentList());
            }
            System.out.println();
        }
        System.out.println();

        // Выводим отсортированные потоки с названием и количеством групп
        for (Stream stream : streams) {
            System.out.println(stream.getName() + " - количество групп: " + stream.size());
        }
    }

}