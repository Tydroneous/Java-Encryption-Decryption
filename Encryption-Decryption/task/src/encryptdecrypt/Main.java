package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> info = new HashMap<>();

        for (int i = 0; i <= args.length - 2; i += 2) {

            if (args[i].equals("-mode")) {
                info.put("mode", args[i + 1]);
            } else if (args[i].equals("-key")) {
                info.put("key", args[i + 1]);
            } else if (args[i].equals("-data")) {
                info.put("data", args[i + 1]);
            } else if (args[i].equals("-in")) {
                info.put("input", args[i + 1]);
            } else if (args[i].equals("-out")) {
                info.put("output", args[i + 1]);
            } else if (args[i].equals("-alg")) {
                info.put("algorithm", args[i + 1]);
            }

        }

        if (!info.containsKey("mode")) {
            info.put("mode", "enc");
        }

        if (!info.containsKey("key")) {
            info.put("key", "0");
        }

        if (!info.containsKey("algorithm")) {
            info.put("algorithm", "shift");
        }


        if (info.containsKey("data") && info.containsKey("input")) {
            info.remove("input");
        } else if (!info.containsKey("data") && !info.containsKey("input")) {
            System.out.println("Error");
        } else if (info.containsKey("data")) {
            Encryption newEncryption = new Encryption(info.get("mode"),
                    Integer.parseInt(info.get("key")),
                    info.get("data"),
                    info.get("algorithm"));

        } else if (info.containsKey("input")) {
            if (!info.containsKey("output")) {
                info.put("output", "standard");
            }
            EncryptionWithFile newEncryption = new EncryptionWithFile(info.get("mode"),
                    Integer.parseInt(info.get("key")),
                    info.get("input"), info.get("output"), info.get("algorithm"));


        }


    }
}

class Encryption {
    String mode;
    int key;
    String data;
    String alg;
    ArrayList<String> encryptedList = new ArrayList<>();


    public Encryption(String mode, int key, String data, String alg) {
        this.mode = mode;
        this.key = key;
        this.data = data;
        this.alg = alg;
        if (this.mode.equals("enc") || this.mode == null) {
            encrypt();
        } else {
            decrypt();
        }
    }

    void encrypt() {
        char[] dataArray = this.data.toCharArray();
        char temp = 'a';
        if (this.alg == "unicode") {
            for (int i = 0; i <= this.data.length() - 1; i++) {
                temp = (char) ((int) dataArray[i] + this.key);
                encryptedList.add(Character.toString(temp));
            }
        } else {
            for (int i = 0; i <= this.data.length() - 1; i++) {
                if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] + this.key <= 122)) {
                    temp = (char) ((int) dataArray[i] + this.key);
                } else if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] + this.key > 122)) {
                    temp = (char) ((int) dataArray[i] + this.key - 122 + 96);
                } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] + this.key <= 90)) {
                    temp = (char) ((int) dataArray[i] + this.key);
                } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] + this.key > 90)) {
                    temp = (char) ((int) dataArray[i] + this.key - 90 + 64);
                } else if (dataArray[i] == ' ') {
                    temp = ' ';
                }
                encryptedList.add(Character.toString(temp));
            }
        }
        standardOutput();

    }

    void decrypt() {
        char[] dataArray = this.data.toCharArray();
        for (int i = 0; i <= this.data.length() - 1; i++) {
            char temp = (char) ((int) dataArray[i] - this.key);
            encryptedList.add(Character.toString(temp));
        }
        standardOutput();

    }

    void standardOutput() {
        String formattedForUser = "";
        for (String s : this.encryptedList) {
            formattedForUser += s;
        }
        System.out.println(formattedForUser);
    }


}

class EncryptionWithFile {

    String input;
    String output;
    String mode;
    int key;
    String alg;
    ArrayList<String> encryptedList = new ArrayList<>();

    EncryptionWithFile(String mode, int key, String input, String output, String alg) {
        this.mode = mode;
        this.key = key;
        this.input = input;
        this.output = output;
        this.alg = alg;
        if (this.mode.equals("enc")) {
            encrypt();
        } else {
            decrypt();
        }

    }

    void encrypt() {
        File path = new File(this.input);
        String myTemp = "";
        char temp = 'a';

        try (Scanner myFile = new Scanner(path)) {
            while (myFile.hasNext()) {
                myTemp += myFile.nextLine();
            }
            char[] dataArray = myTemp.toCharArray();

            if (this.alg == "unicode") {
                for (int i = 0; i <= dataArray.length - 1; i++) {
                    temp = (char) ((int) dataArray[i] + this.key);
                    encryptedList.add(Character.toString(temp));
                }
            } else {
                for (int i = 0; i <= dataArray.length - 1; i++) {
                    if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] + this.key <= 122)) {
                        temp = (char) ((int) dataArray[i] + this.key);
                    } else if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] + this.key > 122)) {
                        temp = (char) ((int) dataArray[i] + this.key - 122 + 96);
                    } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] + this.key <= 90)) {
                        temp = (char) ((int) dataArray[i] + this.key);
                    } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] + this.key > 90)) {
                        temp = (char) ((int) dataArray[i] + this.key - 90 + 64);
                    } else if (dataArray[i] == ' ') {
                        temp = ' ';
                    }
                    encryptedList.add(Character.toString(temp));
                }
            }
            if (!this.output.equals("standard")) {
                writeToFile();
            } else {
                standardOut();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    void decrypt() {
        File path = new File(this.input);
        String myTemp = "";
        char temp = 'a';

        try (Scanner myFile = new Scanner(path)) {
            while (myFile.hasNext()) {
                myTemp += myFile.nextLine();
            }
            char[] dataArray = myTemp.toCharArray();
            System.out.println(Arrays.toString(dataArray));

            if (this.alg == "unicode") {
                for (int i = 0; i <= dataArray.length - 1; i++) {
                    temp = (char) ((int) dataArray[i] - this.key);
                    encryptedList.add(Character.toString(temp));
                }
            } else {
                for (int i = 0; i <= dataArray.length - 1; i++) {
                    if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] - this.key > 96)) {
                        temp = (char) ((int) dataArray[i] - this.key);
                    } else if (Character.isLowerCase(dataArray[i]) && ((int) dataArray[i] - this.key <= 96)) {
                        temp = (char) ((int) dataArray[i] - this.key + 122 - 96);
                    } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] - this.key > 64)) {
                        temp = (char) ((int) dataArray[i] - this.key);
                    } else if (Character.isUpperCase(dataArray[i]) && ((int) dataArray[i] - this.key <= 64)) {
                        temp = (char) ((int) dataArray[i] - this.key + 90 - 64);
                    } else if (dataArray[i] == ' ') {
                        temp = ' ';
                    }
                    encryptedList.add(Character.toString(temp));
                }
            }
            if (!this.output.equals("standard")) {
                writeToFile();
            } else {
                standardOut();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    void standardOut() {
        String formattedForUser = "";
        for (String s : this.encryptedList) {
            formattedForUser += s;
        }
        System.out.println(formattedForUser);

    }

    void writeToFile() throws IOException {
        String formattedForUser = "";
        File file = new File(this.output);
        for (String s : this.encryptedList) {
            formattedForUser += s;
        }
        try (FileWriter writer = new FileWriter(file, false)) {
            System.out.println(formattedForUser);
            writer.write(formattedForUser);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }


}

