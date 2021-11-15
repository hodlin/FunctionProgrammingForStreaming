object ZipWordTask {
  def zipIt(prefixSeq: Seq[String], wordSeq: Seq[String], suffixSeq: Seq[String]): Seq[String] = {
    def specFlatten[A, B, C](row: ((A, B), C)) = (row._1._1, row._1._2, row._2)
    def makeWord(row: (String, String, String)): String = {
      val coll = Seq(row._1, row._2, row._3)
      coll.mkString
    }
    prefixSeq.zip(wordSeq).zip(suffixSeq).map(specFlatten).map(makeWord)
  }
}