package com.hy.entity;

/*

  植树造法 

*/
public class Order1 {
    private int oid;
    public Order1(){

    }

    public Order1(int oid) {
        this.oid = oid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Order1{" +
                "oid=" + oid +
                '}';
    }
}
