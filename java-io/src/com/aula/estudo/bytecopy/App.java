package com.aula.estudo.bytecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {

  public static void main(String[] args) {
    try(
      InputStream inputStream = new FileInputStream("lorem.txt");
      OutputStream outputStream = new FileOutputStream("output.txt");
    ) {
      int fileByte = inputStream.read();

      while(fileByte != -1) {
        outputStream.write(fileByte);
        fileByte = inputStream.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
