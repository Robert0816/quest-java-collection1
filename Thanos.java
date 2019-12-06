import java.util.*;
import java.lang.*;

public class Thanos {

    public static void main(String[] args) {



      Hero str0 = new Hero ("Black Widow", 34);
      Hero str1 = new Hero ("Captain America", 100);
      Hero str2 = new Hero ("Vision", 3);
      Hero str3 = new Hero ("Iron Man", 48);
      Hero str4 = new Hero ("Scarlet Witch", 29);
      Hero str5 = new Hero ("Thor", 1500);
      Hero str6 = new Hero ("Hulk", 49);
      Hero str7 = new Hero ("Doctor Strange", 42);

      ArrayList<Hero> heroes = new ArrayList<>();  // TODO 1 : Create an empty heroes list


      heroes.add(str0);
      heroes.add(str1);
      heroes.add(str2);
      heroes.add(str3);
      heroes.add(str4);
      heroes.add(str5);
      heroes.add(str6);
      heroes.add(str7);
      //heroes.remove(5);
      System.out.println(" ");
      //System.out.println("heroes size: " + heroes.size());
        for (Hero hero : heroes) { // iterate though the list
//Output    System.out.println(hero.getName() + ", age: " + hero.getAge());
          }
//    System.out.println(" ");

    /*
        for (int i = 0;i<heroes.size();i++)
          {
            System.out.println(heroes.get(i));
              }
    */
        //     heroes.remove(5);
        //     heroes.set(5,hulkNew);
        //     heroes.add(hulkNew);
        //     String str = heroes.get(5);
        //     System.out.println(str);

      Hero thorNew = new Hero("Thor", 1501);
      heroes.set(5, thorNew);

          //str5.setAge(1501);  // nur das Alter wird ersetzt
          //str5.setName("It's Thor birthday, now he's 1501"); // nur der Name des Helden Wird ersetzt

          //  System.out.println("heroes size: " + heroes.size());
        for (Hero hero : heroes) {
  //output      System.out.println(hero.getName() + ", age: " + hero.getAge());
          }
//          System.out.println(" ");

        // TODO 4 : Shuffle the heroes list
         Collections.shuffle(heroes);
         for(Hero hero : heroes) {
  //output       System.out.println(hero.getName() + ", age: " + hero.getAge());
            //System.out.print(" ");
            }
  //          System.out.println(" ");
      // TODO 5 : Keep only the half of the list

          //  System.out.println("halfofHeroes: ");

          // V1
        /*
          for (int i = 0; i < heroes.size()/2; i++) {
            Hero hero = heroes.get(i);
            //heroes.remove(i);
            System.out.println(hero.getName() + ", age: " + hero.getAge());
            //   System.out.println(heroes);
             }
        */
          //V2
          List<Hero> heroesList1 = heroes.subList(0, 4);
          for(Hero hero : heroesList1) {
    //output     System.out.println(hero.getName() + ", age: " + hero.getAge());
              }


              //    System.out.println("heroes size: " + heroes.size() );
              //  for (Hero hero : heroes){
              //   System.out.println(hero.getName() + " " + hero.getAge());
              //  for (Hero hero : heroes ) { // iterate though the list

//          System.out.println(" ");

      // TODO 6 : Loop throught the list and display the name of the remaining heroes
              //  for(Hero hero : heroes){}
              //  public List subList(int fromIndex, int toIndex)
         List<Hero> heroesList2 = heroes.subList(4, 8);
         for(Hero hero : heroesList2) {
         System.out.println(hero.getName());
          }
          //System.out.println(hero.getName());
          //  for(Hero hero : heroes){
          //    System.out.println(hero.getName());
           System.out.println(" ");
    }
}
