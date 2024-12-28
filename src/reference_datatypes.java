import java.awt.*;
import java.util.Date;
public class reference_datatypes {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);
        Point p1 = new Point(3,7);
                Point p2 = p1;
                p1.x= 4;
        System.out.println(p1);
        System.out.println(p2);
    }

}
