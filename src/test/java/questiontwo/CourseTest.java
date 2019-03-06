package questiontwo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseTest {

    private Course course;
    private Course degree;
    private ArrayList<Subject> subjects;

    @Before
    public void setUp() throws Exception {
        subjects = new ArrayList<>();
        subjects.add(new Subject.Builder().subId(122).name("Communication Network").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(123).name("Multimedia").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(122).name("Project Management").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(122).name("Professional Practise").isCompulsory(false).build());
        course = new Course
                .Builder()
                .courseNum(214)
                .name("Information Technology")
                .duration("3 years")
                .subjects(subjects)
                .build();
    }

    @Ignore
    @Test
    public void getCourseNum() {
        Assert.assertEquals(course.getCourseNum(),215);
    }


    @Test
    public void getName() {
        Assert.assertEquals(course.getName(),"Information Technology");
    }


    @Test
    public void getSubjects() {
        Assert.assertEquals(course.getSubjects(),null);
    }


    @Test
    public void getDuration() {
        Assert.assertEquals(course.getDuration(),"3 years");
    }
}