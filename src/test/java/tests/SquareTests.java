package tests;

import app.SquareCalculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SquareTests {

  private SquareCalculator calc;

  @BeforeClass
  public void precondition() {
    calc = new SquareCalculator();
  }

  @Test
  public void testPositive() {
    assertThat(calc.calculate(2.0, 3.0), equalTo(7.0));
  }

}
