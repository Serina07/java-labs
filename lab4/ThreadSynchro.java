package lab4;

//Write a program to show thread synchronization.

import java.text.SimpleDateFormat;
import java.util.Date;

class MySharedResource {
    public synchronized void myResource(String threadName) {
        String entryTime = getCurrentTime();
        System.out.println("(" + entryTime + ") " + threadName + " has entered the resource.");

        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        String exitTime = getCurrentTime();
        System.out.println("(" + exitTime + ") " + threadName + " is leaving the resource.");
    }

    private String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
        return formatter.format(new Date());
    }
}

class MyThread extends Thread {
    MySharedResource resource;
    String threadName;

    public MyThread(MySharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    public void run() {
        resource.myResource(threadName);
    }
}

public class ThreadSynchro {
    public static void main(String[] args) {
        MySharedResource sharedResource = new MySharedResource();

        MyThread t1 = new MyThread(sharedResource, "Thread 1");
        MyThread t2 = new MyThread(sharedResource, "Thread 2");
        MyThread t3 = new MyThread(sharedResource, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}