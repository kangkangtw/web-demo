package com.hkk.webdemo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {

    @Before
    public void setUp(){
        System.out.println("before");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
        System.out.println("testAdd");
    }

    @Test
    public void testMulti() {
        System.out.println("testMulti");
    }

    @Ignore
    @Test
    public void ignore() {
        System.out.println("ignore");
    }

    @Test(expected = RuntimeException.class)
    public void throwException() {
        System.out.println("throwException");
        throw new RuntimeException();
    }

    @Test(timeout = 1000)
    public void timeOut() throws InterruptedException {
        TimeUnit.MICROSECONDS.sleep(500);
        System.out.println("in test case 1");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @After
    public void destroy(){
        System.out.println("after");
    }

}
