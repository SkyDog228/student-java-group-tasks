# Student Java Group Tasks

This repository has 7 easy Java tasks for 22 students. Each task is for one group of 3 students. One group can have 4 students.

The tasks practice:

- `for` loops
- `if` / `else`
- primitive types: `int`, `double`, `boolean`, `char`
- `String`
- operators like `+`, `-`, `*`, `/`, `%`, `==`, `>=`

## Groups

| Group | Students | Task |
|---|---:|---|
| Group 1 | 3 | Task 1: Text Statistics |
| Group 2 | 3 | Task 2: Password Checker |
| Group 3 | 3 | Task 3: Number Analyzer |
| Group 4 | 3 | Task 4: Shopping Cart |
| Group 5 | 3 | Task 5: Gradebook |
| Group 6 | 3 | Task 6: Text Encoder |
| Group 7 | 3 or 4 | Task 7: Attendance Tracker |

## How to Run

Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/student-java-group-tasks.git
cd student-java-group-tasks
```

Run the project and see the task list:

```bash
gradle run
```

Run all tests:

```bash
gradle test
```

Run only one group's tests:

```bash
gradle test --tests Task1TextStatisticsTest
gradle test --tests Task2PasswordStrengthCheckerTest
gradle test --tests Task3NumberPatternAnalyzerTest
gradle test --tests Task4ShoppingCartCalculatorTest
gradle test --tests Task5GradebookReporterTest
gradle test --tests Task6SimpleTextEncoderTest
gradle test --tests Task7AttendanceTrackerTest
```

## Rules

- Each group implements only its own task class.
- Do not change the test files.
- Do not change method names, return types, or parameters.
- Use at least one `for` loop.
- Use `if` statements.
- Keep the code simple.

## Task 1: Text Statistics

Class: `Task1TextStatistics`

Implement only these 3 methods:

```java
countVowels(String text)
countWords(String text)
countCharactersWithoutSpaces(String text)
```

Requirements:

- `countVowels` counts `a`, `e`, `i`, `o`, `u`.
- It should work with uppercase and lowercase letters.
- `countWords` counts words separated by spaces.
- Empty text or only spaces should return `0` words.
- `countCharactersWithoutSpaces` counts all characters except spaces.

Example:

- `"Java is Fun!"` has 4 vowels.
- `"Java is Fun!"` has 3 words.
- `"a b c"` has 3 characters without spaces.

## Task 2: Password Checker

Class: `Task2PasswordStrengthChecker`

Implement only these 3 methods:

```java
hasDigit(String password)
isLongEnough(String password)
hasNoSpaces(String password)
```

Requirements:

- `hasDigit` returns `true` if the password has at least one number.
- `isLongEnough` returns `true` if the password length is at least 8.
- `hasNoSpaces` returns `true` if the password has no spaces.

Example:

- `"Java2026"` has a digit and is long enough.
- `"Short1"` has a digit but is not long enough.
- `"Java 2026"` has a space.

## Task 3: Number Analyzer

Class: `Task3NumberPatternAnalyzer`

Implement only these 3 methods:

```java
sumFromOneTo(int number)
isEven(int number)
positiveNegativeOrZero(int number)
```

Requirements:

- `sumFromOneTo(5)` returns `15`.
- `sumFromOneTo(0)` returns `0`.
- `sumFromOneTo(-3)` returns `-6`.
- `isEven` returns `true` when the number is even.
- `positiveNegativeOrZero` returns `"positive"`, `"negative"`, or `"zero"`.

Example:

- `sumFromOneTo(5)` means `1 + 2 + 3 + 4 + 5`.
- `isEven(4)` returns `true`.
- `positiveNegativeOrZero(-3)` returns `"negative"`.

## Task 4: Shopping Cart

Class: `Task4ShoppingCartCalculator`

Implement only these 3 methods:

```java
lineTotal(double price, int quantity)
discountAmount(double subtotal)
finalPrice(double subtotal)
```

Requirements:

- `lineTotal` returns `price * quantity`.
- `discountAmount` returns 10% of the subtotal if subtotal is at least `100`.
- Otherwise, discount is `0`.
- `finalPrice` returns subtotal minus discount.

Example:

- `lineTotal(10.0, 3)` returns `30.0`.
- `discountAmount(200.0)` returns `20.0`.
- `finalPrice(200.0)` returns `180.0`.

## Task 5: Gradebook

Class: `Task5GradebookReporter`

Implement only these 3 methods:

```java
average(int[] scores)
letterGrade(int score)
isPassing(int score)
```

Requirements:

- `average` returns the average score.
- Empty score arrays should return `0.0`.
- `isPassing` returns `true` for scores `60` or more.
- Letter grades:
  - `90` to `100`: `A`
  - `80` to `89`: `B`
  - `70` to `79`: `C`
  - `60` to `69`: `D`
  - below `60`: `F`

Example:

- Average of `{100, 80, 60}` is `80.0`.
- `letterGrade(95)` returns `"A"`.
- `isPassing(60)` returns `true`.

## Task 6: Text Encoder

Class: `Task6SimpleTextEncoder`

Implement only these 3 methods:

```java
shiftChar(char value, int shift)
encode(String text, int shift)
countLetters(String text)
```

Requirements:

- Shift only English letters.
- Keep uppercase letters uppercase.
- Keep lowercase letters lowercase.
- Digits, spaces, punctuation, and symbols do not change.
- Shift wraps around the alphabet.
- `countLetters` counts only English letters.

Example:

- `shiftChar('A', 2)` returns `'C'`.
- `encode("Abc Z!", 2)` returns `"Cde B!"`.
- `countLetters("Java 17")` returns `4`.

## Task 7: Attendance Tracker

Class: `Task7AttendanceTracker`

Implement only these 3 methods:

```java
countPresent(String records)
countAbsent(String records)
hasPerfectAttendance(String records)
```

Requirements:

- `P` means present.
- `A` means absent.
- Lowercase `p` and `a` should also work.
- Ignore spaces and other characters.
- `hasPerfectAttendance` returns `true` only when there are no absences and at least one present record.

Example:

- `"P A l x p P"` has 3 present records.
- `"P A l x p P"` has 1 absent record.
- `"PPpp"` has perfect attendance.

## Teacher Workflow

1. Create a public GitHub repository.
2. Push this project.
3. Ask each group to create a branch named `group-1`, `group-2`, etc.
4. Each group implements only its assigned class.
5. Each group opens a pull request.
6. Check that their tests pass.

Useful Git commands for students:

```bash
git checkout -b group-1
git status
git add .
git commit -m "Complete group 1 task"
git push origin group-1
```
