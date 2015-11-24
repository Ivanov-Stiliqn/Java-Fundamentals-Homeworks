package Problem_06;

import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private int number;

    public Course(String name,int number){
        this.setName(name);
        this.setNumber(number);

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number =number;
    }

    @Override
    public String toString(){
        return "{ "+this.getName()+" - Students: "+this.getNumber()+" }";
    }
}
