package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet someone using the passed in someone!
   * @param someone is the name of hte person that we will greet!
   * @return string of the greeting!
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
