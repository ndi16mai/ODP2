package se.hig.odp2.mp2.course;

import java.util.ArrayList;
import java.util.List;

public class Course
{
    private String name, courseCode;
    private Float points;
    private List<CourseOccasion> courseOccasions;

    public Course(String name, String courseCode, Float points)
    {
        courseOccasions = new ArrayList<>();
        this.name = name;
        this.courseCode = courseCode;
        this.points = points;
    }

    @Override
    public String toString()
    {
        return courseCode + ": " +name;
    }
}
