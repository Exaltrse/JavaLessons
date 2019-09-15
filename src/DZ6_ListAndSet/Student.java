package DZ6_ListAndSet;

import java.util.Objects;

public class Student implements Comparable<Student> {
    static Long globalId = 0L;

    Long id;
    String name;
    String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = globalId ++;
    }

    public static Long getGlobalId() {
        return globalId;
    }

    public static void setGlobalId(Long globalId) {
        Student.globalId = globalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(Student o) {
        if(this.surname.compareTo(o.surname)<0) return -1;
        if(this.surname.compareTo(o.surname)>0) return 1;
        if(this.name.compareTo(o.name)<0) return -1;
        if(this.name.compareTo(o.name)>0) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id " + id +
                ", name " + name +
                ", surname " + surname + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId().equals(student.getId()) &&
                getName().equals(student.getName()) &&
                getSurname().equals(student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname());
    }
}
