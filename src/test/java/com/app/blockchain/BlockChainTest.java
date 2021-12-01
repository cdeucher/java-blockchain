package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

public class BlockChainTest {

    @Test
    public void whenTheAppStarts_ShouldPrintHelloWorld() {
        String msg = "hello World Java";
        Assert.assertEquals("hello World Java",msg);
    }
}
