package com.openbootcamp.iterator;

public interface UsuarioIterator {
    User next();

    void reset();

    boolean hasMore();

}
