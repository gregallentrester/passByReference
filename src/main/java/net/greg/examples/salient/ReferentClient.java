package net.greg.examples.salient;

import java.util.*;


public final class ReferentClient {

  // 'a' is someMutableScalarStateInstanceVariable
  static int a = 100;

  static private final ReferentClient driver;

  static {
    driver = new ReferentClient();
  }


  public static void main(String[] args) {
    drive(driver);

    System.err.println(
      "\n\n new HashMap().size(): " +
      new HashMap().size() + "\n\n");
  }


  public static final void drive(ReferentClient any) {

    System.err.println(
      "\n\nReferent/Actual | Before  " +
      ReferentClient.a);

    new MutatorClass().callSite(driver);

    System.err.println(
      "\nReferent/Actual | After  " +
      ReferentClient.a);
  }
}
