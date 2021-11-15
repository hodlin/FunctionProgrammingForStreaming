import scala.annotation.tailrec

object TakeWordsTask {
  val lineSeparatorString = "\n"

  def splitTheWord(word: String): List[String] = {
    val listToFill = List[String]()
    word match {
      case "\n" => listToFill :+ word
      case x if x.contains("\n") => {
        val wordToSpec = word.map(_.toString).takeWhile(c => c != "\n").mkString
        listToFill :+ wordToSpec :+ "\n"
      }
      case x => listToFill :+ word
    }
  }
  def takeWords(seq: Seq[String]): Seq[String] = {
    seq
      .map(splitTheWord)
      .flatten
      .takeWhile(word => !word.contains(lineSeparatorString))
  }
}
