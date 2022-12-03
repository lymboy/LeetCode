import org.junit.Test;

import java.util.*;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-05
 */
public class T729 {

    @Test
    public void test11() {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(47,50));
        System.out.println(myCalendar.book(33,41));
        System.out.println(myCalendar.book(39,45));
        System.out.println(myCalendar.book(33,42));
        System.out.println(myCalendar.book(25,32));
        System.out.println(myCalendar.book(26,35));
        System.out.println(myCalendar.book(19,25));
        System.out.println(myCalendar.book(3,8));
        System.out.println(myCalendar.book(8,13));
        System.out.println(myCalendar.book(18,27));

        //System.out.println(myCalendar.book(37,50));
        //System.out.println(myCalendar.book(33,50));
        //System.out.println(myCalendar.book(4,17));
        //System.out.println(myCalendar.book(35,48));
        //System.out.println(myCalendar.book(8,25));
    }

}

class MyCalendar {

    private Set<Tuple2> content = new TreeSet<>();

    public MyCalendar() {
    }

    public boolean book(int start, int end) {
        for (Tuple2 tuple : content) {
            if (start < tuple.b && end > tuple.a) {
                return false;
            }
        }
        content.add(new Tuple2(start, end));
        return true;
    }
}


class Tuple2 implements Comparable<Tuple2> {
    Integer a;
    Integer b;

    public Tuple2(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Tuple2 o) {
        if (a < o.a) {
            return a-o.a;
        } else if (a-o.a == 0) {
            return b-o.b;
        } else {
            return 1;
        }
    }
}