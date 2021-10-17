object BiYCombinator {

	def fix[INPUT1, INPUT2, OUTPUT](bifnFactory: ((INPUT1, INPUT2) => OUTPUT) =>
		(INPUT1, INPUT2) => OUTPUT): (INPUT1, INPUT2) => OUTPUT =
		(INPUT1, INPUT2) => bifnFactory(fix(bifnFactory))(INPUT1, INPUT2)
}