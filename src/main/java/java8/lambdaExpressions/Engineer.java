package java8.lambdaExpressions;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class Engineer {
    private String name;
    private int age;
    private boolean hasGf;


    Engineer(String name, int age, boolean hasGf){
        this.name=name;
        this.age=age;
        this.hasGf=hasGf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasGf() {
        return hasGf;
    }

    public void setHasGf(boolean hasGf) {
        this.hasGf = hasGf;
    }
}
