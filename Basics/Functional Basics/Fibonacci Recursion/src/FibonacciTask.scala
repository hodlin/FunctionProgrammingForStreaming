object FibonacciTask {

	def fibonacciImpl(): Int => Int = {
		def fib(number: Int): Int = {
			if (number == 0) 0
			else if (number == 1) 1
			else fib(number - 1) + fib(number - 2)
		}
		number => fib(number)
		}
}