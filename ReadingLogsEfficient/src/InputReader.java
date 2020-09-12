import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public interface InputReader {
    int readFile(Map<String,Integer> operationsFrequency) throws  Exception;
}
