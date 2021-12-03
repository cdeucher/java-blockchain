package com.app.blockchain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BlockTest {

    @Test
    public void whenCreateBlock_ShouldBeBlock() {
        Long timeStamp = new Date().getTime();
        Block block = new Block("meu dado", "hash:00999", timeStamp);

        assertEquals("meu dado hash:00999",block.toString());
    }

    @Test
    public void whenCreateHash_ShouldValidateTheHash() {
        String hash = "0c9afc70e50c08ab44a47217eb2edbcb339e2c9a643da9bd9d27cc325e3777d5";
        Long timeStamp = (long) 1638488591;
        Block block = new Block("meu dado", "hash:00999", timeStamp);

        assertEquals(hash,block.getHash());
    }
}
