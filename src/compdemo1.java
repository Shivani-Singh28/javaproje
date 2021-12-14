import  java.util.Comparator;
import java.util.TreeSet;

public class compdemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> obj= new TreeSet(new mysort());
        obj.add(4);
        obj.add(23);
        obj.add(6);
        obj.add(10);
        System.out.println(obj);
    }
}
class  mysort implements Comparator<Integer>{
    @Override
    public int  compare(Integer o1, Integer o2) {
        if (o1 > o2)
            return -1;
        else if (o1< o2)
            return 1;
        else
        return 0;
    }
}
