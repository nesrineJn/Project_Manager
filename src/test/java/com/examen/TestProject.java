package com.examen;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestProject 
{
    /**
     * Rigorous Test :-)
     */
    @Test
public void testProjectCreation (){
    Project p = new Project(1, "Project Alpha", "2024-12-01", "2024-12-31", 10, 5000, null, null);
        p.createProject();
        }
        
          
}
