package ru.idcore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<MyCallable> myCallableList = new ArrayList<>();
        final ExecutorService threadPool = Executors.newFixedThreadPool((Runtime.getRuntime().availableProcessors()));
        final Integer result;

        myCallableList.add(new MyCallable(5));
        myCallableList.add(new MyCallable(4));
        myCallableList.add(new MyCallable(6));

        result = threadPool.invokeAny(myCallableList);
        System.out.println("Количество сообщений: " + result);
        threadPool.shutdown();


    }
}
