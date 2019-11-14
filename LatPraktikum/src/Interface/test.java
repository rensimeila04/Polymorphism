package Interface;



/**
 *
 * @author Asus
 */
public class test {
    public static void main(String[] args) {
       Line yy = new Line(20, 30, 30, 50);
        System.out.println(yy.getLength());
        System.out.println(yy.isGreater(yy, yy));
        System.out.println(yy.isLess(yy, yy));
        System.out.println(yy.isEqual(yy, yy));
    }
}
