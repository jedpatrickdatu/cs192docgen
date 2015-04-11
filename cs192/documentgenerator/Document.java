package cs192.documentgenerator;

import cs192.documentgenerator.Element;

public interface Document {
  public void setTitle(String title);
  public void addElement(Element e);
  public void save(String filename) throws Exception;
}
