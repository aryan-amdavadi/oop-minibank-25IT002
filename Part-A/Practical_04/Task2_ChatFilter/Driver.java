public class Driver {
    public static void main(String[] args) {
        String[] logs = {
            "10:05 alice Hello there",
            "10:10 bob Good Morning",
            "WrongLine",
            "10:20 john Hello Harsh",
            "10:30 david Bye"
        };
        String keyword = "Hello";
        System.out.println("Enter Keyword: " + keyword);
        String result = ChatFilter.filter(logs, keyword);
        System.out.println(result);
    }
}
