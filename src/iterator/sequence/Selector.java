package iterator.sequence;

public interface Selector {

    boolean hasNext();

    Object getCurrentItem();

    void next();

}
