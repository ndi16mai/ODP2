package se.hig.odp2.mp2.course;

import java.util.ArrayList;
import java.util.List;

public class CourseOccasion
{
    private List<CourseCommitment> commitments;
    private Course course;
    private Period startPeriod;
    private int speed;

    public CourseOccasion(Course course, Period startPeriod, int speed)
    {
        commitments = new ArrayList<>();
        this.course = course;
        this.startPeriod = startPeriod;
        this.speed = speed;
    }

	public void commitPerson(CourseCommitment courseCommitment)
	{
		commitments.add(courseCommitment);
	}

	public List<CourseCommitment> getCommitments() {
		return commitments;
	}

	public Course getCourse() {
		return course;
	}

	public Period getStartPeriod() {
		return startPeriod;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString()
	{
		return startPeriod + " Speed: " + speed + "%";
	}
    
    


}
