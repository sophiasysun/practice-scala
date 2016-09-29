package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
 
  def isPalindrome(str: String): Boolean = {
     // only keep letters
     // make everything upper case 
     val filtered_string = str.filter(_.isLetter).map(_.toUpper)
     filtered_string == filtered_string.reverse
   }
}
