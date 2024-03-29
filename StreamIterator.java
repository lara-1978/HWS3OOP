import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private List<StudentGroup> groupsList;
    private int count = 0;

    public StreamIterator(Stream groups) {
        this.groupsList = Stream.getgroups();
    }

    @Override
    public boolean hasNext() {
        return count < groupsList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return groupsList.get(count++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            groupsList.remove(count);
    }

}