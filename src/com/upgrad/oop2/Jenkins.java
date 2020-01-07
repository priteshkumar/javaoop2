package com.upgrad.oop2;

class Citool {
    private String tooltype = "ci";
    private String name;
    private String version;
    private boolean crossplatform;

    public Citool(String name,String version,boolean crossplatform){
        this.name = name;
        this.version = version;
        this.crossplatform = crossplatform;
    }

    protected String getName(){
        return this.name;
    }

    protected String getVersion(){
        return this.version;
    }

}


class  Jenkins extends Citool{

    private String sourcelang;

    public Jenkins(String name, String version,
                   boolean crossplatform,String sourcelang) {
        super(name, version,crossplatform);
        this.sourcelang = sourcelang;
    }

    public String getSourcelang(){
        return this.sourcelang;
    }

    public String getDetails(){
        String name = this.getName();
        String version = this.getVersion();
        String sname = super.getName();
        System.out.println("super name return value: " + sname);
        String jenkinscfg = "name: " + name + "\n" + "version: " + version +
                "\n" + "sourcelang: " + this.sourcelang;

        //System.out.printf("%s: %s%n",this.getName(),this.getVersion());
        return jenkinscfg;
    }

    public static void main(String[] args) {
	// write your code here
        Jenkins ci = new Jenkins("Jenkins automation server",
                "2.189",
                true,"Java");

        System.out.println(ci.getDetails());

    }
}
