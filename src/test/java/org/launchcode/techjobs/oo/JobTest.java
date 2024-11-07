package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(0, job2.getId() - job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

        assertTrue(job.getName() instanceof String);
        assertEquals("Product tester", job.getName());
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(true, job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String nL = System.lineSeparator();
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String jobString = job.toString();
        assertEquals(nL, jobString.substring(0, nL.length()));
        assertEquals(nL, jobString.substring(jobString.length() - nL.length()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String nL = System.lineSeparator();
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String expected = nL +
                "ID: " + job.getId() + nL +
                "Name: " + "Product tester" + nL +
                "Employer: " + "ACME" + nL +
                "Location: " + "Desert" + nL +
                "Position Type: " + "Quality control" + nL +
                "Core Competency: " + "Persistence" + nL;
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String nL = System.lineSeparator();
        Job job = new Job("",
                new Employer(""),
                new Location("Somewhere"),
                new PositionType(""),
                new CoreCompetency(""));

        String expected = nL +
                "ID: " + job.getId() + nL +
                "Name: Data not available" + nL +
                "Employer: Data not available" + nL +
                "Location: Somewhere" + nL +
                "Position Type: Data not available" + nL +
                "Core Competency: Data not available" + nL;

        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesOnlyIdFieldHasData() {
        String nL = System.lineSeparator();
        Job job = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency(""));

        String expected = "OOPS! This job does not seem to exist.";
        assertEquals(expected, job.toString());
    }

}
