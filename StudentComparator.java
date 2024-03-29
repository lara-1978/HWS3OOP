import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {    //тут сравниваем студентов

        return o1.getName().compareTo(o2.getName());
    }
}
