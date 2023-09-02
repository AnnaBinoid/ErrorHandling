package HWnumber03Exception.DateWorkers;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {

    public void writeDateInFile(String data, String path) {
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
