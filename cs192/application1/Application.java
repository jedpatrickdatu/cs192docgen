package cs192.application1;

import cs192.documentgenerator.DocumentFactory;
import cs192.documentgenerator.Document;
import cs192.documentgenerator.ItemList;
import cs192.documentgenerator.Table;

import cs192.documentgenerator.latex.LaTeXDocumentFactory;

public class Application {
  public static void main(String[] args) throws Exception {
    DocumentFactory latexDocumentFactory = LaTeXDocumentFactory.getInstance();
    Document d = latexDocumentFactory.createDocument();

    ItemList orderedList =
      latexDocumentFactory.createItemList(ItemList.ORDERED);
    ItemList unorderedList =
      latexDocumentFactory.createItemList(ItemList.UNORDERED);

    Table table =
      latexDocumentFactory.createTable(2,3);

    orderedList.addItem("item a");
    orderedList.addItem("item b");
    orderedList.addItem("item c");

    table.setColumnName(0, "colA");
    table.setColumnName(1, "colB");
    table.setColumnName(2, "colC");

    table.setValue(0, 0, "X");
    table.setValue(1, 2, "X");

    unorderedList.addItem("watermelon");
    unorderedList.addItem("papaya");
    unorderedList.addItem("banana");

    d.setTitle("Test Document");
    d.addElement(unorderedList);
    d.addElement(table);
    d.addElement(orderedList);
    d.save("test");
  }
}
