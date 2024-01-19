package com.algorithem.re;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_apiPattern {
    public static void main(String[] args) {
        String regex = "(([+]\\d{3}(\\s)?)?\\d{7,10})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})";
        String data1 = "Kirsi Popova\n" +
                "Senior Adviser\n" +
                "Communications and Societal Impact\n" +
                "Tampere University of Applied Sciences\n" +
                "Email\n" +
                "kirsi.popova [at] tuni.fi\n" +
                "phone number\n" +
                "+358469216129\n" +
                "Main Campus";

        String data2 = "Riitta Aallos\n" +
                "Education Specialist\n" +
                "Tampere University\n" +
                "Email\n" +
                "riitta.aallos [at] tuni.fi\n" +
                "phone number\n" +
                "+358503186377\n" +
                "Kauppi Campus";

        String data3 = "Pami Aalto\n" +
                "Professor, Jean Monnet Professor, International Relations (specifically European integration and Regional Cooperation)\n" +
                "Tampere University\n" +
                "Email\n" +
                "pami.aalto@tuni.fi\n" +
                "phone number\n" +
                "+358503185952\n" +
                "City Centre Campus\n" +
                "Orcid\n" +
                "https://orcid.org/0000-0003-1559-8175";

        String data = data1 + data2 + data3;
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(data);
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
        System.out.println("=============================");
        String s1 = "yannan1123124zhang231419749nancheung2144238746studying java";
        System.out.println(s1.replaceAll("\\d+", "-"));
        System.out.println("=============================");
        // (.) ~ group
        // \\1 ~ group number: '1'
        // + ~ multiple
        // $1 ~ select multiple char
        String s2 = "IIII''''MMMM YYYYAAANNN NNAAANNNN ZZHHHAAANNNGGG";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));
        System.out.println("=============================");
        String s3 = "yannan1123124zhang231419749nancheung2144238746studying java";
        String[] names = s3.split("\\d+");
        System.out.println(Arrays.toString(names));
    }
}
