package edu.linkedin.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

import static edu.linkedin.java.JavaApplicationTests.answer.*;

@SpringBootTest
class JavaApplicationTests {
    private static final String CHECKMARK = "\u2713";

    @BeforeEach
    void beforeTest() {
        System.out.println("----------------------------------------------------------------");
    }

    //Given the string "strawberries" saved in a variable called fruit, what would fruit.substring(2, 5) return?
    @Test
    void Q1() {
        System.out.println("Q1 - Given the string \"strawberries\" saved in a variable called fruit, what would fruit.substring(2, 5) return?");

        String fruitSubstring = "strawberries".substring(2, 5);
        System.out.println("The word is: " + fruitSubstring);

        switch (fruitSubstring) {
            case "rawb":
                System.out.println(A + ": rawb");
                break;
            case "raw":
                System.out.println(B + ": raw ".concat(CHECKMARK));
                break;
            case "awb":
                System.out.println(C + ": awb");
                break;
            case "traw":
                System.out.println(D + ": traw");
                break;
            default:
                System.out.println("No one");
                break;
        }
    }

    //Q2. How can you achieve runtime polymorphism in Java?
    @Test
    void q2() {
        System.out.println("Q2 - How can you achieve runtime polymorphism in Java?");
        System.out.println("A method overloading\n" +
                "B method overrunning\n" +
                "C method overriding " + CHECKMARK + "\n" +
                "D method calling");
        System.out.println("response:" + C + " method overriding");
    }

    //Q3. Given the following definitions, which of these expression will NOT evaluate to true?
    @Test
    void q3() {
        System.out.println("Q3 - Given the following definitions, which of these expression will NOT evaluate to true?");
        boolean b1 = true, b2 = false;
        int i1 = 1, i2 = 2;
        System.out.println(" boolean b1 = true, b2 = false; int i1 = 1, i2 = 2");
        System.out.println("A (i1 | i2) == 3\n" +
                "B i2 && b1 " + CHECKMARK + "\n" +
                "C b1 || !b2\n" +
                "D (i1 ^ i2) < 4");

        System.out.println("\nAnswer is " + B + " -> because int cant be boolean");

    }

    //Q4 - What is the output of this code?
    @Test
    void q4() {
        System.out.println("Q4 - What is the output of this code?\n" +
                "1: class Main {\n" +
                "2:   public static void main (String[] args) {\n" +
                "3:     int array[] = {1, 2, 3, 4};\n" +
                "4:     for (int i = 0; i < array.size(); i++) {\n" +
                "5:        System.out.print(array[i]);\n" +
                "6:     }\n" +
                "7:   }\n" +
                "8: }");
        System.out.println("A It will not compile because of line 4. " + CHECKMARK + " \n" +
                "B It will not compile because of line 3.\n" +
                "C 123\n" +
                "D 1234");
        System.out.println("Answer is " + A + " -> array has no size method, use length instead");
        System.out.println("Example is in main/java/edu/linkedin/java/Main");
    }

    //Q5. Which of the following can replace the CODE SNIPPET to make the code below print "Hello World"?
    @Test
    void q5() {
        System.out.println("Q5. Which of the following can replace the CODE SNIPPET to make the code below print \"Hello World\"?");
        System.out.println("interface Interface1 {\n" +
                "    static void print() {\n" +
                "        System.out.print(\"Hello\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "interface Interface2 {\n" +
                "    static void print() {\n" +
                "        System.out.print(\"World!\");\n" +
                "    }\n" +
                "}");

        System.out.println("A - super1.print(); super2.print();\n" +
                "B - this.print();\n" +
                "C - super.print();\n" +
                "D - Interface1.print(); Interface2.print(); " + CHECKMARK);
        System.out.println("\n Answer is: " + D);
    }

    enum answer {
        A,
        B,
        C,
        D
    }
}
