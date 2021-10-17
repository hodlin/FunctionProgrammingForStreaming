import scala.annotation.tailrec

object VectorTask {

	trait Vector[V <: Vector[V]]{

		/**
		 * Get value of the vector at specific position
		 *
		 * @param position of vector value. Must be less than `size`
		 * @return value at the given position */
		def apply(position: Int): Float

		/**
		 * Create a new Vector instance with the given value and previous values
		 *
		 * @param position of vector value. Must be less than `size`
		 * @param value    the value to set
		 * @return new instance of this vector */
		def modify(position: Int, value: Float): Vector[V]

		/**
		 * Provides the size of this vector
		 *
		 * @return actual size of the vector */
		def size(): Int
	}

	def sum[V <: Vector[V]](vector1: Vector[V], vector2: Vector[V]): Vector[V] = {
		@tailrec def sumHelper(vector1: Vector[V], vector2: Vector[V], state: Vector[V], index: Int): Vector[V] = {
			if (index < 0) state
			else sumHelper(vector1, vector2, state.modify(index, vector1(index) + vector2(index)), index - 1)
		}
		sumHelper(vector1, vector2, vector1, vector1.size() - 1)
	}

	def sub[V <: Vector[V]](vector1: Vector[V], vector2: Vector[V]): Vector[V] = {
		@tailrec def subHelper(vector1: Vector[V], vector2: Vector[V], state: Vector[V], index: Int): Vector[V] = {
			if (index < 0) state
			else subHelper(vector1, vector2, state.modify(index, vector1(index) - vector2(index)), index - 1)
		}
		subHelper(vector1, vector2, vector1, vector1.size() - 1)
	}
	

}