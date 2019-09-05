object StringUtils {
  def reverse(s: String): String = {
    @scala.annotation.tailrec
    def rec(ch: List[Char], lst: List[Char]): List[Char] = ch match {
      case h::t ⇒ rec(t, h :: lst)
      case Nil ⇒ lst
    }
    rec(s.toList, List()).mkString
  }
}
