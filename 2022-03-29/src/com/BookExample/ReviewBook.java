package com.BookExample;

import java.util.ArrayList;

public class ReviewBook {
    int id;
    String description;
    int rating;


    public ReviewBook(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }
    public String toString()
    {
        return String.format("id- %d  description-%s rating(5)-%d",id,description,rating);

    }

}
