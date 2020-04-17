package java8.lambdaExpressions;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class Student {

    String name;
    int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
   }
