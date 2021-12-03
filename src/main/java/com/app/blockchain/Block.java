package com.app.blockchain;

import java.util.Date;

public class Block {

    private final String data;
    private final long timeStamp;
    private final String hash;
    private final String previousHash;

    public Block(String data, String previousHash, long timeStamp) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.hash = newHash();
    }

    private String newHash() {
        return Utils.applySha256(
            previousHash + Long.toString(timeStamp) + data
        );
    }

    public String getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return data +" "+ previousHash;
    }
}
