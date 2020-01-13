package com.upgrad.oop2;

abstract class CiToolV1 {
    private String name;
    private String version;

    public CiToolV1(String name, String version) {
        this.name = name;
        this.version = version;
    }

    //abstract class can have nonabstract method implemented
    protected String getDetails() {
        return "Name: " + this.name + "\n" + "Version: " + this.version;
    }

    protected abstract void install();

    protected abstract String getConfig();

    //abstract method cant be final as it cant be overridden
    //protected final void printConfig(); compile time error

}


class JenkinsV1 extends CiToolV1 {
    private int numSlaves;
    private final String masterUrl;

    public JenkinsV1(int numSlaves, String masterUrl) {
        super("jenkins", "2.189");
        this.numSlaves = numSlaves;
        this.masterUrl = masterUrl;
    }

    public void install() {
        System.out.println("installing Jenkins-master on Linux");
        System.out.println("configuring slave nodes");
        System.out.println("Installation completed....");
    }

    public String getConfig() {
        String cfg = super.getDetails();
        cfg += "\nMasterUrl: " + this.masterUrl + "\n" +
                "NumSlaves: " + this.numSlaves;
        return cfg;
    }

}


class BuildBotV1 extends CiToolV1 {
    private int numSlaves;
    private final String masterUrl;

    public BuildBotV1(int numSlaves, String masterUrl) {
        super("buildbot", "2.5.1");
        this.numSlaves = numSlaves;
        this.masterUrl = masterUrl;
    }

    public void install() {
        System.out.println("installing Buildbot-master on Linux");
        System.out.println("configuring slave nodes");
        System.out.println("Installation completed....");
    }

    public String getConfig() {
        String cfg = super.getDetails();
        cfg += "\nMasterUrl: " + this.masterUrl + "\n" +
                "NumSlaves: " + this.numSlaves;
        return cfg;
    }

}


public class AbstractDemo {
    public static void main(String[] args) {
        CiToolV1 ci1 = new JenkinsV1(3, "https://192.168.0.104:8080/");
        CiToolV1 ci2 = new BuildBotV1(2, "http://192.168.0.107");

        ci1.install();
        System.out.println(ci1.getConfig());
        ci2.install();
        System.out.println(ci2.getConfig());

    }
}
