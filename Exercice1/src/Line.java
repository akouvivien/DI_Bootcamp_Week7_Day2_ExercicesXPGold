public class Line {

    private Point begin;
    private Point end;


    public Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1, y1);
        this.end =  new Point(x2, y2);
    }

    public Line(Point begin, Point end ) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return this.begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    int getBeginX(){
        return this.begin.getX();
    }

    void setBeginX(int x){
        this.begin.setX(x);
    }

    int getBeginY(){
        return this.begin.getY();
    }

    void setBeginY(int y){
        this.begin.setY(y);
    }

    int[] getBeginXY(){
        return this.begin.getXY();
    }

    void setBeginXY(int x, int y){
        this.begin.setXY( x, y);
    }

    int getEndX(){
        return this.end.getX();
    }

    void setEndX(int x){
        this.end.setX(x);
    }

    int getEndY(){
        return this.end.getY();
    }

    void setEndY(int y){
        this.end.setX(y);
    }

    int[] getEndXY(){
        return this.end.getXY();
    }

    void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }


    @Override
    public String toString() {
        return "Line ["+ "begin=("+begin.getX()+","+begin.getY()+")"+","+" end=("+end.getX()+","+end.getY()+"]";
    }

    double getLengh(){
        return begin.distance(end);
    }



    
}