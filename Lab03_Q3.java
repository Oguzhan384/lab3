import java.util.Random;
import java.util.Scanner;
public class Lab03_Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        //constants
        final String USER_NAME = "librarian";
        final String PASSWORD = "books2024";


        //variables
        int choice = 0;
        String userList = "AyseYilmaz, MehmetKaya, ZeynepDemir,"; 
        String bookList = "ISBN"+r.nextInt(1000,10000)+":JavaProgramming "+"ISBN"+r.nextInt(1000,10000)+":DataStructures";

        //user input
        System.out.print("Enter your user name: ");
        String userName = scanner.next();
        if (userName.equals(USER_NAME)){
            System.out.print("Enter your password: ");
            String userPassword = scanner.next();
            if (!userPassword.equals(PASSWORD)){
                System.out.println("Incorrect password! Goodbye!");
                System.exit(0);
            }
        }
        else{
            System.out.println("User name not found! Goodbye!");
            System.exit(0);
        }
        while (choice == 0){
                System.out.print("1- Add member\n" + 
                    "2- Delete member\n" +
                    "3- Add book\n" +
                    "4- Delete book\n" +
                    "5- Logout\n" + 
                    "Select an operation:");
                    choice = scanner.nextInt();
        int subCounter = 0;
        int ISBNcounter = 0;
        int subChoice = 0;
            
            //add member
                    if (choice == 1){
            System.out.println("-- Add Member --");
            System.out.print("Enter member name: ");
            String memberName = scanner.next();
            memberName = memberName + ",";
                for (int counter = 0; counter < userList.length();){
                    counter = userList.indexOf(",",counter)+1;
                    String nameSelect = userList.substring(subCounter,counter);
                    subCounter = counter;
                    if (nameSelect.equals(memberName)){
                        System.out.println("This member is already in your list!");
                        choice = 0;
                        subChoice = 1;
                        break;
                    }
            }
                if (subChoice == 0){
                userList = userList+ " " +memberName;
                System.out.println("New member"+memberName+"is added!\nYour members: "+userList);
                choice = 0;
                }

        }

                    if (choice == 2){
                        System.out.println("-- Delete Member --");
                        System.out.print("Enter member name which you want to delete: ");
                        String deleteMember = scanner.next()+",";
                        for (int counter = 0; counter < userList.length();){
                            counter = userList.indexOf(",",counter)+1;
                            String nameSelect = userList.substring(subCounter,counter);
                            nameSelect = nameSelect.trim();
                            if (deleteMember.equals(nameSelect)){
                                userList = userList.replace(userList.substring(subCounter,counter),"");
                                System.out.println(deleteMember+"is deleted successfully from members\nYour members: ("+userList+")\n");
                                choice = 0;
                                subChoice = 1;
                                break;
                            }
                            subCounter = counter;
                        }
                        if (subChoice == 0){
                        System.out.println("You don't have any member whose name is "+deleteMember+"!\nYour members: ("+userList+")\n");
                        choice = 0;
                        }

        }
                    if (choice == 3){
                        System.out.println("-- Add Book --");
                        System.out.print("Enter book name: ");
                        String bookName = scanner.next();
                        String ISBN = "ISBN"+r.nextInt(1000,10000)+":";
                        for (int counter = 0; counter < bookList.length()-14;){
                            counter = bookList.indexOf(":",counter)+1;
                            String nameSelect = bookList.substring(ISBNcounter,counter);
                            ISBNcounter = bookList.indexOf(" ", ISBNcounter)+1;
                        if (ISBN.equals(nameSelect)){
                            System.out.println("There is a book with the" + ISBN + " you cannot add a new book with the same ISBN!\nYour books: "+ bookList + "\n");
                            choice = 0;
                            subChoice = 1;
                            break;
                            }   
                        }
                        if (subChoice == 0){
                            bookList = ISBN + ":" + bookName + " " + bookList;
                            System.out.println("New book with ISBN 9856 is added!\nYour books: " + bookList + "\n");
                            choice = 0;
                        }

                    }
                    if (choice == 4){
                        System.out.println("-- Delete Book --" + "\n");
                        System.out.print("Enter ISBN which you want to delete: ");
                        String deleteBook = scanner.next();
                        String bookDNE = deleteBook;
                        deleteBook = "ISBN" + deleteBook + ":";
                        for (int counter = 0; counter < bookList.length()-14;){
                            counter = bookList.indexOf(":",counter)+1;
                            String nameSelect = bookList.substring(ISBNcounter,counter);
                        if (deleteBook.equals(nameSelect)){
                            bookList = bookList.replace(bookList.substring(ISBNcounter,bookList.indexOf(" ",counter+1)),"");
                            bookList = bookList.trim();
                            System.out.println("The book with the " + deleteBook + " deleted successfully!\nYour books: " + bookList + "\n");
                            choice = 0;
                            subChoice = 1;
                            break;
                    }
                            ISBNcounter = bookList.indexOf(" ", ISBNcounter)+1;
                }
                    if (subChoice == 1){
                        System.out.println("You don't have any book with the ISBN" + bookDNE + "\n");
                        choice = 0;
                    }

                    if (choice == 5){
                        System.out.println("Logged out successfully!");
                        System.exit(0);
                    }
}
}
}
}