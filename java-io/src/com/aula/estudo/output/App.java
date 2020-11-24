package com.aula.estudo.output;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App {

  public static void main(String[] args) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
      Writer writer = new OutputStreamWriter(fileOutputStream);

      try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
        bufferedWriter.write("Hello World");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("OK");
        bufferedWriter.newLine();
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
