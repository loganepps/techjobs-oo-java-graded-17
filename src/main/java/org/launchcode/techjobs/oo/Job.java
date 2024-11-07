package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        if ((name == null || name.trim().isEmpty()) &&
            (employer == null || employer.toString().trim().isEmpty()) &&
            (location == null || location.toString().trim().isEmpty()) &&
            (positionType == null || positionType.toString().trim().isEmpty()) &&
            (coreCompetency == null || coreCompetency.toString().trim().isEmpty())) {
            return "OOPS! This job does not seem to exist.";
        }
        String nL = System.lineSeparator();
        return nL +
                "ID: " + this.id + nL +
                "Name: " + (this.name == null || this.name.trim().isEmpty() ? "Data not available" : this.name) + nL +
                "Employer: " + (this.employer == null || this.employer.toString().trim().isEmpty() ? "Data not available" : this.employer) + nL +
                "Location: " + (this.location == null || this.location.toString().trim().isEmpty() ? "Data not available" : this.location) + nL +
                "Position Type: " + (this.positionType == null || this.positionType.toString().trim().isEmpty() ? "Data not available" : this.positionType) + nL +
                "Core Competency: " + (this.coreCompetency == null || this.coreCompetency.toString().trim().isEmpty() ? "Data not available" : this.coreCompetency)
                + nL;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
