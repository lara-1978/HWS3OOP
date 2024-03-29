import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{ //тут мы реализуем наш интерфейс
    //и тут создаем итератор StudentGroup и в нем будем перебирать студентов из StudentGroup

//  тут должны быть переменныe (в private)

    private List<Student> studentList; //переменная кот.хранит список наших студентов
    private int count = 0;    // переменная счетчика для перебора индекса

    //этот список будем принимать через конструктор
    public StudentGroupIterator(StudentGroup studentGroup) { //тут принимаем группу студентов
        this.studentList = studentGroup.getStudentList();  //из этой группы студентов брать наш список и сохранять
    }

//сделущим шагом нам надо обязательно создать методы hasNext и Next

    @Override
    public boolean hasNext() {
        return count < studentList.size(); //если след элемент  меньше  то будет true а если больше то будет false
    }

    @Override
    public Student next() {
        //можно в этом методе ещё написать
        if(!hasNext())
            return null;  //если наш count вышел за пределы массива тогда возвращаем null
        return studentList.get(count++); // тут возвращает 0-oй элемю\. и потом прибавляет индекс на 1 и тд.
    }

    @Override
    public void remove() {  //в этом методе удаляется текущий элемент
        studentList.remove(count); //обращаемся к studentList и удаляем коунт
    }
}
