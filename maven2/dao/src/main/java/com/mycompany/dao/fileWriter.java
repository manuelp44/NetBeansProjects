/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Manuel Peralta
 */
public class fileWriter implements Serializable {

    public static void save(String data) {

        File file = new File("");
        if (!file.exists()) {
            try {
                File directory = new File(file.getParent());
                if (!directory.exists()) {
                    directory.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                System.out.print("Excepton Occured: " + e.toString());
            }
        }

        try {
            
            FileWriter Writer;
            Writer = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bufferWriter = new BufferedWriter(Writer);
            bufferWriter.write(data);
            bufferWriter.close();

        } catch (IOException e) {
            System.out.print("Hmm.. Got an error while saving Company data to file " + e.toString());
        }
    }
}
