package net.floodlightcontroller.statistics;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import net.floodlightcontroller.statistics.web.SwitchPortBandwidthSerializer;
import org.projectfloodlight.openflow.types.DatapathId;
import org.projectfloodlight.openflow.types.OFPort;
import org.projectfloodlight.openflow.types.U64;

import java.util.Date;

public class FlowBandwith {

    private DatapathId id;
    private U64 bytes;
    private U64 packets;

    public DatapathId getId() {
        return id;
    }

    public void setId(DatapathId id) {
        this.id = id;
    }

    public U64 getBytes() {
        return bytes;
    }

    public void setBytes(U64 bytes) {
        this.bytes = bytes;
    }

    public U64 getPackets() {
        return packets;
    }

    public void setPackets(U64 packets) {
        this.packets = packets;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public int getIdle() {
        return idle;
    }

    public void setIdle(int idle) {
        this.idle = idle;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    private int pri;
    private int hard;
    private int idle;
    private long period;

    private FlowBandwith(DatapathId id, U64 bytes, U64 packets, int prior, int hard, int idle,long period) {
        this.id = id;
        this.bytes = bytes;
        this.packets = packets;
        this.pri = prior;
        this.hard = hard;
        this.idle = idle;
        this.period = period;
    }

    public static FlowBandwith of(DatapathId id, U64 bytes, U64 packets, int prior, int hard, int idle, long period) {
        //COMPROBAMOS SI NUESTROS DATOS SON NULOS
        if (id == null) {
            throw new IllegalArgumentException("Datapath Id cannot be null");
        }
        if (bytes == null) {
            throw new IllegalArgumentException("Bytes cannot be null");
        }
        if (packets == null) {
            throw new IllegalArgumentException("Packets cannot be null");
        }
        if (prior == 0) {
            throw new IllegalArgumentException("Priority cannot be null");
        }
        if (hard == 0) {
            throw new IllegalArgumentException("Hard Time cannot be null");
        }
        if (idle == 0) {
            throw new IllegalArgumentException("Idle Time cannot be null");
        }
        if (period == 0) {
            throw new IllegalArgumentException("Period cannot be null");
        }
        return new FlowBandwith(id,bytes,packets,prior,hard,idle,period);
    }
}
