public class point {
    double x,y;
    public point (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getDistance(point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}
class testContructor{
    public static void main(String[] args) {
        point p = new point(4.5,5.5);
        point point = new point(0.1,0.2);
        System.out.println(p.getDistance(point));

    }
}
