package decorator.before;

public class NetworkStream implements Stream {
    @Override
    public char read(int position) {
        return 0;
    }

    @Override
    public void write(char data) {

    }
}
