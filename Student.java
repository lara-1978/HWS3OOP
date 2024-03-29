public class Student implements Comparable<Student>{ //указыввем что сравниваем студенов

    private int studentId;// студент с id

    private String name; // имя студента

         //создадим конструктор

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
         //создадим гетерры для наших переменных

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
           //  создадим метод toString

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + "]";// нам это понадобится для StudentGroup
    }

    @Override
    public int compareTo(Student o) { //метод compareTo тут принимает другого студента  и мы должны сравнить его с нашим
        if(studentId > o.getStudentId())    //..если idстудента нашего больше чем idстудента которого мы принимаем то 1
            return 1;
        else if(studentId < o.getStudentId()) // если idстудента нашего меньше чем idстудента которого мы принимаем то -1
            return -1;
        return 0 ;
    }
// и теперь в Main мы можем написать метод sort
}