package test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestRunnerWithRuntimeDep {

  public static void main(String[] args) throws Exception {

    if (args.length != 1) {
      throw new Exception("should get args as path to a file");
    }

    // make sure that the test class can be loaded

    List<String> lines = Files.readAllLines(Paths.get(args[0]));

    Class.forName(lines.get(0));

    System.out.println("yay");

    // This class should be in runtime dep but not build dep
    Class klass = Class.forName("org.testng.reporters.TestHTMLReporter");
  }
}
