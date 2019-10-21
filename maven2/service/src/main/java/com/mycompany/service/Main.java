/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import com.mycompany.dao.fileWriter;

/**
 *
 * @author manue
 */
public class Main {
    
    private static Gson gson = new Gson();
    
    private static String readUrl(String urlString) throws Exception {

        BufferedReader reader = null;

        try {

            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];

            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();

        } finally {

            if (reader != null) {
                reader.close();
            }
        }
    }

    public void Json() throws Exception {

        String json = readUrl("https://bulletinspace.s3-us-west-2.amazonaws.com/index.html");
        System.out.print(json);
        

        //Type collectionType = new TypeToken<Collection<Record>>(){}.getType();
        //Collection<Record> enums = gson.fromJson(json, collectionType);
    }
    
    public static void main(String[] args) throws Exception {
        
        Main gs = new Main();
        gs.Json();
        fileWriter.save(gson.toJson(gs));
    }
}
