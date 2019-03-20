import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


// code below came from stackoverflow at the following link:
// https://stackoverflow.com/questions/30073980/java-writing-strings-to-a-csv-file
// code has been adapted to my needs
public class ImportExport {
  public static void main(String[] args) {

    try (PrintWriter writer = new PrintWriter(new File("/Users/14367/Desktop/c_code/test.csv"))) {

      StringBuilder sb = new StringBuilder();
      sb.append("id,"); //this value is required if you want to be able to open it in excel
      sb.append(',');
      sb.append("Name");
      sb.append('\n');

      sb.append("1");
      sb.append(',');
      sb.append("Prashant Ghimire");
      sb.append('\n');

      writer.write(sb.toString());

      System.out.println("done!");

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }
}

