package com.app.blockchain;

import java.util.Date;

public class Block {

    private final String data;
    private final long timeStamp;
    public String previousHash;
    public String hash;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }

    @Override
    public String toString() {
        return data +" "+ previousHash;
    }
}
