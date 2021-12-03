package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class UtilsTest {

    @Test
    public void whenCreateANewHash_ShouldBeAValidHash() {
        Long timeStamp = new Date().getTime();
        Block block = new Block("meu dado", "hash:9901", timeStamp);
        Utils util = new Utils();
        String newHash = util.applySha256(block.toString());

        Assert.assertEquals("9e9cc53ff534f7e10c1ddad7639199a86f6680cf8aec2c325bbf06d292545dc1",
        newHash);
    }
}
