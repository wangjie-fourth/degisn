package observable;

public class Table implements Component{

    @Override
    public void show(String currentData) {
        System.out.println("currentData = " + currentData);
    }
}
