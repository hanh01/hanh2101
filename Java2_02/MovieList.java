package Java2_02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
         int n;
         System.out.print("Enter the number of favorite movies: ");
         n = scanner.nextInt();
         List<String> movie = new ArrayList<>();
         System.out.println("Enter the list of favorite movies:");
         String[] array = new String[n];
         Scanner scanners = new Scanner(System.in);
         for(int i= 0; i<array.length; i++){
             array[i]=scanners.nextLine();
             String movies= array[i];
             movie.add(movies);
      }
        System.out.println("List of favorite movies: "+ movie);

         movie.add(2,"crash landing on you");
         System.out.println(movie);

         movie.set(3,"ccc");
         System.out.println(movie);

         movie.remove(3);
        System.out.println(movie);

        System.out.println("Is the movie on the list \"crash landing on you \" ?:" + movie.contains("crash landing on you") );




    }
}
