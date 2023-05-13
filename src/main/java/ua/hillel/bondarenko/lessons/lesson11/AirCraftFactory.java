package ua.hillel.bondarenko.lessons.lesson11;

public class AirCraftFactory
{
    public static void main(String[] args) {
        AirPlane jet52 = new AirPlane("Jet", "F52");
        AirPlane boeind747 = new AirPlane("Jet", "F53", 45);
        AirPlane boeind747w = new AirPlane("Jet", "F53", 45, 300);
    }


}
