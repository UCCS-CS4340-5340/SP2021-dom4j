# CS4340 Student Project - dom4j

## Setup
The following instructions were created with Eclipse 2020-12 on Windows 10  
OpenJDK Runtime Environment 15.0.2+7-27  
OpenJDK 15.0.2 2021-01-19  

#### TestNG
From Dr. Walcott:
- Select the Eclipse “Help” menu and scroll to the ‘Eclipse Marketplace...” 
- In Marketplace use search function to find TestNG 
- Select and download TestNG 

#### Importing Project and Running Tests
1. Extract the 62_dom4j folder from the zip and place it in a location
2. Create a workspace folder *this should not be in the same place as dom4j_62*
3. Open the workspace with Eclipse
4. Select "Import project" from the Package Explorer
5. Choose General > Existing Projects into Workspace
6. Click "Browse" next to "Select root directory"
7. Choose the 62_dom4j folder you just extracted
8. Check "Copy projects into workspace"
9. Press "Finish"
10. Right click 62_dom4j under Package Explorer > Properties
11. Select "Java Build Path" tab
12. Select "Source" tab
13. Select "Add Folder"
14. src > main > java should already be selected (if not, select it.
15. Check src > test > java and src > test > xml (only java and xml, not checkboxes next to src and test).
16. Click OK
17. Click "Apply"
18. Click "Libraries" tab
19. Click "Add External JARs"
20. Select your workspace folder > 62_dom4j > test-lib > junit-3.8.1.jar
21. Click "Apply"
22. Select testng-5.11-jdk15.jar and then click "Remove"
23. Click "Apply"
24. Click "Add Library"
25. Select "TestNG"
26. Select "Next" then "Finish"
27. Click "Apply"
28. Click "Apply and Close"
29. Open src/test/java > org.dom4j.util > PerThreadSingletonTest.java
30. Change line 25 to @Test
31. Open src/test/java > org.dom4j > ThreadingTest.java
32. Change line 25 to @Test
33. Right click 62_dom4j in Package Explorer > Run As > TestNG Test
34. You should see the test results in the console as well as in the "Results of running class XPath,....." tab next to it

#### Java Build Path (Libraries)
![image](https://user-images.githubusercontent.com/78122778/109726789-87cf5e80-7b70-11eb-9532-dd7efcdd4b71.png)

#### Java Build Path (Source)
![image](https://user-images.githubusercontent.com/78122778/109726868-a170a600-7b70-11eb-958b-b1ce54239ef1.png)

#### Package Explorer
![image](https://user-images.githubusercontent.com/78122778/109727001-daa91600-7b70-11eb-98a7-f9f2dee610f5.png)

## Artifacts
- Downloads and instructions for use at https://dom4j.github.io/. This site gives plenty of examples of how to use dom4j's various methods to work with XML documents in Java.
- Wiki at https://github.com/dom4j/dom4j/wiki. This site provides news, instructions, FAQs, and information about the purpose of the project.
- Repository at https://github.com/dom4j/dom4j. The code for the current dom4j version is hosted here.  
  
The purpose of dom4j is to allow Java developers to programmatically work with XML doocuments. This includes reading, writing, and creating them. It is an API that can easily be imported into a Java project and used via calling its various methods. There are other frameworks for working with XML that have pros and cons, but dom4j is meant to work well in Java for all cases.

## Initial Analysis
#### CodeMR
- Classes tend to be of acceptable length
- It appears that roughly 40% of classes have an unreasonably large number of methods
- In terms of compexity and cohesion, the most problematic packages are org.dom4j.dom, org.dom4j.io, org.dom4j.tree, and org.dom4j.util. The former three are also the largest packages
- The aforementioned problematic packages seem to be very important and appear to contain some of the core implementation code for the dom4j API
- The quick start guide in the wiki artifact mostly uses the org.dom4j package. This package imports many classes from org.dom4j.util and dom4j.tree, which coincides with the importance of those packages  
  
![codemr](https://user-images.githubusercontent.com/78122778/109860076-f1a44280-7c1a-11eb-9c0e-ccca7f6a7b48.PNG)
  
#### EclEmma
- Total coverage of dom4j code is at 44.1%
- org.dom4j.io, org.dom4j.tree, and org.dom4j.dom have the highest coverage scores, which supports the conclusion that these packages were the most important ones to the developers
- org.dom4j.jaxb has 0% coverage and is also the only package in the project with compilation errors (As of 3/19/21, compilation errors are fixed - needed additional jar)
- Some individual files have 0% coverage. Many of these files appear to be unused  
  
![image](https://user-images.githubusercontent.com/78122778/109874183-01785280-7c2c-11eb-9a3d-93d90f2b002b.png)
  
## Test Plan
#### Reading an XML document from URL
- Occurs if the user wants to retrieve an XMl file from a URL instead of from the local filesystem
- Test calling SAXReader.read on a URL
- This scenario seems important because it is the first example in the wiki's Quick Start Guide
- SAXReader.read(URL url) is not covered by the existing manual tests
- For test input, an XML file will be saved in the project directory. The relative URL to this file will be provided to the method as a Java URL object
- If successful, a Document object will be created based on the file and returned to the caller

#### Retrieving the DOM document class
- Occurs if the user wants to get the document class which was passed into a DOMWriter's constructor
- Test calling getDocumentClass on a Document
- This scenario seems important because it allows for polymorphic behavior - a DOMWriter could be passed into a method and used for one of the several document types. In cases like this, the caller may want to see what the writer is supposed to be passed.
- For test input, a DOMWriter can be passed org.dom4j.dom.DOMDocument.class (see line 26 of DOMWriterTest.java)
- If successful, "org.dom4j.dom.DOMDocument.class" should be returned when getDocumentClass is called on the writer

## Notes/Help
When Pitclipse was installed, the TestNG shortcut disappeared from the right click menu for the project. To run all 641 TestNG tests, select both the src/test/xml and src/test/java folders in the Package Explorer. Right click > Run As > TestNG Test
  
Once this is done, EclEmma will run the most recently used configuration for TestNG when the coverage shortcut is clicked  
  
Document is just an interface. DOMDocument (org.dom4j.dom) implements it. Other classes probably implement it as well
