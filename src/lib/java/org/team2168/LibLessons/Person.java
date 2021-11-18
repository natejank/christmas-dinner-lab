package org.team2168.LibLessons;

public class Person {
    private String name;
    private Date birthday;
    private Date deathday;


    public Person(String name, Date birthday, Date deathday) {
        setName(name);
        setBirthday(birthday);
        setDeathday(deathday);
    }

    public Person(String name) {
        this(name, new Date(), new Date());
    }

    public Person() {
        this("", new Date(), new Date());
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDeathday() {
        return deathday;
    }
    public void setDeathday(Date deathday) {
        this.deathday = deathday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
