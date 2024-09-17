package io.github.hhy50.linker.jmh.linker;

import io.github.hhy50.linker.annotations.Runtime;
import io.github.hhy50.linker.annotations.Static;
import io.github.hhy50.linker.annotations.Target;

@Runtime
@Target.Bind("java.util.ArrayList")
public interface RuntimeMyArrayList {
    @Static(value = false, name = "add")
    void add(Object o);

    @Static(value = false, name = "get")
    void get(int i);

    void clear();
}
