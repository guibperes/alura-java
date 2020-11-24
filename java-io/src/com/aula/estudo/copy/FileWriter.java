package com.aula.estudo.copy;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class FileWriter {

  private String filename;

  public FileWriter(String filename) {
    this.filename = filename;
  }

  public void writeAllLines(List<String> lines) throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream(filename);
    Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);

    try (BufferedWriter writer = new BufferedWriter(outputStreamWriter)) {
      for (String line : lines) {
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
      throw e;
    }
  }
}
