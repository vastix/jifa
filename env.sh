export CLASSPATH=$CLASSPATH:`pwd`/lib/Mouse-1.7.jar:`pwd`/src/test/grammar/libs/okio-1.6.0.jar:`pwd`/src/test/grammar/libs/okhttp-2.5.0.jar
alias jf="cd ~/kerjaan/git-repos/vastix/jifa"
alias jt="cd ~/kerjaan/git-repos/vastix/jifa/src/test/grammar"
# this used to be antlr shortcuts
#alias t="antlr4 Ifa.g4; javac *.java; grun Ifa stat -gui"
#alias d="rm *.java; rm *.tokens; rm *.class"
alias jtc="java mouse.Generate -G JifaGrammar.peg -P JifaParser -S JifaSemantics -s; javac *.java"
alias jtt="java mouse.TryParser -P JifaParser"
alias jtd="rm *.class; rm *.java"
