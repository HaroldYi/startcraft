package com.example.starcraft;

/**
 * Created by lji5317 on 2017-06-24.
 */
abstract class Unit {
    private int seq;
    private String name;
    private String status;

    abstract String characteristic();

    public String attact() {
        return "1";
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
