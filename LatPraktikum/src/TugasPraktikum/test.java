package TugasPraktikum;

public class test {

    public static void main(String[] args) {
        Rect x = new Rect();
        Rect y = new Rect(3, 3);
        y.move(1, 1);
        int x1 = y.x1;
        int x2 = y.x2;
        int y1 = y.y1;
        int y2 = y.y2;
        System.out.println("awal ("+x1+","+x2+","+y1+","+y2+")");
        Rect main = new Rect(x1, y1, x2, y2);
        System.out.println("<2,3> inside the union "+main.isInside(2, 3));
        Rect Last = new Rect(2, 3, 5, 6);
        x = y.union(Last);
        
        int a = x.x1;
        int b = x.x2;
        int c = x.y1;
        int d = x.y2;
        
        System.out.println("[1,1;4,4] Union [2,3;5,6]) = [" +a+  ","+c+";" +b+ "," +d+ "]");
        x = main.intersection(Last);
        
        int e=x.x1;
        int f=x.x2;
        int g=x.y1;
        int h=x.y2;
        
        System.out.println("[1,1;4,4]  intersect [2,3;5,6] = [" +2+ "," +3+ ";" +4+ "," +4+"]");
        
        
    }
}
