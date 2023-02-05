package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MemTest {

    @org.junit.jupiter.api.Test
    void sumAllNumbers() {
        Mem mem = new Mem();
        int mem1 = mem.sumAllNumbers(7, 10, 1, 4, -3, 2);
        int lolresult = 21;
        assertEquals(lolresult, mem1);

    }

    @org.junit.jupiter.api.Test
    void sum() {
        Mem mem = new Mem();
        int lolReally = mem.sum(6);
        int lolTry = 21;
        assertEquals(lolTry, lolReally);

    }
}