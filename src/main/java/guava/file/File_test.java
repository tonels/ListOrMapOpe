package guava.file;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class File_test {

    // todo Guava IO读写操作
    @Test
    public void t1(){
        String fileName = "d://temp//a.txt";
        String  contents = "ssssssdsd test esdf eesv";
        demoFileWrite(fileName,contents);
    }

    @Test
    public void t2() throws IOException {
        String testFilePath = "d://temp//a.txt";
        File testFile = new File(testFilePath);
        List<String> lines = Files.readLines(testFile, Charsets.UTF_8);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public void demoFileWrite(final String fileName, final String contents)
    {
        final File newFile = new File(fileName);
        try
        {
            Files.write(contents.getBytes(), newFile);
        }
        catch (IOException fileIoEx)
        {
            System.err.println(  "ERROR trying to write to file '" + fileName + "' - "
                    + fileIoEx.toString());
        }
    }



}
