import org.example.Poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterWithParametersTest {

    @Test
    public void findLastWhenLimitEqualsSizeThisCustomLimitTest() {
        Poster manager = new Poster(3);
        String poster1 = "Бланшет";
        String poster2 = "Вперед";
        String poster3 = "Отель Белград";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Бланшет";
        String poster7 = "Тролли";
        String poster8 = "Номер один";

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);

        String[] actual = manager.findLast();
        String[] expected = {poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void find1LastWhenLimitMoreSizeThisCustomLimitTest() {
        Poster manager = new Poster(5);
        String poster1 = "Бланшет";
        String poster2 = "Вперед";
        String poster3 = "Отель Белград";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Бланшет";
        String poster7 = "Тролли";
        String poster8 = "Номер один";

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);

        String[] actual = manager.findLast();
        String[] expected = {poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void find1LastWhenLimitLessSizeThisCustomLimitTest() {
        Poster manager = new Poster(3);
        String poster1 = "Бланшет";
        String poster2 = "Вперед";
        String poster3 = "Отель Белград";
        String poster4 = "Джентльмены";
        String poster5 = "Человек-невидимка";
        String poster6 = "Бланшет";
        String poster7 = "Тролли";
        String poster8 = "Номер один";

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);
        manager.add(poster7);
        manager.add(poster8);

        String[] actual = manager.findLast();
        String[] expected = {poster8, poster7, poster6};

        Assertions.assertArrayEquals(expected, actual);
    }
}
