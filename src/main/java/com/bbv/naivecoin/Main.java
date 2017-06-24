package com.bbv.naivecoin;

import com.bbv.naivecoin.core.blockchain.Block;

public class Main {
    public static void main(String[] args) {
        Block block = new Block();
        System.out.println("This is a test! =" + block.getHash());
    }
}
