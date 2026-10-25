# Java Coursework

Selected programs from my computer science classes, written in Java.

| Project | Files | What it does |
|---|---|---|
| Sorting lab | `sortLabAndCheckTime.java`, `analysis.md` | Times bubble, selection, insertion, and merge sort on random arrays of 1,000, 10,000, and 100,000 integers, checks every result is sorted, and includes my written analysis |
| Recursion | `IntroToRecursion.java` | Recursive multiplication, repeated addition, and decimal-to-binary conversion |
| Binary conversion | `BinaryConversion.java` | Decimal to binary, negative decimal to two's complement, and binary to decimal |
| Determinant | `Determinant.java` | Recursive determinant of a randomly generated square matrix (cofactor expansion) |
| Bank accounts | `Accounts.java`, `AccountRunner.java` | A class with multiple constructors, plus a runner that manages an array of accounts |
| Roman numerals | `Roman.java` | Converts an integer from 1 to 3999 into a Roman numeral using a greedy largest-value-first method |
| Linear function | `LinearFunction.java`, `Point.java` | A class modeling y = mx + b, built from a slope and intercept, a point and slope, or two points, with intercepts, evaluation, and formatted output (`Point.java` is a small helper so it runs on its own) |
| Connect Four | `Board.java` | Board logic: dropping pieces, checking wins in four directions, full-board detection, and a random-move computer player (no game loop or interface yet) |
| Shapes | `Shapes.java`, `Circles.java`, `Square.java`, `Rectangle.java`, `Triangle.java`, `ShapesRunner.java` | An interface implemented by circle, square, rectangle, and triangle classes that compute perimeter and area and draw themselves with Swing |
| String methods | `StringLab2.java`, `StringReplace.java` | String algorithms built with loops and substring: reversing, counting overlapping and non-overlapping matches, and letter and word replacement |

## Running a program

Requires Java 11 or newer. Download the files into one folder, then:

```
javac *.java
java ClassNameWithMain
```

The classes with a `main` method are `sortLabAndCheckTime`, `IntroToRecursion`, `BinaryConversion`, `Determinant`, `AccountRunner`, `Roman`, `ShapesRunner`, `StringLab2`, and `StringReplace`. For example: `java sortLabAndCheckTime`. The 100,000-element bubble sort takes several seconds, so the full sorting run takes about half a minute.

## Notes

Timing results depend on the computer running them. The sorting comparison is meant to show how the growth rates differ (roughly quadratic for bubble, selection, and insertion; n log n for merge), not to give exact benchmark numbers.
