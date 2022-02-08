package com.nf.day1;
import java.util.Objects;
public class Student {

    private String firstname;
    private String lastname;
    private String matNr;
    private boolean ifPresent;

    public Student(){

    }

    public Student(String firstname, String lastname, String matNr, boolean ifPresent) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.matNr = matNr;
        this.ifPresent = ifPresent;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }

    public boolean ifPresent() {
        return ifPresent;
    }

    public void setIfPresent(boolean ifPresent) {
        this.ifPresent = ifPresent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", matNr='" + matNr + '\'' +
                ", ifPresent=" + ifPresent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ifPresent == student.ifPresent && Objects.equals(firstname, student.firstname)
                && Objects.equals(lastname, student.lastname) && Objects.equals(matNr, student.matNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, matNr, ifPresent);
    }


// to proof in console!!!!!!1
 //   public static void main(String[] args) {
//        Student artem = new Student();
//        artem.firstname= "art";
//        System.out.println(artem.getFirstname());
//        artem.setIfPresent(true);
//        System.out.println(artem.ifPresent);
//        Student artem2 = new Student();
//        artem2.setFirstname("artem");
//        System.out.println(artem2.firstname);
//        System.out.println(artem.equals(artem2));
//
  //  }
}
