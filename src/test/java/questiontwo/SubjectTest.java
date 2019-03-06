package questiontwo;

import org.junit.*;

import static org.junit.Assert.*;

public class SubjectTest {

    private Subject subject;
    private Subject subject1;
    @Before
    public void setUp() throws Exception {
        subject = new Subject
                .Builder()
                .subId(1005)
                .name("Information Systems 3")
                .duration("1 year")
                .isCompulsory(true)
                .build();
        subject1 = new Subject.Builder()
                .subId(1005)
                .isCompulsory(true)
                .name("Information Systems 3")
                .duration("1 year")
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = AssertionError.class)
    public void getSubId() {
        Assert.assertEquals(subject.getSubId(),1005);
    }

    @Test
    public void getName() {
        Assert.assertEquals(subject.getName(),"Information Systems 3");
    }


    @Test
    public void isCompulsory() {
        Assert.assertEquals(subject.isCompulsory(),true);
    }

    @Test
    public void getDuration() {
        Assert.assertEquals(subject.getDuration(),"1 year");
    }

    @Ignore
    @Test
    public void testObjectEquality(){

        Assert.assertEquals(subject,subject1);
    }
    //@Ignore
    @Test(timeout = 10000)
    public void testObjectIdentity(){

        subject1 = subject;
        Assert.assertSame(subject1,subject);
        while (true);
    }




}