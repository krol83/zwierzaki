import java.util.Scanner;  // Import the Scanner class
// import jdk.internal.jimage.decompressor.CompressedResourceHeader;

class Animal {
    public void animalDesc() {
      System.out.println("Wybierz samochód a powiem Ci jakim zwierzęciem jesteś...");
      System.out.println("1. Audi");
      System.out.println("2. VW");
      System.out.println("3. Alfa Romeo");
      System.out.println("4. Mercedes");
      System.out.println("5. Seat");
      System.out.println("6. BMW");
      System.out.println("7. Toyota");
      System.out.println("8. Ford");
      System.out.println("9. Fiat");
      System.out.println("10. Lexus");
      System.out.println("11. Jeep");
      System.out.println("12. Peugeot");
      System.out.println("13. Byle szybsze");
      System.out.println("14. Wolę Ubera");
      System.out.println("15. Bez znaczenia");
    }
    int choice;
}
  
class Sheep extends Animal {
  public void animalDesc() {
      String sheep =  """
                      Przykra sprawa. Prawdopodobnie jesteś baranem. 
                      Wszyscy Cię wykorzystują i okradają.
                      Przykłady barana ze świata kultury:
                      Nikogo to nie obchodzi
      """;
      System.out.println(sheep);
  }
  int points;
}

class Mouse extends Animal {
  public void animalDesc() {
      String mouse =    """
                        Jesteś myszą. Latasz na każde wesele znajomych.
                        Jesteś pracownikiem działu kadr.
                        Przykłady myszy ze świata kultury:
                        Kazimierz Kaczor
                        Robert DeNiro
                        Robert Makłowicz
      """;
  System.out.println(mouse);
  }
  int points;
}

class Deer extends Animal {
  public void animalDesc() {
      String deer =     """ 
                        Jesteś jeleniem. Uważasz się za artystę.
                        Twoja mama to Linda Evans. 
                        Przykłady jelenia ze świata kultury:   
                        Keanu Reeves
                        Dwayne "The Rock" Johnson
      """;
  System.out.println(deer);  
  }
  int points;
}

class Goat extends Animal {
  public void animalDesc() {
      String goat =     """ 
                        Jesteś kozą. Pijesz i lubisz się bić. 
                        Słuchasz Blackmetalu.
                        Przykłady kozy ze świata kultury:
                        Johnny Depp
                        Pep Guardiola
      """;
  System.out.println(goat);  
  }
int points;
}

class Bear extends Animal {
  public void animalDesc() {
      String bear =       """
                        Jesteś niedźwiedziem. Lubisz rosyjski.
                        Miewasz rozwolnienia.
                        Przykłady niedźwiedzia ze świata kultury:   
                        Rafał Patyra
                        David Duchovny
                        Artur Soboń
      """;
      System.out.println(bear);
  }
  int points;
}

class Cat extends Animal {
  public void animalDesc() {
      String cat =      """
                        Jesteś kotem. Polujesz w przypadku głodu.
                        Jesteś leniem. Masz problemy ze słuchem.
                        Przykłady kota ze świata kultury:
                        Will Smith
                        Jacek Stachurski
                        Mariusz Pudzianowski
                        Piotr Adamczyk
                        Mel Gibson
      """;
    System.out.println(cat);
  }
  int points;
}

class Penguin extends Animal {
  public void animalDesc() {
      String penguin =  """
                        Jesteś pingwinem. Urodziłeś się w bogatej rodzinie. 
                        Jesteś cyberprzestępcą i gejem. Jesz szpinak.
                        Przykłady pingwina ze świata kultury:
                        dr Michał Sutkowski
                        Jerzy Walldorf
                        Maciej Zakościelny
                        Matthew McConaughey
                        Boris Johnson
                        
      """;
  System.out.println(penguin);
  }
  int points;
}

class Rat extends Animal {
  public void animalDesc() {
      String rat =      """
                        Jesteś szczurem. Masz podły charakter.
                        Lubisz ryzyko. Bierzesz amfetaminę.
                        Przykłady szczura ze świata kultury:   
                        Ziemowit Pędziwiatr
                        Adam Konkol
                        John Travolta
                        Matthew Broderick
      """;
      System.out.println(rat);
  }
  int points;
}

 class Boar extends Animal {
    public void animalDesc() {
        String boar =     """
                          Jesteś dzikiem, mistrzem lenistwa. 
                          Lubisz świnie.
                          Przykłady dzika ze świata kultury:
                          Mateusz Kijowski
                          Jamie Foxx
                          Michael Rooker
                          Piotr Stramowski
        """;
    System.out.println(boar);
    }
  int points;
  }
    
  class Gator extends Animal {
    public void animalDesc() {
        String gator =    """
                          Jesteś krokodylem. Okradasz emerytów. 
                          Mieszkasz w Chorzowie.
                          Przykłady krokodyla ze świata kultury:   
                          Tomasz Kuchar
                          Zbigniew Buczkowski
        """;
    System.out.println(gator);
    }
    int points;
  }

  class Falcon extends Animal {
    public void animalDesc() {
        String falcon =   """
                          Jesteś sokołem. Pijesz w samotności, lubisz rosyjski i muzykę metalową.
                          Znasz hasła do każdego Wi-Fi. 
                          Przykłady sokoła ze świata kultury:
                          Klaus Maria Brandauer
                          Paweł Wojciechowski
                          Marcin Rams
        """;
        System.out.println(falcon);
    }
    int points;
  }
  
  class Beaver extends Animal {
    public void animalDesc() {
        String beaver =   """
                          Jesteś bobrem. Uważasz się za architekta.
                          Jesteś sędzią. Liczysz kasę. Masz nadciśnienie. 
                          Przykłady bobra ze świata kultury:
                          Zbigniew Boniek   
                          Tomasz Zubilewicz
                          Kevin Costner
                          Donald Sutherland
        """;
        System.out.println(beaver);
    }
    int points;
  }
  
  class Varanus extends Animal {
    public void animalDesc() {
        String varanus =  """
                          Jesteś waranem z komodo. Lubisz policję.
                          Oszukujesz Państwo na podatku VAT. Uważasz się za doktora.
                          Przykłady warana ze świata kultury:
                          Przemysław Sadowski
                          Jan "Ptaszyn" Wróblewski
                          Karol Gac
                          Tom Cruise
                          Vincent Casell
        """;
        System.out.println(varanus);
    }
    int points;
  }
  
  class Spider extends Animal {
    public void animalDesc() {
      String spider =     """
                          Jesteś pająkiem. Mieszkasz w Las Vegas i jesteś alfonsem. 
                          Masz problemy z agresją.
                          Przykłady pająka ze świata kultury:
                          Bogusław Linda
                          Sean Bean
                          Woody Harrelson
    """;
    System.out.println(spider);
    }
    int points;
  } 

  class Snake extends Animal {
    public void animalDesc() {
        String snake =  """
                        Jesteś wężem. Masz wszystko pod ręką i nie potrzebujesz samochodu. 
                        Leżysz i jesz.
                        Przykłady węża ze świata kultury:
                        Hugh Heffner
                        Roman Wilhelmi
                        Jakub Przebindowski
                        Bronisław Cieślak
                        Wojciech Jerzy Has
        """;
    System.out.println(snake);
    }
    int points;
  }

  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      myAnimal.animalDesc();      
      
      var myObj = new Scanner(System.in);  // Create a Scanner object
    
      String car = myObj.nextLine();  // Read user input
      System.out.println("Twoj wybor to " + car);  // Output user input
      
      Animal mySnake = new Snake();  
      Animal myBoar = new Boar(); 
      Animal mySheep = new Sheep();
      Animal myPenguin = new Penguin();  
      Animal myGoat = new Goat();  
      Animal myFalcon = new Falcon();
      Animal myVaranus = new Varanus();  
      Animal myMouse = new Mouse();  
      Animal myCat = new Cat();
      Animal myBeaver = new Beaver();
      Animal myRat = new Rat();
      Animal myBear = new Bear();
      Animal mySpider = new Spider();
      Animal myGator = new Gator();
      Animal myDeer = new Deer();
      int i=Integer.parseInt(car);

      switch (i) {
        case 1:
          mySheep.animalDesc();
          break;
        case 2:
        myBear.animalDesc();
          break;
        case 3:
        myDeer.animalDesc();
          break;
        case 4:
        myCat.animalDesc();
          break;
        case 5:
        myPenguin.animalDesc();
          break;
        case 6:
        myFalcon.animalDesc();
          break;
        case 7:
        myGoat.animalDesc();
          break;
        case 8:
        myBeaver.animalDesc();
        break;
        case 9:
        myGator.animalDesc();
        break;
        case 10:
        mySpider.animalDesc();
        break;
        case 11:
        myBoar.animalDesc();
        break;
        case 12:
        myVaranus.animalDesc();
        break;
        case 13:
        myRat.animalDesc();
        break;
        case 14:
        myMouse.animalDesc();
        break;
        case 15:
        mySnake.animalDesc();
        break;
    }
  }
}
