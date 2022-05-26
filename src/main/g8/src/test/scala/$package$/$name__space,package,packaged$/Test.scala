package $organization;format="dotReverse,package"$.$name;format="space,package"$

import munit.FunSuite

class Test extends FunSuite:
  test("a is smaller than b") {
    val a = 1
    val b = 2
    assert(a > b, "a was smaller than b")
  }

