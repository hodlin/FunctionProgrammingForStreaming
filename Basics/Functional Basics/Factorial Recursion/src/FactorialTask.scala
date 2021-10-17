object FactorialTask {

  def factorialImpl(): Int => Long = {
    def factorialHelper(number: Int, counter: Int): Int = {
      if (number == 0) counter
      else factorialHelper(number - 1, number * counter)
    }

    number => factorialHelper(number, 1)
  }
}