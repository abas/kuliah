import java.io.*;
import javax.swing.*;

class JChoosers{
  public static void main(String[] args) {
    JChooser chooser;
    File file, directory;
    int status;
    chooser = new JChooser();
    status = chooser.showOpenDialog(null);

    if (status == JChooser.APPROVE_OPTION){
      file = chooser.getSelectedFile();
      directory = chooser.getCurrentDirectory();
      System.out.println("Directory: " + directory.getName());
      System.out.println("File selected to open: " + file.getName());
      System.out.println("Full path name: " + file.getAbsolutePath());
    }
    else {
      System.out.println("Open File dialog canceled");
    }
    System.out.println("\n\n");
    status = chooser.showSaveDialog(null);
    if (status == JFileChooser.APPROVE_OPTION){
      file = chooser.getSelectedFile();
      directory = chooser.getCurrentDirectory();
      System.out.println("Directory: " + directory.getName());
      System.out.println("File selected to open: " + file.getName());
      System.out.println("Full path name: " + file.getAbsolutePath());
    }
    else {
      System.out.println("Open File dialog canceled");
    }
  }
}
