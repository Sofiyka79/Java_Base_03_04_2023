package ua.hillel.bondarenko.lessons.lesson13.Polymorphism;
import ua.hillel.bondarenko.lessons.lesson13.Polymorphism.MusicStyles;
public class RockMusic extends MusicStyles{

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println("");
    }
}
