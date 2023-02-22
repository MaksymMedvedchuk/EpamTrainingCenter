package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestR {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            System.out.println("My IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.ican-school.com");
            System.out.println("BSU -> " + bsuIP.getHostAddress());

        } catch (
                UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
