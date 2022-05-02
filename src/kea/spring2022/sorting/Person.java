package kea.spring2022.sorting;

public class Person implements ComparableObject {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    @Override
    public boolean sortedBy(ComparableObject otherObject) {
        if (otherObject instanceof Person) {
            return compareTo((Person)otherObject);
        } else {
            return false;
        }
    }

    private boolean compareTo(Person otherObject) {
        return false;
    }
}
