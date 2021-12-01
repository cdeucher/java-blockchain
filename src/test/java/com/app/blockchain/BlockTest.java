package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

public class BlockTest {

    @Test
    public void whenCreateBlock_ShouldBeBlock() {
        Block block = new Block("meu dado", "hash:00999");

        Assert.assertEquals("meu dado hash:00999",block.toString());
    }
}
