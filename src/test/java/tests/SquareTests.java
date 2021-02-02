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

  @Test(groups = {"test1"})
  public void test1() {
    System.out.println("========================================================\ntest1\n========================================================");
    assertThat(calc.calculate(2.0, 3.0), equalTo(6.0));
  }

  @Test(groups = {"test2"})
  public void test2() {
    System.out.println("========================================================\ntest2\n========================================================");
    assertThat(calc.calculate(0.0, 3.0), equalTo(0.0));
  }

  @Test(groups = {"smoketest"})
  public void test3() {
    System.out.println("========================================================\ntest3\n========================================================");
    assertThat(calc.calculate(0.0, 0.0), equalTo(0.0));
  }

  @Test
  public void test4() {
    System.out.println("========================================================\ntest4\n========================================================");
    assertThat(calc.calculate(1.1, 3.0), equalTo(3.3000000000000003));
  }

  @Test
  public void test5() {
    System.out.println("========================================================\ntest5\n========================================================");
    assertThat(calc.calculate(1.1, 3.2), equalTo(3.5200000000000005));
  }
}
