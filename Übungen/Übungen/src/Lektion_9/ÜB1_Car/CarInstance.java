package Lektion_9.ÜB1_Car;

public class CarInstance {
    static Car porschePanamera = new Car("Porsche","Panamera",1500,"Red",350,1803,45);

    public static void main(String[] args){

        porschePanamera.displacement = 299;
        System.out.println(porschePanamera.displacement);
    }



}
