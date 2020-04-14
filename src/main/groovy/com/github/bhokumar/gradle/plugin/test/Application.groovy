package com.github.bhokumar.gradle.plugin.test

class Application {
    public static int add(int total, int item) {
        println "add item ${item} to total ${total} with thread ${Thread.currentThread()}"
        return total + item
    }

     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10)

        int total = numbers.stream()
                .reduce(0, {total, item -> add(total, item)})

        println total
    }
}
