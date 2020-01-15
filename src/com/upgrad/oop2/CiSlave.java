package com.upgrad.oop2;

abstract class Slave {
    private String name;
    private String ipAddress;

    public Slave(String name, String ipAddress) {
        this.name = name;
        this.ipAddress = ipAddress;
    }

    public abstract void configureSlave();

    public abstract void performBuild();

    public abstract void performTests();

    public abstract void freeDiskspace();

    protected void displayStats() {
        System.out.println("Slave: " + this.name);
        System.out.println("IpAddress: " + this.ipAddress);
    }
}

abstract class LinuxSlave extends Slave {
    private String osType;
    private String archType;

    public LinuxSlave(String name, String ipAddress, String archType) {
        super(name, ipAddress);
        this.osType = "Linux";
        this.archType = archType;
    }

}

class UbuntuSlave extends LinuxSlave {
    private String flavour;

    public UbuntuSlave(String name, String ipAddress, String archType) {
        super(name, ipAddress, archType);
        this.flavour = "bionic-beaver";
    }

    public void configureSlave() {
        System.out.println("installing build requirements");
        System.out.println("installing test requirements");
        System.out.println("check ssh connection status");
    }

    public void performBuild() {
        System.out.println("do compilation");
    }

    public void performTests() {
        System.out.println("run unit tests");
        System.out.println("run functional tests");
    }

    public void freeDiskspace() {
        System.out.println("cleanup disk space");
    }
}


public class CiSlave {
    public static void main(String[] args) {
        UbuntuSlave slave1 = new UbuntuSlave("slave-bionic-1", "192.168.0.123", "x86_64");
        slave1.displayStats();
        slave1.configureSlave();
        slave1.performBuild();
        slave1.performTests();

    }
}
