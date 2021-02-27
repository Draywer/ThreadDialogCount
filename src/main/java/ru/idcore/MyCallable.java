package ru.idcore;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int countMessage;

    public MyCallable(int countMessage) {
        this.countMessage = countMessage;
    }

    public int getCountMessage() {
        return countMessage;
    }

    public void setCountMessage(int countMessage) {
        this.countMessage = countMessage;
    }

    @Override
    public Integer call() throws Exception {
        String threadName = Thread.currentThread().getName();
        int result = 0;

        System.out.printf("%s стартовал...\n", threadName);

        for (int i = 0; i < countMessage; i++) {
            Thread.sleep(500);
            System.out.printf("%s сообщение № %d\n", threadName, i);
            result++;
        }
        System.out.printf("%s завершил работу...\n", threadName);
        return result;
    }
}
