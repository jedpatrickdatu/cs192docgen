package cs192.documentgenerator;

import cs192.documentgenerator.Document;

public interface DocumentFactory {
  Document createDocument();
  ItemList createItemList(boolean ordered);
  Table createTable(int height, int width);
}
