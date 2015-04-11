package cs192.documentgenerator.latex;

import cs192.documentgenerator.DocumentFactory;
import cs192.documentgenerator.Document;
import cs192.documentgenerator.ItemList;
import cs192.documentgenerator.Table;

public class LaTeXDocumentFactory implements DocumentFactory {
  private static LaTeXDocumentFactory instance = null;

  private LaTeXDocumentFactory() {

  }

  public static synchronized LaTeXDocumentFactory getInstance () {
    if (instance == null) {
      instance = new LaTeXDocumentFactory();
    }
    return instance;
  }

  public Document createDocument() {
    return new LaTeXDocument();
  }

  public ItemList createItemList(boolean ordered) {
    return new LaTeXItemList(ordered);
  }

  public Table createTable(int height, int width) {
    return new LaTeXTable(height, width);
  }
}
