package com.example


trait MySelfType

trait MyTrait extends munit.FunSuite { this: MySelfType =>

  test("foo") {
  }

  val x = ""

  test("bar") {
  }
}

abstract class MyAbstractClass extends munit.FunSuite { this: MySelfType =>

  override def munitValueTransforms: List[ValueTransform] = {
    super.munitValueTransforms
  }
}

final class MyFinalClass
  extends MyAbstractClass
  with MyTrait
  with MySelfType
