import java.io.FileInputStream;
import java.util.*;

public class LogsReader implements InputReader {
    private Scanner  reader;
    @Override
    public int readFile(Map<String, Integer> operationsFrequency) throws Exception {
        ArrayList<String> users = new ArrayList<>();
        int usersCounter = 0;
        FileInputStream inputStream = null;
        inputStream = new FileInputStream("trackFile2015-03-08.log");
        reader = new Scanner(inputStream, "UTF-8");

        //O(n^2)
        while (reader.hasNextLine()) {
            String[] logLine = reader.nextLine().split("/");
            String operation = logLine[2];
            String user = logLine[1] + operation;
            if(!users.contains(user))
            {
                int x = operationsFrequency.getOrDefault(operation , 0);
                operationsFrequency.put(operation ,  x + 1);
                users.add(user);
                usersCounter++;
            }
        }

        inputStream.close();
        reader.close();
        return usersCounter;
    }
}
