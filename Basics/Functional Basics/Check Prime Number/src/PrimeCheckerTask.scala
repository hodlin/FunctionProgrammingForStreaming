import scala.annotation.tailrec

object PrimeCheckerTask {

	@tailrec
	def isPrimeHelper(number: Long, index: Long): Boolean = {
		if (number == 2 || number == 3) true
		else if (number < 2) false
		else if (number % index == 0) false
		else if (index * index > number) true
		else isPrimeHelper(number, index + 1)
	}
	def isPrime(n: Long): Boolean = {
		isPrimeHelper(n, 2)
	}
}