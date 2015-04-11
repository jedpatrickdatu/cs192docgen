package cs192.documentgenerator.latex;

import java.util.List;
import java.util.ArrayList;

import cs192.documentgenerator.ItemList;

class LaTeXItemList implements ItemList {
  private boolean ordered;
  private List<String> items;

  public LaTeXItemList(boolean ordered) {
    this.ordered = ordered;
    this.items = new ArrayList<String>();
  }

  public LaTeXItemList() {
    this(false);
  }

  public void setOrdered(boolean ordered) {
    this.ordered = ordered;
  }

  public boolean getOrdered() {
    return this.ordered;
  }

  public void addItem(String item) {
    this.items.add(item);
  }

  public String get() {
    StringBuilder sb = new StringBuilder();
    for (String item:items) {
      sb.append("\\item " + item + "\n");
    }

    String listType = ordered? "enumerate": "itemize";
    sb.insert(0, "\\begin{" + listType + "}\n");
    sb.append("\\end{" + listType + "}\n");
    return sb.toString();
  }
}
