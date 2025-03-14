package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;

public class Linesub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    private Point end; // Ending point

    // Constructors
    public Linesub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // Construct the begin Point
        this.end = new Point(endX, endY); // Construct the end Point
    }

    public Linesub(Point begin, Point end) { // Caller to construct the Points
        super(begin.getX(), begin.getY()); // Need to reconstruct the begin Point
        this.end = new Point(end.getX(), end.getY());
    }

    // Public methods
    @Override
    public String toString() {
        return "(" + super.toString() + ", " + end.toString() + ")";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int beginX) {
        setX(beginX);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setXY(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - getX(), 2) + Math.pow(end.getY() - getY(), 2));
    } // Length of the line

    public double getGradient() {
        return Math.atan2(end.getY() - getY(), end.getX() - getX());
    } // Gradient in radians
}
