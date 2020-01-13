package com.upgrad.oop2;

class DevopsTool {
    protected final String name;
    protected String version;

    public DevopsTool(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getDetails() {
        return "Tool: " + this.name + "\n" + "Version: " + this.version;
    }

}


class BuildBot extends DevopsTool {
    private String sourcelang;

    public BuildBot(String name, String version, String sourcelang) {
        super(name, version);
        this.sourcelang = sourcelang;
    }

    public String getSourcelang() {
        return this.sourcelang;
    }

    public String getDetails() {
        System.out.println("printing protected member variable name: " + this.name);
        System.out.println(this.version);
        String toolDetails = super.getDetails();
        toolDetails += "\n" + "Sourcelang: " + this.sourcelang;
        return toolDetails;
    }

}


public class ProtectedTest {
    public static void main(String[] args) {
        BuildBot buildtool = new BuildBot("Buildbot", "2.14", "python");
        System.out.println(buildtool.getDetails());
    }
}
