package se.hig.odp2.mp2.course;

import se.hig.odp2.mp2.roles.Person;
import se.hig.odp2.mp2.roles.Role;

public class CourseCommitment
{
    private Person person;
    private Role role;

    public CourseCommitment(Person person, Role role)
    {
        this.person = person;
        this.role = role;
    }

    public Person getPerson()
    {
        return person;
    }

    public Role getRole()
    {
        return role;
    }
}
