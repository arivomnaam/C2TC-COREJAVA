//Program to define class Notepad 
package com.tns.ifet.DayFive.MultilevelInheritanceDemo.TextEditor;

public class Notepad {
    protected String content;

    public Notepad() {
        this.content = "";
    }

    public void write(String text) {
        content += text;
    }

    public void displayContent() {
        System.out.println("Notepad Content: " + content);
    }
}

