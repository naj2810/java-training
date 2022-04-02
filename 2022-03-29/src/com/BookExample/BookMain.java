package com.BookExample;
import java.util.Scanner;

public class BookMain {


    public static void main(String[] args) {
        System.out.println("Enter Information of Book,that you want to add:");

        Scanner scanner=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);


            System.out.println("Enter Book id");
            int id = scanner.nextInt();
            System.out.println("Enter Book Name");
            String name = sc1.nextLine();
            System.out.println("Enter Book Author");
            String author = sc1.nextLine();

             Book book = new Book(id, name, author);

        System.out.println("Give the review for book");

        System.out.println("\n Enter id");
        int id1=scanner.nextInt();
        if(id1==book.id) {
            System.out.println("\n Enter Description");
            String description = sc1.nextLine();

          label:  System.out.println("Enter rating out of 5");
            int rating = scanner.nextInt();
            if (rating<=5)
            {
            book.addReview(new ReviewBook(id, description, rating));
            System.out.println("Book reviewed");
            System.out.println(""+book.toString());
        }
            else {

                System.out.println("Sorry! Do not enter rating more than 5");

            }
            }
        else{
            System.out.println("Book is not in a list");
            System.out.println("Book can Not be Reviewed");
        }



    }
}
