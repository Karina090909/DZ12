import org.example.Poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterWithoutParametersTest {
    @Test
    public void findAllTest() {
        Poster manager = new Poster();
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
        String[] actual = manager.findAll();
        String[] expected = {poster1, poster2, poster3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitEqualsSizeTest() {
        Poster manager = new Poster();
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

        String[] actual = manager.findLast();
        String[] expected = {poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void find1LastWhenLimitMoreSizeTest() {
        Poster manager = new Poster();
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
    public void find1LastWhenLimitLessSizeTest() {
        Poster manager = new Poster();
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
        String[] expected = {poster8, poster7, poster6, poster5, poster4};

        Assertions.assertArrayEquals(expected, actual);
    }
}