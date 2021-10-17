object TailFibonacciTask {
  def fibonacciImpl2(): Int => Int = {
        def fibHelper(currentState: Int, previousState: Int, number:Int): Int = {
          if (number == 0) currentState
          else fibHelper(currentState + previousState, currentState, number - 1)
        }

        number => if (number == 0) 0 else fibHelper(1, 0, number - 1)
    }
}