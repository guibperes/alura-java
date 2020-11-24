package com.aula.estudo.copy;

import java.io.IOException;

public class App {

  public static void main(String[] args) {
    FileReader reader = new FileReader("lorem.txt");
    FileWriter writer = new FileWriter("output.txt");

    try {
      writer.writeAllLines(reader.readAllLines());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
