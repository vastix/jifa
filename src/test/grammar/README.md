How to test grammar
===================

**Notes**
```
This directory and all files inside has no relationshipt with Jifa. They exist just to test IfA grammar.
```

See ``ROOTPROJECT/env.sh``. After sourcing it (``source env.sh`` from ROOTPROJECT), inside this dir, use these commands:
* ``jtc``: generate and compile parser and semantic action
* ``jtt``: test parser. This will give ``>`` prompt where expression input can be given. If input suitable with grammar, it will continue process by giving another ``>`` (if JifaSemantic.java is edited for semantic actions, then it will give result as well). Enter to end.
* ``jtd``: delete all compilation results

