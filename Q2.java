// Given the deck ['A',1,2,3,4,5,6,7,8,9,10,'J','K','Q'], write a function that shuffles the deck using the randint function. 
// The random module includes a basic function randint(a, b) that returns a uniformly random integer from a to b (including both endpoints). 

import java.util.*;

class Q2 {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String[] inputDeck = new String[] {"A", "1", "2", "3","4", "5", "6", "7", "8", "9", "10", "J", "K", "Q"};

    System.out.println(Arrays.toString(shuffleDeck(inputDeck)));
  }

  private static String[] shuffleDeck(String[] inputDeck){
    List<String> inputDeckList = Arrays.asList(inputDeck);
    Collections.shuffle(inputDeckList);
    
    return inputDeckList.toArray(new String[0]);
  }
}