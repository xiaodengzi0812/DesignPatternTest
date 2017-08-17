package com.stage.designpatterntest.iterator.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */

public interface MyIterator<E> {

    enum Mode {
        MODE_ASC,
        MODE_DESC,
    }

    boolean hasNext();

    E next();

    boolean remove();

    void setMode(Mode mode);

}
