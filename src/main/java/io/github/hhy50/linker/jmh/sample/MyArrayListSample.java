package io.github.hhy50.linker.jmh.sample;

import io.github.hhy50.linker.LinkerFactory;
import io.github.hhy50.linker.exceptions.LinkerException;
import io.github.hhy50.linker.jmh.linker.MyArrayList;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class MyArrayListSample {

    static final MyArrayList myArrayList;

    static {
        try {
            myArrayList = LinkerFactory.createLinker(MyArrayList.class, new ArrayList<>());
        } catch (LinkerException e) {
            throw new RuntimeException(e);
        }
        myArrayList.add(new Object());
    }

    @Setup(Level.Trial)
    public void init() throws LinkerException {

    }

    @Benchmark
    public void get() {
        myArrayList.get(0);
    }
}
