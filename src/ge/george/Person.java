package ge.george;

import java.util.Comparator;

public class Person {
    private String personalN;
    private String name;
    private int age;

   public Person(String personalN,String name,int age){
       this.personalN=personalN;
       this.name = name;
       this.age=age;
   }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPersonalN() {
        return personalN;
    }

    @Override
   public String toString() {
        return "Person{" +
                "personalN='" + personalN + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
