package com.github.bhokumar.gradle.plugin.test

import java.util.concurrent.ForkJoinPool
import java.util.concurrent.TimeUnit
import java.util.stream.Stream

class ApplicationProcess {

    static int transform(int item) {
        println "transform item ${item} ${Thread.currentThread()}"
        item
    }

    static void process(Stream<Integer> stream) {
        ForkJoinPool pool = new ForkJoinPool(100)
        pool.submit({stream.forEach({})})

        pool.shutdown()
        pool.awaitTermination(10, TimeUnit.SECONDS)
    }

    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,
        11,12,13,14,15,16,17,18,19,20)

        process(numbers.parallelStream().map({e -> transform(e)}))
    }
}
