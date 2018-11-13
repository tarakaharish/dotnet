//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class OtherClass
{
  private String message;
  private boolean answer = false;
  public OtherClass(String input)
  {
    message = "Why, " + input + " Isn't this something?";
  }
  public String toString()
  {
    return message;
  }
}