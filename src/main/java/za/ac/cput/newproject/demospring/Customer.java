package za.ac.cput.newproject.demospring;

import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String surnmae;
    private String clan;
    private String address;

    public Customer(){

    }

    public Customer(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surnmae = builder.surnmae;
        this.clan = builder.clan;
        this.address = builder.address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public String getClan() {
        return clan;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{
        private String id;
        private String name;
        private String surnmae;
        private String clan;
        private String address;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder surname(String value){
            this.surnmae = value;
            return this;
        }
        public Builder clan(String value){
            this.clan = value;
            return this;
        }
        public Builder address(String value){
            this.address =value;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
