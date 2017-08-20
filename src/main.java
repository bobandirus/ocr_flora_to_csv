/**
 * Created by sb823249 on 30/03/2015.
 */

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    static String[] bits = new String[0];
    static String[] tableHeadings = new String[0];
    static String fileName = "";
    static String lineToAdd = "";
    static boolean familyCount = true;
    static boolean genusCount = true;
    static boolean speciesCount = true;
    static String[] building = new String[0];
    static File mainText = new File("");
    static int numberOfBits = 0;
    static int trigger = 0;
    static String lineEr = "";
    static String[] moreStuff = new String[0];
    static String toUse = "";
    static String[] things = new String[0];
    //static List<String> someBits = new List<String>();
    //static int z = 0;

    /*public static void main(String[] args) throws IOException{
        //for (int z = 0; z < 9; z++){
            //initialSplit();
        //}
        int x = 0;
        char newLine = \r;
        BufferedReader reader = new BufferedReader(new FileReader("" + System.getProperty("user.dir") + "\\stace text mk1.txt"));
        String bigLine = null;
        while ((bigLine = reader.readLine()) != null){
            for (int i = 0; i < bigLine.length(); i++){

            }
        }

        //String alltext = Files.read("" + System.getProperty("user.dir") + "\\stace text mk1.txt");

        //
        //this for is in the wrong place
        //
        for (int z = 0; z < 2; z++) {
            Scanner scanner = new Scanner(new File("" + System.getProperty("user.dir") + "\\stace text mk1.txt"));
            scanner.useDelimiter("\r");
            ArrayList<String> someBits = new ArrayList<String>();
            while (scanner.hasNext()) {
                String line = scanner.next();
                someBits.add(line);
            }
            building = someBits.toArray(building);
            readDescription();
        }
        writeFile();
    }*/
    public static void main(String[] args) throws IOException{
        //fileName = "" + System.getProperty("user.dir") + "\\test.txt";
        Scanner scanner = new Scanner(new File("" + System.getProperty("user.dir") + "\\test.txt"));
        //Scanner scanner = new Scanner(fileName.);

        scanner.useDelimiter("\r\n||\n||\r");
        scanner.useDelimiter(System.lineSeparator());
        ArrayList<String> someBits = new ArrayList<String>();
        //numberOfBits = someBits.size();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            someBits.add(line);
            //System.out.print(line + "\n");
        }
        building = someBits.toArray(building);
        lineEr = Arrays.toString(building);
        //System.out.print(Arrays.toString(building) + "\n");
        numberOfBits = building.length;
        gogogo();
    }
    /*public static void main(String[] args) throws IOException{
       char newLine = System.lineSeparator(new File("" + System.getProperty("user.dir") + "\\test.txt"));
    }*/

    //
    //
    //
    //
    //THIS WAS ALMOST RIGHT - but it cycled through everything, instead of each section
    //
    //
    //



    /*public static void gogogo() throws IOException{
        for (int t = 0; t < numberOfBits; t++){
            readDescription();
        }
        writeFile();
    }*/

    public static void gogogo() throws IOException{
        //String[][] arraySet = new String[0][0];
        //for (int t = 0; t < numberOfBits; t++){
        //arraySet[t][] = building.s
        //}
        moreStuff = lineEr.split("[0-9]\\. [A-Z]");
        for (int b = 0; b < moreStuff.length; b++) {
            //toUse = moreStuff[b];
            readDescription();
        }
        writeFile();
    }

    /*public static void initialSplit() throws IOException{
        fileName = "" + System.getProperty("user.dir") + "\\stace text mk1.txt";
        String words = fileName;
        words = words.replace("\r", "");
        //List<String> = words.split();
        //List<String> staceText = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        //List<String> staceText = Files.readAllBytes(Paths.get(fileName), StandardCharsets.UTF_8);
        //String[] splittingPt1 = new String[staceText.size()];
        //splittingPt1 = staceText.toArray(splittingPt1);
        //String[] splittingPt1 = new String[];
        //splittingPt1 =
        //splittingPt1 = splittingPt1.
        //for (int c = 0; c < splittingPt1.length; c++){
        //    building = staceText.get(c).split("[0-9]\\. [A-Z]");
        //}
        building = words.split("[0-9]\\. [A-Z]");
        readDescription();
    }*/

    /*public static void initialSplit() throws IOException{
        mainText = new File("" + System.getProperty("user.dir") + "\\stace text mk1.txt");
        String words = mainText.reatoString();
        building = words.split("[0-9]\\. [A-Z]");
    }*/

    /*public static void initialSplit() throws IOException{
        Scanner scanner = new Scanner(new File("" + System.getProperty("user.dir") + "\\stace text mk1.txt"));
        scanner.useDelimiter("\r");
        ArrayList<String> someBits = new ArrayList<String>();
        while (scanner.hasNext()){
            String line = scanner.next();
            someBits.add(line);
        }
        building = someBits.toArray(building);
        readDescription();
    }*/

    /*public static void initialSplit() throws IOException{
        String text = readFileAsS
    }*/

    public static void readDescription() throws IOException{
        //trigger++;
        //ArrayList<String> bitsAdder = new ArrayList<String>();
        List<String> someBits = Arrays.asList(moreStuff);
        //things = toUse.split()
        for (int b = 0; b < someBits.size(); b++) {
            //Stri
            String[] preBitsOne = someBits.get(b).split(";");
            ArrayList<String> bitsAdder = new ArrayList<String>();
            for (int r = 0; r < preBitsOne.length; r++) {
                Pattern familyName = Pattern.compile("\\. \\.*ACEAE");
                Pattern genusName = Pattern.compile("\\. [A-Z][A-Z][A-Z][A-Z][A-Z]");
                Pattern speciesName = Pattern.compile("\\. [A-Z]\\. [a-z]");
                Matcher familyPattern = familyName.matcher(preBitsOne[b]);
                Matcher genusPattern = genusName.matcher(preBitsOne[b]);
                Matcher speciesPattern = speciesName.matcher(preBitsOne[b]);
                if (familyPattern.find()) {
                    bitsAdder.add(preBitsOne[b]);
                } else if (genusPattern.find()) {
                    bitsAdder.add(preBitsOne[b]);
                } else if (speciesPattern.find()) {
                    bitsAdder.add(preBitsOne[b]);
                } else {
                    String[] addToAdder = preBitsOne[b].split("\\.");
                    for (int q = 0; q < addToAdder.length; q++) {
                        String addingToAdder = addToAdder[r];
                        bitsAdder.add(addingToAdder);
                    }
                }
            }
            bits = bitsAdder.toArray(bits);
            for (int q = 0; q < bits.length; q++) {
                //System.out.print(bits[q] + "\n");
            }
        }
        readHeadings();
    }

    public static void readHeadings() throws IOException {
        List<String> tableReader = Files.readAllLines(Paths.get("" + System.getProperty("user.dir") + "\\database.csv"), StandardCharsets.UTF_8);
        for (int c = 0; c < tableReader.size(); c++) {
            tableHeadings = tableReader.get(c).split(",");
        }
        compareEntries();
    }
    public static void compareEntries() throws IOException {
        Boolean speciesFirst = true;
        Boolean genusFirst = true;
        Boolean familyFirst = true;
        String adder = "";
        ArrayList<String> buildingLine = new ArrayList<String>();
        String[] line = new String[tableHeadings.length];
        for (int c = 0; c < tableHeadings.length; c++) {
            boolean familyHeading = false;
            boolean genusHeading = false;
            boolean speciesHeading = false;
            String family = "Family";
            String genus = "Genus";
            String species = "Name";
            if (tableHeadings[c].equals(family)) {
                familyHeading = true;
            }
            if (tableHeadings[c].equals(genus)) {
                genusHeading = true;
            }
            if (tableHeadings[c].equals(species)) {
                speciesHeading = true;
            }
            bitsChecker:
            for (int b = 0; b < bits.length; b++) {
                bits[b] = bits[b].replace(",", "");
                Boolean familyFound = false;
                Boolean genusFound = false;
                Boolean speciesFound = false;
                String[] bitsOne = bits[b].split(" - ");
                nameFinder:
                for (int n = 0; n < bitsOne.length; n++) {
                    String part = bitsOne[n];
                    Pattern genuSs = Pattern.compile("[A-Z][A-Z][A-Z]");
                    Matcher genusMatcher = genuSs.matcher(part);
                    Pattern specieSs = Pattern.compile("\\. [A-Z]\\. [a-z]");
                    Matcher speciesMatcher = specieSs.matcher(part);
                    if (part.endsWith("ACEAE")) {
                        familyFound = true;
                        break nameFinder;
                    } else if (genusMatcher.find()) {
                        genusFound = true;
                        break nameFinder;
                    } else if (speciesMatcher.find()) {
                        speciesFound = true;
                        break nameFinder;
                    }
                }
                if ((familyFound) && familyHeading) {
                    line[c] = bits[b];
                    speciesFirst = false;
                    break bitsChecker;
                } else if (genusFound && genusHeading) {
                    line[c] = bits[b];
                    genusFirst = false;
                    genusFound = false;
                    break bitsChecker;
                } else if (speciesFound && speciesHeading) {
                    line[c] = bits[b];
                    speciesFirst = false;
                    speciesFound = false;
                    break bitsChecker;
                } else if (bits[b].contains(" ") && tableHeadings[c].contains(" ")) {
                    boolean added = false;
                    bits[b] = bits[b].toLowerCase();
                    tableHeadings[c] = tableHeadings[c].toLowerCase();
                    bits[b] = bits[b].replace("- ", " ");
                    bits[b] = bits[b].replace(",", "");
                    String[] bitsBits = bits[b].split(" ");
                    String[] headingsBits = tableHeadings[c].split(" ");
                    if (Arrays.asList(bitsBits).containsAll(Arrays.asList(headingsBits))) {
                        line[c] = "yes";
                        added = true;
                        break bitsChecker;
                    } else {
                        line[c] = "no";
                        System.out.print("Column missing for " + bits[b] + "\n");
                    }
                    if (added = false) {
                        if (line[c] != "yes") {
                            line[c] = "no";
                        }
                    }
                } else if (bits[b].contains(tableHeadings[c])) {
                    line[c] = "yes";
                    break bitsChecker;
                } else {
                    if (line[c] == null) {
                        //System.out.print("collumn missing for " + bits[b] + "\n");
                        line[c] = "no";
                    }
                }
            }
        }
        lineAdder(line);
    }

    public static void lineAdder(String[] line) throws IOException {
        String data = Arrays.toString(line);
        String dataA = data.replace("[", "");
        String dataB = dataA.replace("]", "");
        lineToAdd = lineToAdd + dataB + "\n";
        bits = new String[0];
        //if (trigger == numberOfBits){
        //    writeFile();
        //}
    }

    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("" + System.getProperty("user.dir") + "\\output.csv");
        String headders = Arrays.toString(tableHeadings);
        String headint = headders.replace("[", "");
        String headetete = headint.replace(", ", ",");
        String headed = headetete.replace("]", "");
        writer.append(headed + "\n");
        writer.append(lineToAdd + "\n");
        writer.close();
    }
}