package io.github.hhy50.linker.jmh;

import io.github.hhy50.linker.jmh.linker.RuntimeMyArrayList$impl;
import io.github.hhy50.linker.jmh.sample.DirectInvokerSample;
import io.github.hhy50.linker.jmh.sample.MyArrayListSample;
import io.github.hhy50.linker.jmh.sample.ReflectListSample;
import io.github.hhy50.linker.jmh.sample.RuntimeMyArrayListSample;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;

public class JmhMain {


    public static void main(String[] args) throws RunnerException {
        Options build = new OptionsBuilder()
                .include(DirectInvokerSample.class.getName())
                .include(MyArrayListSample.class.getName())
                .include(RuntimeMyArrayListSample.class.getName())
                .include(ReflectListSample.class.getName())
                .forks(1)
                .build();
        new Runner(build).run();
    }

//    public static void main(String[] args) {
//        RuntimeMyArrayList$impl runtimeMyArrayList$impl = new RuntimeMyArrayList$impl(new ArrayList());
//        runtimeMyArrayList$impl.add(new Integer(1));
//        while (true) {
//            runtimeMyArrayList$impl.get(0);
//        }
//    }
}
