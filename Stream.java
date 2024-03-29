import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    private List<StudentGroup> listStudentGroup;

    public List<StudentGroup> getListStudentGroup() {
        return listStudentGroup;
    }

    public void setListStudentGroup(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    private int index;

    public Stream(List<StudentGroup> studentsStreame) {
        this.listStudentGroup = studentsStreame;
        this.index = -1;
    }

    public Stream() {
        this.listStudentGroup = new ArrayList<>();
        this.index = -1;
    }

    public Stream(String string) {
        
    }

    public void addStudentGroup(StudentGroup group) {
        group.add(group);
    }




    @Override
    public boolean hasNext() {
        return index < listStudentGroup.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return listStudentGroup.get(++index);
    }

    @Override
    public void remove() {
        if (index >= 0 && index < listStudentGroup.size()) {
            listStudentGroup.remove(index);
        }
    }

    public static List<StudentGroup> getgroups() {
    
        throw new UnsupportedOperationException("Unimplemented method 'getgroups'");
    }

    public String[] getName() {
    
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String[] size() {
        
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

}