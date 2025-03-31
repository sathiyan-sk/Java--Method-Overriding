// 3.Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie.
class Movie {
     protected String title;
 
     public Movie(String title) {
         this.title = title;
     }
 
     public void play() {
         System.out.println("Movie is Start Playing: " + title);
     }
 }
 
 class RomComMovie extends Movie {
     public RomComMovie(String title) {
         super(title);
     }
 
     @Override
     public void play() {
         System.out.println("have a day with romance of this : " + title);
     }
 }
 
 class ThrillerMovie extends Movie {
     public ThrillerMovie(String title) {
         super(title);
     }
 
     @Override
     public void play() {
         System.out.println("You'll be threatening by : " + title);
     }
 }
 
 class ActionMovie extends Movie {
     public ActionMovie(String title) {
         super(title);
     }
 
     @Override
     public void play() {
         System.out.println("Enjoy the goosebumps  in: " + title);
     }
 }
 
 public class _3MovieHierarchyDemo {
     public static void main(String[] args) {
         Movie movie1 = new RomComMovie("Titanic");
         Movie movie2 = new ThrillerMovie("Kanjurean");
         Movie movie3 = new ActionMovie("Fast Saga");
 
         movie1.play();
         movie2.play();
         movie3.play();
     }
 }
