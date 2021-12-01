package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

public class BlockChainTest {

    @Test
    public void whenTheAppStarts_ShouldPrintHelloWorld() {
        String msg = "hello World";
        Assert.assertEquals("hello World",msg);
        
    }
}
