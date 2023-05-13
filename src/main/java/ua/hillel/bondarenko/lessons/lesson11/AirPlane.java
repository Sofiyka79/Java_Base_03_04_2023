package ua.hillel.bondarenko.lessons.lesson11;

public class AirPlane {
    String type;
    String name;
    int firstClassPassengers;
    int SecondClassPassengers;

    AirPlane(String type, String name){
        this.type = type;
        this.name = name;

        System.out.println("вініщувач тіп:"+ this.type + "імя"+ this.name);
    }

    public AirPlane(String type, String name, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        SecondClassPassengers = secondClassPassengers;

        System.out.println("вініщувач тіп:"+ this.type + "імя"+ this.name+ "килькисть пассажирів"+secondClassPassengers);

    }

    public AirPlane(String type, String name, int firstClassPassengers, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.firstClassPassengers = firstClassPassengers;
        SecondClassPassengers = secondClassPassengers;

        System.out.println("вініщувач тіп:"+ this.type + "імя"+ this.name+ "килькисть пассажирів"+secondClassPassengers+ firstClassPassengers);

    }
}
