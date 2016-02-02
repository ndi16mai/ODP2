package se.hig.odp2.mp2.course;

import java.util.ArrayList;
import java.util.List;

public class CourseRegister
{
    private List<Course> courses;

    public CourseRegister()
    {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public List<Course> getCourses()
    {
        return courses;
    }
}
