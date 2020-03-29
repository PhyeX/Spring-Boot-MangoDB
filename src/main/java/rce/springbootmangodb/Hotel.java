package rce.springbootmangodb;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "Hotels")
public class Hotel {
    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    private Address adress;
    private List<Review> reviews;

    protected Hotel(){this.reviews = new ArrayList<>(); }

    public Hotel(String name,int pricePerNight,Address address,List<Review> reviews){
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.adress = address;
        this.reviews = reviews;
    }



}
