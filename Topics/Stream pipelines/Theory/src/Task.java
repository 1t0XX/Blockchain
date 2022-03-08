// You can experiment here, it won’t be checked

import java.util.Arrays;
import java.util.List;

public class Task {
  public static void main(String[] args) {
    // put your code here
    List<Character> characters =
            Arrays.asList('z', '1', 'e', 'Z', 'q', 'd', '8', 'E');

    long count = characters.stream()
            .filter(Character::isLetter)
            .map(Character::toUpperCase)
            .filter(c -> c != 'E')
            .count();
    System.out.println(count);
  }
}
