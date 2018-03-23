package com.service.ccproject.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCcproject {

        CcprojectDelegate ccprojectDelegate = new CcprojectDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ccprojectDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}