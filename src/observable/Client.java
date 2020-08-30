package observable;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Table table = new Table();
        Picture picture = new Picture();
        Statistic statistic = new Statistic();

        Subject subject = new Subject(Arrays.asList(table, picture, statistic));


        subject.refresh("data!");
    }
}
