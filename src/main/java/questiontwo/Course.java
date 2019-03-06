package questiontwo;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private int courseNum;
    private String name;
    private ArrayList<Subject> subjects;
    private String duration;

    private Course(){

    }
    public int getCourseNum() {
        return courseNum;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public String getDuration() {
        return duration;
    }
    public Course(Builder builder){
        this.courseNum = builder.courseNum;
        this.name = builder.name;
        this.subjects = builder.subjects;
        this.duration = builder.duration;
    }
    public static class Builder{
        private int courseNum;
        private String name;
        private ArrayList<Subject> subjects;
        private String duration;

        public Builder courseNum(int value){
            this.courseNum = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder subjects(ArrayList<Subject> value){
            this.subjects = value;
            return this;
        }
        public Builder duration(String value){
            this.duration = value;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseNum == course.courseNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum);
    }
}
