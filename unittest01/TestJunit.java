import org.junit.Test;
// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

// package com.javacodegeeks.junit;

public class TestJunit {
    
   @Test
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine", str);
   }
}

