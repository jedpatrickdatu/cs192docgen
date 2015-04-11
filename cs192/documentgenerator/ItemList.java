package cs192.documentgenerator;

public interface ItemList extends Element {
  static final boolean ORDERED = true;
  static final boolean UNORDERED = false;

  void setOrdered(boolean ordered);
  boolean getOrdered();
  void addItem(String item);
}
