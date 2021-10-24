package main;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import singleton.Parlour;
import factory.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    public void singletonPatternTest() {
        Parlour parlour = Parlour.getInstance();
        Parlour parlour1 = Parlour.getInstance();

        assertEquals(parlour, parlour1);
    }

    @Test
    public void factoryPatternTest() {
        boolean answer;
        CustomerFactory factory = new CustomerFactory();
        CustomerType customer = factory.getInstance("Female");
        if (customer instanceof FemaleCustomer) {
            answer = true;
        } else
            answer = false;

        assertEquals(true, answer);
    }


}
