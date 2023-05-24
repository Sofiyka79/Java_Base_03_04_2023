package ua.hillel.bondarenko.lessons.lesson13.Polymorphism;
import ua.hillel.bondarenko.lessons.lesson13.Polymorphism.MusicStyles;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println();
    }
}
