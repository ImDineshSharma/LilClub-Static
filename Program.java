// People class

public class People{
   private String firstName;
   private String lastName;
   private static int members; // unlike firstName and lastName it will be common to all the objects in main class
   
   public People(String fn, String ln){
      firstName = fn;
      lastName = ln;
      members++;  // coz we want this to be increase each time a member joins the club!
      System.out.printf("Welcome to the club %s %s\n Total members in the club: %s\n" firstName, lastName, members);
   }
}

// main class

public class Club{
  public static void main(String[] args){
  
    People member1 = new People("Jimmy", "Fellon");
    People member2 = new People("Jimmy", "Kimmal");
    People member3 = new People("Ellen", "Degeneres");
    
  }
}
