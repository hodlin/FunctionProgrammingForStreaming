object MapTask {
  def mapping(input: Seq[String]): Seq[Int] = {
    input.filter(x => x.forall(_.isDigit)).map(_.toInt)
  }
}