package com.power.doc.utils;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author yu3.sun on 2022/4/13
 */
public class CmdUtil {


    public static String executeCmd(String cmd, String zkServer, String zkPort) throws IOException {
        StringBuilder sb;
        try (Socket s = new Socket(zkServer, Integer.parseInt(zkPort));
             PrintWriter out = new PrintWriter(s.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
            out.println(cmd);
            String line = reader.readLine();
            sb = new StringBuilder();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }
        }
        return sb.toString();
    }


    @Test
    public void testCmd() throws IOException {
        String me = executeCmd("stat", "localhost", "16701");
        Assert.notNull(me, "me is null");
    }
}
