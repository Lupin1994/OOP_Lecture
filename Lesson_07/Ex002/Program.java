package Lesson_07.Ex002;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2); // экземпляр класса
        a.setX(12);
        System.out.println(a);

        System.out.println(a.getX());
        System.out.println(a.getY());    

        Point2D b = new Point2D(10); // экземпляр класса

        System.out.println(b.toString()); // переориенированный toString
        System.out.println(distance(a, b));


    }
}
