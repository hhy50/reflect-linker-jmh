package io.github.hhy50.linker.jmh.sample;

import org.openjdk.jmh.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class ReflectListSample {

    private static final ArrayList list;

    private static final Method method;

    static {
        list = new ArrayList();
        list.add(new Object());
        try {
            method = List.class.getMethod("get", int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Benchmark
    public void get() throws InvocationTargetException, IllegalAccessException {
        method.invoke(list, 0);
    }
}
