package com.coffee.test;

import org.junit.After;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class TestBase  {
    private ByteArrayOutputStream outputStream;

    public String getLastPrintedStatement() {
        return outputStream.toString();
    }

    @Before
    public void setupTestBase() {
        MockitoAnnotations.initMocks(this);

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDownTestBase() {
        System.setOut(null);
    }
}
