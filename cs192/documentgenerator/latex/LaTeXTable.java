package cs192.documentgenerator.latex;

import cs192.documentgenerator.Table;

class LaTeXTable implements Table {
  private String[][] elements;
  private String[] columnNames;
  private int width;
  private int height;

  LaTeXTable(int height, int width) {
    this.width = width;
    this.height = height;
    this.elements = new String[height][width];
    this.columnNames = new String[width];
  }

  public void setColumnName(int column, String name) {
    this.columnNames[column] = name;
  }

  public void setValue(int row, int column, String value) {
    this.elements[row][column] = value;
  }

  public String get() {
    StringBuilder sb = new StringBuilder("\\begin{tabular}");
    sb.append("{|");

    for (int i = 0; i < columnNames.length; i++) {
      sb.append("c|");
    }

    sb.append("}" + "\\hline \n");
    sb.append(implodeRow(columnNames) + "\n");

    for (int i = 0; i < elements.length; i++) {
      sb.append(implodeRow(elements[i]) + "\n");
    }

    sb.append("\\end{tabular}\n");

    return sb.toString();
  }

  private String implodeRow(String[] row) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < row.length; i++) {
      sb.append(row[i] != null? row[i]: "");

      if (i == row.length - 1) {
        sb.append(" \\\\ \\hline");
      } else {
        sb.append(" & ");
      }
    }
    return sb.toString();
  }
}
