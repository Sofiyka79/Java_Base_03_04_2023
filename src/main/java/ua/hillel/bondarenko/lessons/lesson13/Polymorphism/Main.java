package ua.hillel.bondarenko.lessons.lesson13.Polymorphism;

//Зробіть клас MusicStyles, який міститиме метод playMusic()
//Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//Спадкоємці повинні реалізовувати метод playMusic().
//У мейн-класі створіть музичні гурти для кожного стилю
//За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()
public class Main {
    public static void main(String[] args) {

      MusicStyles[] musicStyles ={
              new PopMusic("Pink- Cover Me In Sunshine "),
              new RockMusic("Scorpions - Still Loving You"),
              new ClassicMusic("Mozart - Requiem")
      };

        for (MusicStyles musicStyle : musicStyles) {
        musicStyle.playMusic(musicStyle);
        }
    }
}
