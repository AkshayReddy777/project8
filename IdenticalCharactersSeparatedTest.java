package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdenticalCharactersSeparatedTest {
    @Test
    public void testcase1() {
        Assert.assertEquals( "[h,e,l,*,l,o]" , IdenticalCharactersSeparated.separationOfText("hello" ) );
    }
    @Test
    public void testcase2() {
        Assert.assertEquals("[x,*,x,y,*,y]" ,  IdenticalCharactersSeparated.separationOfText("xxyy"  ));
    }
    @Test
    public void testcase3() {
        Assert.assertEquals("[a,*,a,*,a,*,a]" ,  IdenticalCharactersSeparated.separationOfText("aaaa" ) );
    }

}