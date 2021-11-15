object GroupWordsTask {
  def groupIt(wordsSeq: Seq[String]): Map[Char, Int] = {
    wordsSeq
      .groupBy(word => word.charAt(0))
      .transform((k, v) => v.mkString.count(_ == k))
  }
}