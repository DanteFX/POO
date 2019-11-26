import java.io.*;
public class TestNodeStreams {
  public static void main(String[] args) {
    try {
        String file = System.getProperty("user.home")+path+args[0];
    } catch(Exception e) {
    }
    try{
      FileReader input = new FileReader(args[0]);
      char[] buffer = new char[128];
      int charsRead;
      charsRead = input.read(buffer);
      while(charsRead != -1){
        System.out.println(charsRead);
        charsRead = input.read(buffer);
      }
    }finally {

    }
  }
}
