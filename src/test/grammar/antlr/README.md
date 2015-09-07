How to test grammar
===================

```
$ antlr4 Ifa.g4 
$ javac *.java
$ grun Ifa stat -gui
```
Last command will ask for input from stdin, just write the input and then ``Ctrl-D``, it will display AST using graphical swing. See also other options: -tree, -tokens, -ps filename.ps, etc. They are the same: will wait for ``Ctrl-D``.

This directory and all files inside has no relationshipt with Jifa. They exist just to test Ifa.g4 grammar.

Ifa.g4 should reside in src/main/antlr
