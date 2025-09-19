import java.util.Scanner;
class Book{
    String name; // INSTANCE VARIABLES
    String author;
    String issuedOn;
    String issuedTo;
    Book(String name, String author,String issuedOn, String issuedTo){
        this.name = name;
        this.author = author;
        this.issuedOn = issuedOn;
        this.issuedTo = issuedTo;
    }
     void displaydetails(){// WE WILL GET OUTPUT FROM THIS BLOCK
        
        System.out.println(" THE BOOK NAME:" +name);
        
        System.out.println(" THE AUTHOR NAME:" + author);
        
        System.out.println(" ISSUED ON DATE:" + issuedOn);
        
        System.out.println(" YOUR  NAME :" + issuedTo);
       
        
     }
}

public class problem26{
    
    public static void main(String[] args) { // FROM HERE USER WILL PROVIDE INPUT DETAILS
        System.out.println("Welcome to Library Management System");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Book name:");

        String name = sc.nextLine();

        System.out.println("Enter the author name:");

        String author = sc.nextLine();

        System.out.println("Enter the   Date OF Issue:");

        String issuedOn= sc.nextLine();

        System.out.println("ENTER YOUR NAME AS MENTIONED IN ID");

        String issuedTo = sc.nextLine();

        

        Book b1 = new Book(name,author,issuedOn,issuedTo); // HERE OBJECT B1 BEEN CREATED ALONG WITH CLASS CONTAINING ARGUMENTS INPUT CALLING THE OBJECT OF SUBCLASS WITH SOL INSIDE THEM 
        System.out.println("\n----- Book details:------");
        b1.displaydetails();//OBJECT BEEN CREATED CALLING METHOD DISPLAYDETAILS TO PRINT THE OUTPUT
    }
}


















