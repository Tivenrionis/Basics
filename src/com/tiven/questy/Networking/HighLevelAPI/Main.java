package com.tiven.questy.Networking.HighLevelAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URI uri = url.toURI();
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            //szybszy sposob open stream otwiera urlconnection
            BufferedReader inputStream2 = new BufferedReader(new InputStreamReader(url.openStream()));


            Map<String, List<String>> headerFields = urlConnection.getHeaderFields(); // get headers of the page

            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.println("------------Key = " + key);

                for (String s : values) {
                    System.out.println("Values = "+ s);
                }


            }

//            String line = "";
//            while (line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();


//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());
//
//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/store/locations?zip=12345");
//
//            //URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            // URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//
//            URI resolvedUri1 = baseUri.resolve(uri1);
//            URI resolvedUri2 = baseUri.resolve(uri2);
//            URI resolvedUri3 = baseUri.resolve(uri3);
//
//            URL url1 = resolvedUri1.toURL();
//            System.out.println("URL = " + url1);
//            URL url2 = resolvedUri2.toURL();
//            System.out.println("URL = " + url2);
//            URL url3 = resolvedUri3.toURL();
//            System.out.println("URL = " + url3);
//
//
//
//            URI relativizedURI= baseUri.relativize(resolvedUri2);
//            System.out.println("Relative URI = "+ relativizedURI);
//
//
//
////

//
        } catch (URISyntaxException e) {
            System.out.println("URI bad syntax " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL malformed " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
