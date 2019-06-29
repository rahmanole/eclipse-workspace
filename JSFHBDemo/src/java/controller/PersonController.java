/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Person;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import serviceImp.PersonServiceImp;

@ManagedBean
@SessionScoped
public class PersonController {

    private Person person;
    private List<Person> persons;
    private PersonServiceImp personServoce = new PersonServiceImp();

    ;
    
    public void save() {
        personServoce.save(person);
        System.out.println("Student saved");
    }

    public Person getStudent() {

        if (person == null) {
            person = new Person();
        }
        return person;
    }

    public void setStudent(Person person) {
        this.person = person;
    }

    public List<Person> getPersons() {
        persons = personServoce.getPersonList();
        return persons;
    }

    public void setStudents(List<Person> persons) {
        this.persons = persons;
    }

}
