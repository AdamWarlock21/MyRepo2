/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class BookPlan {
    
    private String BookId, BookName, BookGenre;
    private int Price;
    
    private BookPlan(){}
    
    private BookPlan(Builder builder){
        this.BookId = builder.BookId;
        this.BookName = builder.BookName;
        this.BookGenre = builder.BookGenre;
        this.Price = builder.Price;
    }
    
    public String getBookId(){return BookId;}
    public String getBookName(){return BookName;}
    public String getBookGenre(){return BookGenre;}
    public int getPrice(){return Price;}
    
    public static class Builder{
        private String BookId, BookName, BookGenre;
        private int Price;
        
        public Builder BookId(String BookId){
            this.BookId = BookId;
            return this;
        }
        
        public Builder BookName(String BookName){
            this.BookName = BookName;
            return this;
        }
        
        public Builder BookGenre(String BookGenre){
            this.BookGenre = BookGenre;
            return this;
        }
        
        public Builder Price(int Price){
            this.Price = Price;
            return this;
        }
        
        public BookPlan build(){ return new BookPlan(this);}
        
    }
    
    @Override
    
    public String toString(){
        return "Book Plan:" +
                "Book Id:" + BookId + '\'' +
                "Book Name:" + BookName + '\'' +
                "Book Genre:" + BookGenre + '\'' +
                "Book Price:" + Price + 
                "";
    }
}
