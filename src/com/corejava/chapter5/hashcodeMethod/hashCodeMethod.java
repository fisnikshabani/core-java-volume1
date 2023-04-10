package com.corejava.chapter5.hashcodeMethod;

public class hashCodeMethod {

    public static void main(String[] args) {

        var s = "Ok";
        var sb = new StringBuilder(s);
        System.out.println("s hashCode: " + s.hashCode() + ", " + "sb.hashCode: " + sb.hashCode());

        var t = new String("Ok");
        var tb = new StringBuilder(t);
        System.out.println("t hashCode: " + t.hashCode() + ", " + "tb.hashCode: " + tb.hashCode());

    }
}
