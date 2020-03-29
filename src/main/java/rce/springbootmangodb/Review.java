package rce.springbootmangodb;

import lombok.Data;

@Data
public class Review {

    private String userName;
    private int rating;
    private boolean approved;

    protected Review(){
    }

    public Review(String userName,int rating, boolean approved){
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }


}
