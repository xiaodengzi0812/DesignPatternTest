package com.stage.designpatterntest.iterator.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public interface MyList<E> {
    public boolean add(E obj);

    public void clear();

    public E get(int location);

    public MyIterator<E> iterator();

    public boolean remove(int location);

    public boolean remove(Object object);

    public boolean set(int location, E object);

    public int size();
}
