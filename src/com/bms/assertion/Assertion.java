package com.bms.assertion;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Assertion {

  public static void main(String[] args) {
    Assertion assertion = new Assertion();
    assertion.setup();
  }

  public void setup() {
    Object conn = getConnection();
    assert conn != null : "Connection is null";

    // continue with other setup ...
  }

  // Simulate failure to get a connection; using Object
  // to avoid dependencies on JDBC or some other heavy
  // 3rd party library
  public Object getConnection() {
    return null;
  }
}
