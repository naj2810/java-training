package com.BookExample;

import java.util.ArrayList;

public class Book {
    int id;
    String name;
    String author;
    ArrayList<ReviewBook > reviews=new ArrayList<>();
    Book(int id,String name,String author)
    {
        this.id=id;
        this.name=name;
        this.author=author;
    }

    public void addReview(ReviewBook review)
    {
       this.reviews.add(review);
    }
    public String toString()
    {
        return String.format("id=%d name=%s author=%s reviews=[%s]",id,name,author,reviews);
    }

}
