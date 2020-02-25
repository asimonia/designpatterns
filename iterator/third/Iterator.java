package iterator.third;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();
}
