package Lesson_07.Ex002;

/**
 * it is point 2D
 */
public class Point2D  {
    int x, y; //поле

    /**
     * This is constacture
     * @param valueX this is coordinate X
     * @param valueY this is coordinate Y
     */
    public Point2D(int valueX,int valueY ) {
       x = valueX;
       y = valueY;
    }

    public Point2D(int value) {
        this(value,value);
    }
    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }

    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }
    private String getInfo(){
        return String.format("x: %d; y: %d", x,y);
    }
    @Override
    public String toString() {

        return getInfo();
    }

    public static void distance(Point2D a, Point2D b) {
    }
}
