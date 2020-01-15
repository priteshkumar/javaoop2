package com.upgrad.oop2;

interface EditImage {
    String version = "V1.0";
    void crop();
    void resize();
}


abstract class ImageTool {
    private String name;
    private String decsription;

    public ImageTool(String name, String description) {
        this.name = name;
        this.decsription = description;
    }

    void display() {
        System.out.println("this is baseclass");
    }

    protected abstract void openImage(String filepath);

    protected abstract void saveImageas(String filepath);
}


class ImgEdit extends ImageTool implements EditImage {
    private String os;

    public ImgEdit(String os) {
        super("ImgEdit", "Linux Image Editor");
        this.os = os;
    }

    public void display() {
        System.out.println("this is subclass");
    }

    public void openImage(String imgPath) {
        System.out.println("open image " + imgPath);
    }

    public void saveImageas(String fpath) {
        System.out.println("saving image as: " + fpath);
    }

    public void crop() {
        System.out.println("crop image");
    }

    public void resize() {
        System.out.println("resize image");
    }
}


public class ImageToolDemo {
    public static void main(String[] args) {
        ImgEdit imedt = new ImgEdit("Linux");
        imedt.openImage("/home/mavixk/snap.jpg");
        imedt.resize();
        imedt.crop();
        double val = 2.0;
        boolean flag = (val != 0.0);
        System.out.println(flag);
        String cmplx = "-3.2";
        System.out.println(cmplx.length());
        cmplx = "3";
        cmplx = cmplx + "+i" + "0.0";

        System.out.println(cmplx);

    }
}
