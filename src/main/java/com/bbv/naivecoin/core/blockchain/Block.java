package com.bbv.naivecoin.core.blockchain;

/**
 * Created by Dani on 21/06/2017.
 */

public class Block {

    private Integer hash;
    private Block next;
    private Block previous;

   public Integer getHash() {
        return hash;
    }

    public void setHash(Integer hash) {
        this.hash = hash;
    }

    public Block getNext() {
        return next;
    }

    public void setNext(Block next) {
        this.next = next;
    }

    public Block getPrevious() {
        return previous;
    }

    public void setPrevious(Block previous) {
        this.previous = previous;
    }




}
