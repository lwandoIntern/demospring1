package questiontwo;

import java.util.Objects;

public class Subject {
    private int subId;
    private String name;
    private boolean isCompulsory;
    private String duration;

    private Subject(){

    }
    public Subject(Builder builder){
        this.subId = builder.subId;
        this.name = builder.name;
        this.isCompulsory = builder.isCompulsory;
        this.duration = builder.duration;
    }

    public int getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public boolean isCompulsory() {
        return isCompulsory;
    }

    public String getDuration() {
        return duration;
    }
    public static class Builder{
        private int subId;
        private String name;
        private boolean isCompulsory;
        private String duration;

        public Builder subId(int value){
            this.subId = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder isCompulsory(boolean value){
            this.isCompulsory = value;
            return this;
        }
        public Builder duration(String value){
            this.duration = value;
            return this;
        }
        public Subject build(){
            return new Subject(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return subId == subject.subId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subId);
    }
}
