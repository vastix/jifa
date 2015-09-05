How to test grammar
===================

```
$ antlr4 Ifa.g4 
$ javac *.java
$ grun Ifa stat -gui
```
Last command will ask for input from stdin, just write the input and then ``Ctrl-D``, it will display AST using graphical swing. See also other options: -tree, -tokens, -ps filename.ps, etc. They are the same: will wait for ``Ctrl-D``.

If you use Linux, I provide ``env.sh`` to define `t` (to compile and run above commands) and ``d`` to delete all compiled results. Just ``source env.sh`` and execute ``t`` to test and ``d`` to delete files (only compiled results, so this should be safe).

This directory and all files inside has no relationshipt with Jifa. They exist just to test Ifa.g4 grammar.

