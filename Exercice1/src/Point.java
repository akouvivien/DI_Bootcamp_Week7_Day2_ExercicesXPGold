public class Point {
    
    private int x = 0;
    private int y = 0;


    public Point() {
        super();
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return 
            " x=(" + getX() + ")" +
            " y=(" + getY() + ")" 
            ;
    }

    int[] getXY(){
        return new int[] {this.x,this.y};
    }

    void setXY(int x, int y){
        setX(x);
        setX(y);
    }

    double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x -x), 2)+Math.pow((this.y -y), 2));
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((point.x -x), 2)+Math.pow((point.y -y), 2));
    }

    double distance(){
        return Math.sqrt(Math.pow((x), 2)+Math.pow((y), 2));
    }
}