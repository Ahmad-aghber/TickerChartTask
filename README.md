# TickerChartTask
This Repository made for TickerChart 

# ANSWERS
1- You can find the solution for the question 1 inside ReadingLogs project.<br>
2- You can verify the result by doning the following:<br>
a- get all opeartions frequency and count them, if their sum equal userscounter then it's correct.<br>
b- if you sum all percentage of all operations and divide it by userscount it must be 100%.<br>

3- Yes you can get 3 most operations used by changing the if condition if(counter == 2) to if(counter == 3) at Main class to 3 ex:<br>

private static void printMap(List<Map.Entry<String , Integer>> entries , int usersCounter)<br>
{<br>
      int counter = 0;<br>
      for (Map.Entry<String, Integer> entry : entries) {<br>
            if(counter == 3)<br>
                break;<br>
            System.out.println("Operation : " + entry.getKey() + "\nCount of operation: " + entry.getValue() + "\n" +<br>
                    "and it's percentage : " + (int)Math.round(entry.getValue() * 100.0 / usersCounter) +"%\n");<br>
            counter++;<br>
      }<br>
}<br>

4- Yes i can by replacing the ArrayList users to Set and you can find the code inside ReadingLogsEfficient project.
