package java8.lambdaExpressions;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class Movie {


    private String name;
    private String actor;
    private String actress;

    Movie(String name, String actor, String actress){
        this.name=name;
        this.actor=actor;
        this.actress=actress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }
}
