## CS 192 ME for Creational Design Patterns

## Document Generator

Attached here is a Java program that generates documents. It can currently generate docs in LaTeX format, and your task is to add to the program so that it can create docs in HTML as well, and then create a sample HTML doc using this program.

The program employs the Abstract Factory design pattern. There are two subfolders inside: application1 and documentgenerator. Let's explore each folder and what you'll do with each:

## I. documentgenerator

documentgenerator contains interface classes for document creation:

* Document
* DocumentFactory
* Element
* ItemList
* Table

There is another folder in there named “latex” that contains concrete classes which extend from the above classes:

* LatexDocument
* LatexDocumentFactory
* LatexItemList
* LatexTable

The concrete classes in the latex folder are used for creating LaTeX docs. You are to create a similar folder named “html” in documentgenerator and you will fill this folder with concrete classes that extend the interfaces in documentgenerator, this time for creating HTML docs. The classes should have the same naming scheme as in the Latex package, just replace “Latex” with “HTML.” So for the html folder you'll be writing the classes:

* HTMLDocument
* HTMLDocumentFactory
* HTMLItemList
* HTMLTable

## II. application1

Once the html package in documentgenerator is complete, you move on to the other main subfolder, application1. It contains a main class “application.java” which makes use of the classes in documentgenerator to create a sample LaTeX file named “test.” You are to create another folder, application2, which contains a main class named “application.java” that uses the classes in documentgenerator to create a sample HTML doc. This HTML doc should show the same thing as the LaTeX sample file.

Since the program is in Abstract Factory style, you'll just be extending the classes in documentgenerator to create the classes needed in your “html” folder/package. Also notice that the LaTeXDocumentFactory class is the only class in the cs192.documentgenerator.latex package that has public access. This is to ensure the separation of the main program from the concrete classes. 

Where do the Singleton and Prototype Design Patterns come in? You must follow these guidelines:
1. HTMLDocumentFactory must be in singleton.
2. The creation of HTMLDocuments must follow the prototype pattern.


## Deliverables:

1. The entire cs192 folder / all your source code in a zip folder named “<Surname>CS192ME.zip”

2. The html doc that your application2 main class outputted. It should be named “test.html”

Submit these files along with your SQL Builder ME to the email azyriel14@gmail.com with the subject "CS 192 ME - <surname>" 


## Notes:

1. Make sure to set your java classpath to the directory where the attached cs192 folder is residing.

2. Compile all the source code in the attached folder to generate the classes needed by the main class "application."

3. If you don't have latex yet, get it from here: http://latex-project.org/ftp.html

4. Feel free to ask questions on the Facebook post where this Github page is linked to.
