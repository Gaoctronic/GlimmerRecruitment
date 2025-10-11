package uestc.glimmerjava7.task3;

public interface Repository<T> {
    void save(T data);
    T getById(int id);

}
