package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findContentChildrenTest() {
        Solution solution = new Solution();
        assertEquals(1, solution.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        assertEquals(2, solution.findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

}