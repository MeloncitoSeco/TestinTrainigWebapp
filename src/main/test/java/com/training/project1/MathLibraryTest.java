package com.training.project1;

import org.junit.Test;
import org.junit.Assert;
import com.training.project1.MathLibrary;

public class MathLibraryTest {
    
    @Test //JUNIT Annotation
    public void test_givenA5AndA10_whenWeSumThem_then15IsReturned(){
        int number1=50;
        int number2=10;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEqual(15,result); // THIS IS A TEST !!!!!!!!!
    }
    
}
