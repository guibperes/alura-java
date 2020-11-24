package com.aula.estudo.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class App {

  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream = new FileInputStream("lorem.txt");
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

      try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
        // String line = bufferedReader.readLine();

        // while(line != null) {
        //   System.out.println(line);

        //   line = bufferedReader.readLine();
        // }

        bufferedReader.lines().forEach(System.out::println);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
