package io.github.hhy50.linker.jmh.sample;

import io.github.hhy50.linker.LinkerFactory;
import io.github.hhy50.linker.exceptions.LinkerException;
import io.github.hhy50.linker.jmh.linker.RuntimeMyArrayList;
import io.github.hhy50.linker.jmh.linker.RuntimeMyArrayList$impl;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class RuntimeMyArrayListSample {

    volatile RuntimeMyArrayList myArrayList;

    @Setup(Level.Trial)
    public void init() throws LinkerException {
//        LinkerFactory.setOutputPath("C:\\Users\\hanhaiyang\\Desktop\\reflect-linker-jmh\\target\\");
//        myArrayList = new RuntimeMyArrayList$impl(new ArrayList<>());
        myArrayList = LinkerFactory.createLinker(RuntimeMyArrayList.class, new ArrayList<>());
        myArrayList.add(new Object());
    }

    @Benchmark
    public void get() {
        myArrayList.get(0);
    }
}
