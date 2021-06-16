import java.util.LinkedHashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);
        LinkedHashMap<String, String> myHash = new LinkedHashMap<>();
        String urlPreMod = myScanner.next();
        String urlSubString = urlPreMod.substring(0, urlPreMod.indexOf("?") + 1);
        String[] url = urlPreMod.replace(urlSubString, "").split("&");

        for (String i : url) {
            String[] temp = i.split("=");
            if (temp.length == 1) {
                myHash.put(temp[0], "not found");
            } else {
                myHash.put(temp[0], temp[1]);
            }
        }
        if (urlPreMod.contains("pass")) {
            myHash.put("password", myHash.get("pass"));
        }

        for (String i : myHash.keySet()) {
            System.out.println(i + " : " + myHash.get(i));
        }

    }
}