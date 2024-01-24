package io_1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class charSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // ascii : starts from 0, 1 byte
        // gbk : starts from 1, 2byte
        // unicode(world wide) : utf-32 -> utf-8 (1~4 flexiable length)
        // *utf-8 : english, nums -> 1 byte ; chinese -> 3 bytes (0 ; 110 - 10 ; 110 - 10 - 10; 110 - 10 - 10 - 10)
        String data = "adasfarerq我是学生fadfadafafa";
        byte[] decode = data.getBytes("UTF-8");
        System.out.println(Arrays.toString(decode));

        System.out.println(new String(decode, "GBK"));
    }
}
