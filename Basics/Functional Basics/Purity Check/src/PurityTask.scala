object PurityTask {

  case class Integer(var value: Int) { }

  def isPure(incrementFn: Integer => Integer): Boolean = {
    val input1 = Integer(1)
    val result1 = incrementFn(input1)
    val result2 = incrementFn(input1)
    val result3 = incrementFn(result1)
    input1.value + 1 == result1.value && input1.value + 1 == result2.value && result1.value + 1 == result3.value
  }
}