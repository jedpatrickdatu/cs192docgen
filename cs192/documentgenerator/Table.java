package cs192.documentgenerator;

public interface Table extends Element {
  void setColumnName(int column, String name);
  void setValue(int row, int column, String value);
}
