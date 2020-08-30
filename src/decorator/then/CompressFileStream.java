package decorator.then;

public class CompressFileStream extends FileStream{

    public CompressFileStream() {
        super();
    }

    @Override
    public char read(int position) {
        return super.read(position);
    }

    @Override
    public void write(char data) {
        char datas = compress(data);
        super.write(datas);
    }

    private char compress(char data) {
        // 压缩算法实现
        return 0;
    }
}
