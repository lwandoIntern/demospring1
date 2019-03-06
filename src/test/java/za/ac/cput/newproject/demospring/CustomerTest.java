package za.ac.cput.newproject.demospring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void equals() {
        Customer customer = new Customer.Builder().id("1").name("Nceba").surname("Goniwe").address("13 Geranium Street")
                .clan("Zizi").build();
        Assert.assertEquals(customer.equals(customer),customer.equals("True"));
    }
}