package rce.springbootmangodb;

import lombok.Data;

@Data
public class Address {
    private String city;
    private String country;

    protected  Address(){}


    public Address(String city,String country){
        this.city = city;
        this.country =country;
    }

}
