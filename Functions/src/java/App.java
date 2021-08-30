package java;

import rsk.*;

public class App {

  private static final String HELLO_WORLD_FROM_JAVA = "Hello, World from Java";

  public static void main(final String[] args) {
    DisplayFunctions.display(HELLO_WORLD_FROM_JAVA);
    DisplayFunctions.log(HELLO_WORLD_FROM_JAVA, 3);
    DisplayFunctions.log(HELLO_WORLD_FROM_JAVA);
  }

}
