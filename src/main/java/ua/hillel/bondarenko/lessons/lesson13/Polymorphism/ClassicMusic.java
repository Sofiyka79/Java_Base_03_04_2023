package ua.hillel.bondarenko.lessons.lesson13.Polymorphism;
import ua.hillel.bondarenko.lessons.lesson13.Polymorphism.MusicStyles;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String name) {
        super(name);
    }


    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println(musicStyles.getName()+" play Classic ");
    }
}
