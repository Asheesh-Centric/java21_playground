package day5_build;


import java.util.Collection;
import java.util.List;

public interface Repository<T extends Entity> {
    T save(T object);

    void saveAll(Collection<? extends T> collections);

    void copyTo(Collection<? super T> collection);

    T findById(T obj);

}
