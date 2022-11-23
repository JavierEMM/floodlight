package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using=StringSetSerializer.class)
public class StringClass {
    private String MAC;
    private String IP;

    public StringClass(){

    }

    public StringClass(String MAC, String IP) {
        this.MAC = MAC;
        this.IP = IP;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String SWITCH) {
        this.IP = SWITCH;
    }



}
