 package Task;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
public static void main(String[] args) {
   

   Book obj=new Book(123, "Let us","P KUMAR" );
   Book obj1=new Book(321, "Tell us","T KUMAR" );

   ArrayList<Book> list=new ArrayList<Book>();
   list.add(obj);
   list.add(obj1);
    

   
   for (Book book : list) {
      System.out.println(book);
   }

  
    
}
   
}

/**
 * InnerTask3
 */
public class Book {
   int bookid;
   String bookname;
   String authorname;

Book(int newbookid,String newbookname,String authorname){
this.bookid=newbookid;
this.bookname=newbookname;
this.authorname=authorname;
   }

   public String toString(){
      return "Bookid:"+ bookid+" "+"Book Name:"+bookname+" "+"Author Name:"+authorname;
   }
}