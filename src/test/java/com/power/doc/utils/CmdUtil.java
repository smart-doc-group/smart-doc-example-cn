package com.power.doc.utils;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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

  public static void main(String[] args) throws IOException {
    String me = executeCmd("stat","10.177.44.39","16701");
    System.out.println(me);
  }
}
