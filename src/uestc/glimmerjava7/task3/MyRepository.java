package uestc.glimmerjava7.task3;

import java.util.HashMap;
import java.util.Map;

public class MyRepository<T> implements Repository<T> {
    private static final String INVALID_ID = "Invalid ID, please check it again!";
    private final Map<Integer, T> base = new HashMap<>();
    private int currentId;

    public MyRepository() {
        this.currentId = 0;
    }

    @Override
    public void save(T data) {
        base.put(currentId, data);
        currentId++;
    }

    @Override
    public T getById(int id) {
        if (id < 0 || id >= currentId) {
            throw new IllegalArgumentException(INVALID_ID);
        }
        return base.get(id);
    }

    public void printAll() {
        for (int i = 0; i < currentId; i++) {
            System.out.println(base.get(i));
        }
    }
}
