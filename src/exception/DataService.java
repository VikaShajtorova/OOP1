package exception;

public interface DataService {
    void add(String text) throws LowMemoryException;
    String get() throws NoSuchElementException;
}
