# Kotlin coding puzzles

This repository contains a set of [programming puzzles](#lets-solve-some-puzzles) that meant to be solved using
[Kotlin](https://kotlinlang.org/) language (hints, solutions and tests are
here as well). Purpose of this repository is to help you to practice deliberately and develop strong problem-solving
skills. This will make you better programmer and will help you to get new job by passing
[whiteboard coding](https://www.quora.com/What-is-whiteboard-coding) interviews.

## Puzzle structure

Each puzzle is located in separate package and it contains of 3 files ([screen](./misc/image/SampleTask.png)):
- `Puzzle.md` - description of the task.
- `Puzzle.kt` - empty method/class where puzzle should be solved. This file also contains a set of
  [JUnit](https://junit.org/junit4/) tests.
- `PuzzleSolution.kt` - file that contains solutions. 

Keep in mind that each puzzle will usually have more than one solution. Even simple puzzle like
[String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md) can be solved in
[10 different ways](https://eddmann.com/posts/ten-ways-to-reverse-a-string-in-javascript/). Usually, we compare various
solutions using
([Big O notation](https://medium.com/karuna-sehgal/a-simplified-explanation-of-the-big-o-notation-82523585e835)) to
determine space/time complexity and we look at code readability.

## How do I start?
1. [Checkout the and open the project](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Checkout-and-open-the-project) 
1. [Solve puzzle](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Solving-coding-chalenges)

# Let's solve some puzzles

Puzzles are segregated by different difficulty. Some puzzle may contain a reference to puzzles that should be solved
before to have better understanding of the problem. To succeed you need to practice often, repeat same puzzles multiple
times and be persistent over time. Take your time before you take a look at the presented solution. Good luck!

**New in Town**
- [Capitalize sentence](app/src/test/java/com/igorwojda/string/capitalizesentence/CapitalizeSentence.md)
- [Range contains range?](app/src/test/java/com/igorwojda/range/containsrange/ContainsRange.md)
- [Add up to](app/src/test/java/com/igorwojda/integer/addupto/AddUpTo.md)
- [Count up and down](app/src/test/java/com/igorwojda/integer/countupanddown/CountUpAndDown.md)
- [Get all pairs](app/src/test/java/com/igorwojda/integer/getallpairs/GetAllPairs.md)
- [List count unique values](app/src/test/java/com/igorwojda/list/countuniquevalues/CountUniqueValues.md)
- [Print number](app/src/test/java/com/igorwojda/various/printnumber/basic/PrintNumber.md)
- [Print number with steps](app/src/test/java/com/igorwojda/various/printnumber/steps/PrintNumberWithSteps.md)
- [Power](app/src/test/java/com/igorwojda/integer/power/Power.md)
- [Factorial](app/src/test/java/com/igorwojda/integer/factorial/Factorial.md)
- [Product](app/src/test/java/com/igorwojda/list/product/Product.md)

**Apprentice**
- [Palindrome](app/src/test/java/com/igorwojda/string/palindrome/basic/Palindrome.md)
- [Tolerant palindrome](app/src/test/java/com/igorwojda/string/palindrome/tolerant/TolerantPalindrome.md)
- [Anagram](app/src/test/java/com/igorwojda/string/anagram/Anagram.md)
- [Max occurring char](app/src/test/java/com/igorwojda/string/maxchar/MaxOccurrentChar.md)
- [String reversal](app/src/test/java/com/igorwojda/string/reverse/Reverse.md)
- [Find the vowels](app/src/test/java/com/igorwojda/string/vowels/Vowels.md)
- [Int reversal](app/src/test/java/com/igorwojda/integer/reverse/Reverse.md)
- [Pyramid generator](app/src/test/java/com/igorwojda/various/pyramidgenerator/PyramidGenerator.md)
- [Steps generator](app/src/test/java/com/igorwojda/various/stepsgenerator/StepsGenerator.md)
- [Fizz Buzz](app/src/test/java/com/igorwojda/various/fizzbuzz/FizzBuzz.md)

**Warrior** 
- [Spiral matrix generator](app/src/test/java/com/igorwojda/various/spiralmatrixgenerator/SpiralMatrixGenerator.md)
- [Int queue](app/src/test/java/com/igorwojda/queue/int/IntQueue.md)
- [Generic queue](app/src/test/java/com/igorwojda/queue/generic/GenericQueue.md)
- [Combine two queues](app/src/test/java/com/igorwojda/queue/weave/Weave.md)
- [Two stack queue](app/src/test/java/com/igorwojda/queue/twostack/TwoStackQueue.md)
- [Int stack](app/src/test/java/com/igorwojda/stack/int/IntStack.md)
- [Generic stack](app/src/test/java/com/igorwojda/stack/generic/GenericStack.md)
- [Bubble sort](app/src/test/java/com/igorwojda/list/bubblesort/BubbleSort.md)
- [Selection sort](app/src/test/java/com/igorwojda/list/selectionsort/SelectionSort.md)
- [Square equals](app/src/test/java/com/igorwojda/list/squareequal/SquareEquals.md)
- [Sum zero](app/src/test/java/com/igorwojda/list/sumzero/SumZero.md)
- [Digit frequency](app/src/test/java/com/igorwojda/integer/digitfrequency/DigitFrequency.md)
- [Get duplicated arguments](app/src/test/java/com/igorwojda/string/getduplicatedparams/GetDuplicatedArguments.md)
- [Find pair with target average](app/src/test/java/com/igorwojda/list/pairaverage/PairAverage.md)
- [Is substring](app/src/test/java/com/igorwojda/string/issubstring/IsSubstring.md)
- [Tree traversal](app/src/test/java/com/igorwojda/tree/traversal/TreeTraversal.md)
- [Tree level width](app/src/test/java/com/igorwojda/tree/levelwidth/LevelWidth.md)
- [Binary Search Tree (insert)](app/src/test/java/com/igorwojda/binarytree/insert/Insert.md)
- [Binary Search Tree (validate)](app/src/test/java/com/igorwojda/binarytree/validate/Validate.md)

**Commander**
- [List chunking](app/src/test/java/com/igorwojda/list/listchunk/ListChunk.md)
- [Linked list](app/src/test/java/com/igorwojda/linkedlist/base/LinkedList.md)
- [Linked list midpoint](app/src/test/java/com/igorwojda/linkedlist/midpoint/Midpoint.md)
- [Circular linked list?](app/src/test/java/com/igorwojda/linkedlist/circularcheck/CircularCheck.md)
- [Linked list take n-th element from last](app/src/test/java/com/igorwojda/linkedlist/fromlast/FromLast.md)
- [Merge sort](app/src/test/java/com/igorwojda/list/mergesort/MergeSort.md)
- [Fibonacci](app/src/test/java/com/igorwojda/various/fibonacci/basic/Fibonacci.md)
- [Fibonacci add recursive cache](app/src/test/java/com/igorwojda/various/fibonacci/recursivecached/FibonacciRecursiveCached.md)
- [Max sub-list sum](app/src/test/java/com/igorwojda/list/maxsublistsum/MaxSubListSum.md)
- [Min sub-list length](app/src/test/java/com/igorwojda/list/minsublistlength/MinSubListLength.md)

# References

## Articles

- [Data structures explained](https://medium.com/basecs/tagged/data-structures) series

## Books

- [Cracking the Coding Interview, 6th Edition](https://www.amazon.co.uk/Cracking-Coding-Interview-6th-Programming/dp/0984782850/)
- [Algorithms, 4th Edition](https://algs4.cs.princeton.edu/home/)

## Video courses

- [JavaScript Algorithms and Data Structures Masterclass](https://www.udemy.com/js-algorithms-and-data-structures-masterclass/)
- [The Coding Interview Bootcamp Algorithms + Data Structures](https://www.udemy.com/coding-interview-bootcamp-algorithms-and-data-structure/)
- [Master the Coding Interview Data Structures + Algorithms](https://www.udemy.com/master-the-coding-interview-data-structures-algorithms/)

## Coding problems websites

- [HackerRank](https://www.hackerrank.com/)
- [CoderByte](https://coderbyte.com/challenges)
- [CodeChef](https://www.codechef.com/problems/school)
- [LeetCode](https://leetcode.com/problemset/all)
- [GeeksForGeeks](https://www.geeksforgeeks.org)

# Contribute

If you think something is incorrect, you have found a new puzzle, have a better solution or simply you want to
[add new puzzle](https://github.com/igorwojda/kotlin-coding-puzzle/wiki/Adding-a-new-puzzle) please create PR or open a
new issue.

## Contributors

- [Alan Evans](https://github.com/alanevansbc)
- [Norbert Kiesel](https://github.com/nkiesel)

# Follow me

![avatar.png](misc/image/avatar.png)

[Twitter](https://twitter.com/igorwojda) | [Medium](https://medium.com/@igorwojda) | [Linkedin](https://www.linkedin.com/in/igorwojda/)
