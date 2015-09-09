package name.bpdp.vastix.jifa;

import java.io.FileReader;
import java.io.BufferedReader;

import name.bpdp.vastix.jifa.JifaSemantics;
import name.bpdp.vastix.jifa.JifaParser;

import mouse.runtime.SourceFile;

public class Jifa {
  public static void main( String[] args) throws Exception 
  {

      JifaParser jparse = new JifaParser();
      SourceFile src = new SourceFile("examples/test0.ifa");
      if (!src.created()) return;
      boolean ifaOk = jparse.parse(src);
      System.out.println(ifaOk? "Script executed successfully":"Script execution failure");

  }
}
