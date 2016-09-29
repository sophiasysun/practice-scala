### What's easy to do in Scala? What's not?
* I was impressed with the variety of methods on lists! I used map and filter, because those
were methods that I learned in my CS52 class last semester. 
One of Scala's greatest strengths is how concise it can be,
after you learn how to properly chain methods. 

### What is/are your favorite language design choice(s) that the designers of Scala made? Why?
* To be honest, I found this assignment to be quite difficult... but here are some of the cool things that I observed.
* I don't know whether I like this, but I think it's interesting that Scala is designed so that a "phrase of code" doesn't need
to end in a semicolon. I think it's nice that having it doesn't hurt. Maybe this is because Scala was designed to cater to the 
coding habits of a lot of different users who are used to different programming languages.
* Even though I had to get used to Scala's way of constructing method headers, I think I like them! For example,
def isPalindrome(str: String): Boolean = { ... } makes sense to me. I especially like "Boolean = { ... }" because it makes it 
clear that whatever is returned by the code between the curly brackets is of type Boolean. 

### What is/are your least favorite language design choice(s)? Why? And why do you think the designers made that / those choice(s)?
* One of my least favorite design choices is how to print a string. Perhaps it's because I'm used to how it's done in Java, 
but typing the following: s"A string with length ${str.length}" was so tedious! I much prefer writing "A string with length " 
+ str.length . I'm not sure why this choice was made...
* I also do not like how you cannot reassign the value of a var. It was annoying to want to type "i++" somewhere, and then realize
that because I had declared Integer i as a var, I couldn't change its value. Also, why is it necessary to declare something a var?
Why isn't it enough to just indicate the variable's type?
*(As you can tell, I really, really struggled with Scala)

### What Scala features would you like to learn more about?
* I think I'd like to get to know more about the "symbols" that I've never seen before, but function as methods to manipulate
lists. I'm very used to seeing methods such as .add() or .remove(), and completely overlooked symbols like ::: and +: when I 
typed "l." and looked for a method I would want to use. I was looking for a built-in function whose name was composed of letters,
not symbol.
* I would also like to understand methods beyond the ones I was comfortable using (fold, map, zip).

### What is something that you did not find intuitive?
* At first, I was confused about why my if then statements didn't work. Then, I realized that in Scala, it seems like you only
write "if" and "else if" and "else," not "then".
* To get the first element of a list, you can just call the .head method on the list. This made me expect that you could find
the last element of the list by calling the .tail method on the list. However, I found out through struggling with Scala that 
you actually call .last, and not .tail.
