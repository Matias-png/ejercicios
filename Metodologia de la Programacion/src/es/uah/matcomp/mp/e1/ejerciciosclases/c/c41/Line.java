package es.uah.matcomp.mp.e1.ejerciciosclases.c.c41;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line(Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return begin.toString() + " " + end.toString();
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setX(endX);
        this.end.setY(endY);
    }

    public int getLength() {
        return (int) Math.sqrt((Math.pow(end.getX(), 2) - Math.pow(begin.getX(), 2) + Math.pow(end.getY(), 2) - Math.pow(begin.getY(), 2)));
    } // Length of the line

    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());


    } // Gradient in radians
// Math.atan2(yDiff, xDiff)
}