# Makefile 
# Akhil Boddu

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

#modified file JUNIT variable for compiling but not using JUNIT
JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./src/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Image.class Profile.class Database.class TinderApp.class

default: $(CLASSES)
	
Person.class: Person.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Image.class: Image.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Profile.class: Profile.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Database.class: Database.java 
	javac -d $(BINDIR) -cp $(JUNIT)
TinderApp.class: TinderApp.java 
	javac -d $(BINDIR) -cp $(JUNIT)

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
