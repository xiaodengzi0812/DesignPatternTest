package com.stage.designpatterntest.iterator.util;

import java.util.Arrays;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */

public class MyArrayList<E> implements MyList<E> {

    private static final int MIN_CAPACITY_INCREMENT = 12;
    transient Object[] array;
    int size = 0;

    public MyArrayList() {
        array = new Object[0];
    }

    @Override
    public boolean add(E obj) {
        Object[] a = array;
        int s = size;
        if (s == a.length) {
            Object[] newArray = new Object[s + 1];
            // 将a数组的索引从0开始其后s个数，复制到newArray数组的索引从0开始
            // 复制数组
            System.arraycopy(a, 0, newArray, 0, s);
            array = a = newArray;
        }
        a[s] = obj;
        size = s + 1;
        return true;
    }

    @Override
    public void clear() {
        if (size != 0) {
            Arrays.fill(array, 0, size, null);
            size = 0;
        }
    }

    @Override
    public E get(int location) {
        if (location >= size) {
            throw new IndexOutOfBoundsException("数组越界。。");
        }
        return (E) array[location];
    }

    @Override
    public boolean remove(int location) {
        if (location >= size) {
            throw new IndexOutOfBoundsException("数组越界。。");
        }
        Object[] a = array;
        int s = size;
        // 将location后面的数组移动到location位置
        System.arraycopy(a, location + 1, a, location, --s - location);
        a[s] = null;
        size = s;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        Object[] a = array;
        int s = size;
        int removeIndex = -1;
        for (int i = 0; i < s; i++) {
            if (object.equals(a[i])) {
                removeIndex = i;
            }
        }
        if (removeIndex == -1) {
            return false;
        }
        return remove(removeIndex);
    }

    @Override
    public boolean set(int location, E object) {
        Object[] a = array;
        if (location >= size) {
            throw new IndexOutOfBoundsException("数组越界。。");
        }
        a[location] = object;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator<E> {

        private int removalIndex = -1;

        @Override
        public boolean hasNext() {
            return ++removalIndex < size;
        }

        @Override
        public E next() {
            MyArrayList<E> outList = MyArrayList.this;
            return outList.get(removalIndex);
        }

        @Override
        public boolean remove() {
            MyArrayList<E> outList = MyArrayList.this;
            return outList.remove(removalIndex);
        }

        @Override
        public void setMode(Mode mode) {

        }
    }
}
