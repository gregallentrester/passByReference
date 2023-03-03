package net.greg.examples.salient;


public final class MutatorClass {

  /*
   *  The original value of 'a' will be changed, as we are trying
   *  to pass the objects. Objects are passed by reference [NOT]
   */
  int a = 10;

  void call(MutatorClass eg) {

    eg.a = eg.a + 10;
  }


  void callSite(ReferentClient eg) {

    System.err.println(
      "\nCLAIM Before \"Call-By-Reference\"  " +
        eg.a);

    eg.a += 33;

    System.err.println(
      "CLAIM  After \"Call-By-Reference\"  " +
        eg.a);
  }
}
