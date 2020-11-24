package com.aula.estudo.console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class App {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    Reader reader = new InputStreamReader(inputStream);

    OutputStream outputStream = System.out;
    Writer writer = new OutputStreamWriter(outputStream);

    try (
      BufferedReader bufferedReader = new BufferedReader(reader);
      BufferedWriter bufferedWriter = new BufferedWriter(writer);
    ) {
      String line = bufferedReader.readLine();

      while(line != null && !line.isEmpty()) {
        bufferedWriter.write(line);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        line = bufferedReader.readLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
