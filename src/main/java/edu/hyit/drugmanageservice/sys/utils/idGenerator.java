package edu.hyit.drugmanageservice.sys.utils;

import java.util.UUID;

public class idGenerator {
    public static String generator(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
