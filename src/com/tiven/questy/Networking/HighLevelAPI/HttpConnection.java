package com.tiven.questy.Networking.HighLevelAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//.net paczka jest przestarzala... warto uzyc 3rd party libow -> Jetty albo Apache HTTPCient
public class HttpConnection {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.flickr.com/services/feeds/photos_public.gne?tags=home");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(15000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code = " + responseCode);

            if (responseCode != 200) {
                System.out.println("Something went wrong");
                System.out.println(connection.getResponseMessage());
                return;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
