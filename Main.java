import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Main {
  public static void main(String[] args) {
     
    
    LocalDateTime Date = LocalDateTime.now();
    DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = Date.format(Format);
    
    System.out.print("My name is Roxanne Kate P. Rosalinda ");
    
    System.out.println("The date and time is: " + formattedDate);
  }
}