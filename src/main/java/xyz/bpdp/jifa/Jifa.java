package xyz.bpdp.jifa;

import java.io.FileReader;
import java.io.BufferedReader;

import xyz.bpdp.jifa.JifaSemantics;
import xyz.bpdp.jifa.JifaParser;

import mouse.runtime.SourceFile;

public class Jifa {
  public static void main( String[] args) throws Exception 
  {

      JifaParser jparse = new JifaParser();
      SourceFile src = new SourceFile("examples/test0.ifa");
      //SourceFile src = new SourceFile("examples/test-ngawur.ifa");
      if (!src.created()) return;
      boolean ifaOk = jparse.parse(src);
      System.out.println(ifaOk? "Script executed successfully":"Script execution failure");

  }
}
