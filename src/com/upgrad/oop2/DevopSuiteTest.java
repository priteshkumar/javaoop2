package com.upgrad.oop2;

class DevopSuite {
    private String name;
    private static final String VERSION = "1.0";

    public static class Citool {

        private static String name;
        private static String version;

        //static initializer block called onetime
        static {
            name = "Jenkins";
            version = "2.189";
        }

        public void printDetails() {
            System.out.println("citool: " + name);
            System.out.println("Version: " + version);
        }

    }

    public static class Container {

        private static String name;
        private static String version;

        //static initializer block called onetime
        static {
            name = "Docker";
            version = "18.0ce";
        }

        public void printDetails() {
            System.out.println("Container: " + name);
            System.out.println("Version: " + version);
        }

    }

}

public class DevopSuiteTest {
    public static void main(String[] args) {

        DevopSuite.Citool ci = new DevopSuite.Citool();
        ci.printDetails();
        DevopSuite.Container docker = new DevopSuite.Container();
        docker.printDetails();

    }
}