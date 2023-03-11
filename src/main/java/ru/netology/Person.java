package ru.netology;

import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }

    public boolean hasAge() {
        if (age >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        if (age > 0) {
            return "{ имя: " + name + ", " +
                    "фамилия: " + surname + ", " +
                    "возраст: " + age + ", " +
                    "адрес: " + address + " }";
        } else {
            return "{ имя: " + name + ", " +
                    "фамилия: " + surname + ", " +
                    "адрес: " + address + " }";
        }
    }

    //   @Override
    //   public int hashCode() { /*...*/ }
}
