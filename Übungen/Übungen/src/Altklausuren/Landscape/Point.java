package Altklausuren.Landscape;

public class Point {
    private int xCoordinate;
    private int yCoordinate;
    private String color;
    public Point(int xCoordinate, int yCoordinate, String color){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }
    public int getXCoordinate(){
        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    public String getColor(){
        return color;
    }

}
