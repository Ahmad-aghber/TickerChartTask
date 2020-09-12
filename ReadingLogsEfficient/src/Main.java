import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        LogsReader logsReader = new LogsReader();
        Map<String , Integer> operationsFrequency = new LinkedHashMap<>();

        //O(n)  n = number of lines inside text file
        int usersCounter = logsReader.readFile(operationsFrequency);

        List<Map.Entry<String , Integer>> entries = new ArrayList<>(operationsFrequency.entrySet());
        //O(m * log(m))  m = number of operations
        Collections.sort(entries, new Comparator<Map.Entry<String , Integer>>() {
            public int compare(Map.Entry<String , Integer> left, Map.Entry<String , Integer> right) {
                return right.getValue().compareTo(left.getValue());
            }
        });

        //O(1)
        printMap(entries , usersCounter);

    }

    private static void printMap(List<Map.Entry<String , Integer>> entries , int usersCounter)
    {
        int counter = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            if(counter == 2)
                break;
            System.out.println("Operation : " + entry.getKey() + "\nCount of operation: " + entry.getValue() + "\n" +
                    "and it's percentage : " + (int)Math.round(entry.getValue() * 100.0 / usersCounter) +"%\n");
            counter++;
        }
    }
}
