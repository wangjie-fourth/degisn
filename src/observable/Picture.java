package observable;

public class Picture implements Component{

    @Override
    public void show(String data) {
        System.out.println("Picture = " + data);
    }
}
