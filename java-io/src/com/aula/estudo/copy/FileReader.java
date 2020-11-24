package com.aula.estudo.copy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

  private String filename;

  public FileReader(String filename) {
    this.filename = filename;
  }

  public List<String> readAllLines() throws IOException {
    InputStream inputStream = new FileInputStream(filename);
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

    try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
      return reader.lines().collect(Collectors.toList());
    } catch (Exception e) {
      throw e;
    }
  }
}
