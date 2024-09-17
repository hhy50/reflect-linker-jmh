package io.github.hhy50.linker.jmh.linker;

import io.github.hhy50.linker.annotations.Target;


@Target.Bind("java.util.ArrayList")
public interface MyArrayList {

    void add(Object o);

    void get(int i);

    void clear();
}
