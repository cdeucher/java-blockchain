package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class BlockChainTest {

    @Test
    public void whenTheAppStarts_ShouldPrintHelloWorld() {
        String msg = "hello World";
        Assert.assertEquals("hello World",msg);
    }

    @Test
    public void whenCreateBlock_ShouldbeABlock() {
        ArrayList<Block> blockChain = new ArrayList<Block>();
        blockChain.add(new Block("root", "", new Date().getTime()));
        blockChain.add(new Block("node one", blockChain.get(blockChain.size()-1).getHash(), new Date().getTime()));
        blockChain.add(new Block("node two", blockChain.get(blockChain.size()-1).getHash(), new Date().getTime()));
        Assert.assertEquals(3, blockChain.size());
        Assert.assertEquals("root", blockChain.get(0).getData());
    }
}
