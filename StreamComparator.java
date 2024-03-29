import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream arg0, Stream arg1) {
        return Integer.compare(arg0.getListStudentGroup().size(), arg1.getListStudentGroup().size());
    }
    
}