import java.util.Map;
import java.util.HashMap;

class Q3 {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(getVowelsWeight("Welcome to Indonesia"));
  }

  private static int getVowelsWeight(String inputString){
    char[] inputCharacters = inputString.toCharArray();
    Map<Character, Integer> weightMap = new HashMap<>();
    Map<Character, Integer> countMap = new HashMap<>();
    int vowelsWeight = 0;

    weightMap.put('a', 1);
    weightMap.put('e', 2);
    weightMap.put('i', 3);
    weightMap.put('o', 4);
    weightMap.put('u', 5);


    for(char c: inputCharacters){
      if(weightMap.containsKey(c))
        countMap.put(c, countMap.getOrDefault(c, 0)+1);
    }

    for(Map.Entry<Character, Integer> entry: countMap.entrySet()){
      vowelsWeight += entry.getValue()*weightMap.get(entry.getKey());
    }

    return vowelsWeight;    
  }
}