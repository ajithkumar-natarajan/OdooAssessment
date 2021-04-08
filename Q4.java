import java.util.Map;
import java.util.HashMap;

class Q4 {

  static Map<Character, Integer> weightMap;
  static Map<Character, Integer> countMap;

  public static void main(String[] args) {
    String input = "Welcome to Indonesia";
    weightMap = new HashMap<>();
    countMap = new HashMap<>();
    char[] inputCharacters = input.toCharArray();
    int vowelsWeight = 0;

    weightMap.put('a', 1);
    weightMap.put('e', 2);
    weightMap.put('i', 3);
    weightMap.put('o', 4);
    weightMap.put('u', 5);

    System.out.println(getVowelsWeight(inputCharacters, vowelsWeight, 0));
  }

  private static int getVowelsWeight(char[] inputCharacters, int vowelsWeight, int position){
    if(position < inputCharacters.length){
      if(weightMap.containsKey(inputCharacters[position])){
        char ch = inputCharacters[position];
        countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
      }
      getVowelsWeight(inputCharacters, vowelsWeight, position+1);
    }
    for(Map.Entry<Character, Integer> entry: countMap.entrySet())
      vowelsWeight += entry.getValue()*weightMap.get(entry.getKey());

    return vowelsWeight;    
  }
}