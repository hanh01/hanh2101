package ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;

public class MovieList {
    private ArrayList<String> movieList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addMovie(String movie){
        movieList.add(movie);
    }

    public void displayList(){
        System.out.println("You have " + movieList.size() + " movie : "  );
           for(int i = 0;i<movieList.size();i++){
            System.out.println("Movie " + (i+1)+ " " + movieList.get(i));
        }
        }

    public void updateMovie(int index,String movie){
        movieList.set(index,movie);
        System.out.print("Uplated :  ");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }

    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }

//    public String findMovie(String search){
//        int position = movieList.indexOf(search);
//        if(position > 0){
//            return movieList.get(position);
//        }
//        return null;
//    }

    public void searchMoive(String nameMovie){
        System.out.println(movieList.contains(nameMovie));
    }


    public static void main(String[] args) {
        System.out.println("------- MovieList -------");

        MovieList list = new MovieList();
        list.addMovie("Titanic");
        list.addMovie("Catch me if you can");
        list.addMovie("Noting Hills");
        list.addMovie("Chesapeake Shores");
        list.addMovie("You have got email");

        list.displayList();

        System.out.print("nhap vao ten phim ban muon them : ");
        list.addMovie(scanner.next());
        list.displayList();
        System.out.print(" ");

        System.out.print("nhap vao vi tri phim ma ban muon xoa : ");
        list.removeMovie(scanner.nextInt());
        list.displayList();

        System.out.print("nhap vao vi tri va ten bo phim ban muon thay doi: ");
        list.updateMovie(scanner.nextInt(),scanner.next());
        list.displayList();

        System.out.print("nhap vao ten bo phim ban muon tim ");
        list.searchMoive(scanner.next());

    }


}
