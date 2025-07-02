## Lab - Homework

&nbsp;

In the package you used for this lessons code examples,
create a new class file called `FilmClassification` and paste in the following code.

```java
public class FilmClassification {

    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
```

&nbsp;

This class contains the method `getClassificationsByAge`,
which is a partly completed implementation of the following requirements:

1. If someone is under 12 - U, PG and 12 films are available

2. If someone is under under 15 - U, PG, 12 and 15 films are available

3. Over 18 - all films are available

Given an age (integer),
the method should return a string containing the film classifications
that a person of that age is allowed to see.

You will need to check that these requirements are correct and complete.
Go to the British Board of Film Classification site
<https://www.bbfc.co.uk/> and amend the requirements if necessary.

&nbsp;

You will need to test your solution
using equivalence partitioning and boundary test analysis to derive your test cases.

Add a new class called `FilmClassificationTests` to your project's `test` package.
Write unit tests to check that the requirements above are satisfied.

All tests will need to pass.

Be prepared to demonstrate your work in the next session.
