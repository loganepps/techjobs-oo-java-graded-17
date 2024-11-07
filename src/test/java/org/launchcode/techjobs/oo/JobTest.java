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
        String expected = nL +
                "ID: " + 1 + nL +
                "Name: " + "Product tester" + nL +
                "Employer: " + "ACME" + nL +
                "Location: " + "Desert" + nL +
                "Position Type: " + "Quality control" + nL +
                "Core Competency: " + "Persistence" + nL;
        assertEquals(expected, job.toString());
    }

    @Test
    public void testTestToStringStartsAndEndsWithNewLine() {
        String nL = System.lineSeparator();
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String[] jobStringSplit = jobString.split(nL);
        int n = jobStringSplit.length;
//        assertEquals(nL, jobString[0]);
//        assertEquals(nL, jobString.charAt(n-1));
    }


}
