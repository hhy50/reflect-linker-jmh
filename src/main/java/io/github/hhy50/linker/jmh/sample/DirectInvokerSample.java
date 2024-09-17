package io.github.hhy50.linker.jmh.sample;

import org.openjdk.jmh.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class DirectInvokerSample {

    private static ArrayList list;

    @Setup(Level.Iteration)
    public void init() {
        list = new ArrayList();
        list.add(new Object());
    }

    @Benchmark
    public void get() throws InvocationTargetException, IllegalAccessException {
        list.get(0);
    }
}
