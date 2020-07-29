package ge.george;

import java.util.*;

public class PeopleFunction {
    private List<Person> data;

    class CompareByPersonalN implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getPersonalN().compareTo(o2.getPersonalN());
        }

    }
    class SortByAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge()-o2.getAge();
        }
    }


    public void setData(List<Person> data) {

        this.data = data;
    }
    public void sortByPID(){
        Collections.sort(data, new CompareByPersonalN());
    }
    public void sortByAge(){
        Collections.sort(data, new SortByAge());
    }

    public void print() {
        for (Person p : data) {
            System.out.println(p.getPersonalN());
        }
    }

    public Optional<Person> findPersonByPersonalID(String personalN) {
        sortByPID();
        int head = 0;
        int end = data.size() - 1;
        int i;
        while (head <= end) {

            i = head + (end - head) / 2;
            if (data.get(i).getPersonalN().compareTo(personalN) == 0)
                return Optional.of(data.get(i));
            if (0 > data.get(i).getPersonalN().compareTo(personalN))
                head = i + 1;
            else
                end = i - 1;
        }
        return Optional.empty();

//        int mid = data.size() / 2;
//        if (data.size() - 1 >= 0) {
//            if (data.get(mid).getPersonalN().compareTo(personalN)==0)
//                return data.get(mid).getName();
//
//            if (0<data.get(mid).getPersonalN().compareTo(personalN))
//                return findPersonByPersonalID(personalN);
//
//            return findPersonByPersonalID(personalN);
//        }
//        return null;
    }
    public List<Person> getPersonOlderThan(int age) {
        sortByAge();
        List<Person> result=new ArrayList<>();
        int head = 0;
        int end = data.size() - 1;
        int i=0;
        while (head <= end) {

            i = head + (end - head) / 2;
            if (data.get(i).getAge() == age ) {
                result.add(data.get(i));
                break;
            }
            if (data.get(i).getAge() > (age))
                head = i + 1;
            else
                end = i - 1;
        }
        for (int j = data.indexOf(data.get(i)); j <data.size() ; j++) {

            result.add(data.get(j));
        }
        return result;
    }
}
