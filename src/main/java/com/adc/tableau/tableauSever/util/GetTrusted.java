package com.adc.tableau.tableauSever.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * 获取票证
 */

public class GetTrusted {

    /**
     *获取票证
     * @param tableServer
     * @param user
     * @param remoteAddr
     * @return 票证  票证为24位
     */
    public static String getTrustedTicket(String tableServer, String user, String remoteAddr) {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        try { // Encode the parameters

            URL url = new URL("http://" + tableServer + "/trusted");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            out = new OutputStreamWriter(conn.getOutputStream());
            String data = URLEncoder.encode("username", "UTF-8") +
                    "=" +
                    URLEncoder.encode(user, "UTF-8") +
                    "&" +
                    URLEncoder.encode("client_ip", "UTF-8") +
                    "=" +
                    URLEncoder.encode(remoteAddr, "UTF-8");
            out.write(data);
            out.flush(); // Read the response

            StringBuilder rsp = new StringBuilder();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                rsp.append(line);
            }
            return rsp.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
