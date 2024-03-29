import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>{// тут работаем с нашими студентами, реализуем Itarable
    
    private List<Student> studentList; // группа студентов обязательно в привате

          //создадим конструктор
    public StudentGroup(List<Student> studentList) {  //конструктор по готовому списку
        this.studentList = studentList;
    }
      // пустой конструктор
    public StudentGroup() { //по пустому списку
        studentList = new ArrayList<>();  //т.е. тут будет делаться новый список
    }

    //сделаем метод по добавлению новых студентов

    public StudentGroup(String string) {
        
    }
    public void addStudent(Student student){ //в этом методе принимаем студента и добавляем в наш список
        studentList.add(student);
    }


    //сделаем метод который возвращает весь список наших студентов

    public List<Student> getStudentList(){
        return studentList;
    }
    @Override
    public Iterator<Student> iterator() {
        
        return new StudentGroupIterator(this); //тут перадаем экземпляр класса StudenGroup из строки   StudentGroup studentGroup = new StudentGroup(); строка 11(Maim)
    }
}
// сам итератор реализуется в другом классе  он тут не реализуется.  нам его надо создать.



