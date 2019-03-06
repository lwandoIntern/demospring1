package questiontwo;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name,surname,address,zipCode;

    private Student(){

    }
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }
    public Student(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.zipCode = builder.zipCode;
    }

    public static class Builder{
        private int studentId;
        private String name,surname,address,zipCode;

        public Builder studentId(int value){
            this.studentId = value;
            return this;
        }
        public Builder name(String value){
            this.name =value;
            return this;
        }
        public Builder surname(String value){
            this.surname = value;
            return this;
        }
        public Builder address(String value){
            this.address = value;
            return this;
        }
        public Builder zipCode(String value){
            this.zipCode = value;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
