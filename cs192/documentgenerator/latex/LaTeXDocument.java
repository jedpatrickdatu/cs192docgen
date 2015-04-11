package cs192.documentgenerator.latex;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

import java.util.List;
import java.util.ArrayList;

import cs192.documentgenerator.Element;
import cs192.documentgenerator.Document;

class LaTeXDocument implements Document {

  private static final String TITLE_STRING = "\\maketitle";
  private String header;
  private String title;
  private String footer;
  private List<Element> elements;


  LaTeXDocument() {
    title = "LaTeX Document";
    resetHeader();
    footer = "\\end{document}";
    this.elements = new ArrayList<Element>();
  }

  public void setTitle(String title) {
    this.title = title;
    resetHeader();
  }

  public void addElement(Element e) {
    this.elements.add(e);
  }

  public void save(String filename) throws Exception {
    filename = filename + ".tex";
    try (Writer writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream(filename), "utf-8"))) {
      writer.write(header + "\n");
      writer.write(TITLE_STRING + "\n");

      for (Element e: elements) {
        writer.write(e.get());
      }

      writer.write(footer + "\n");
    }
  }

  private void resetHeader() {
    header = "\\documentclass{article}\n" +
      String.format("\\title{%s}\n", this.title) +
      "\\date{\\today}\n" +
      "\\begin{document}";
  }


}
