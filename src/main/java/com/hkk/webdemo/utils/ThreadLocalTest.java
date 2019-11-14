package com.hkk.webdemo.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalTest {

 static class Test{

   static ThreadLocal<String> threadLocal = new ThreadLocal();

   public void setString() {
     threadLocal.set(Thread.currentThread().getName());
   }

   public String getString() {
     return threadLocal.get();
   }
  }

  static class RunTest implements Runnable{

    @Override
    public void run() {
      Test test = new Test();
      test.setString();
      System.out.println(test.getString());
      System.out.println(test.threadLocal.hashCode());
    }
  }

  public static void main(String[] args) {
    AtomicInteger atomicInteger = new AtomicInteger(100);
    System.out.println(atomicInteger.addAndGet(Integer.MAX_VALUE));
    System.out.println(100 + Integer.MAX_VALUE);
    new Thread(new RunTest()).start();
    new Thread(new RunTest()).start();
    new Thread(new RunTest()).start();
  }

}
