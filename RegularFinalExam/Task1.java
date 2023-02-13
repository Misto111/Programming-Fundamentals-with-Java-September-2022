import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String text= cs.next();
        String command = "";
        while (!command.equalsIgnoreCase("Abracadabra")){
            command = cs.next();
            text = makeSpell(command, text);
        }
    }

    private static String makeSpell(String command, String text) {
        String [] c = command.split(" ");
        switch (c[0]){
            case "Abjuration" : return abjuration(text);
            case "Necromancy" : return necromancy(text);
            case "Illusion" : return illusion(text, c[1], c[2]);
            case "Divination" : return divination(text, c[1],c[2]);
            case "Alteration" : return alteration(text, c[1]);
            default: return defalt(text);
        }
    }

    private static String defalt(String text) {
        System.out.println("The spell did not work!");
        return text;
    }

    private static String abjuration(String text){
        var t1 = text.toUpperCase();
        System.out.println(t1);
        return t1;

    }

    private static String necromancy (String text){
        var t1 = text.toLowerCase();
        System.out.println(t1);
        return t1;
    }

    private static String illusion (String text, String number, String letter1){
        int index = -2;
        char letter = ' ';
        boolean istrue = false;
        if(letter1.length()== 1){
            istrue = true;
            letter = letter1.charAt(0);
        }
        if (!number.isBlank() &&  parsIn(number)!=-1){
            index = parsIn(number);
        }
        if(index>= 0 && text.length()>index && istrue ){
            System.out.println("Done!");
            StringBuilder newText = new StringBuilder(text);
            newText.setCharAt(index, letter);
            return newText.toString();
        }else {
            System.out.println("The spell was too weak.");
            return text;
        }
    }

    private static String divination(String text, String firstSub, String secondSub){
        if(firstSub!= null || secondSub != null){
            return text;
        }
        var t1 = text.replace(firstSub, secondSub);
        if(!t1.equalsIgnoreCase(text)){
            System.out.println(t1);
        }
        return t1;
    }

    private static String alteration (String text, String substring){
        if(substring.isBlank()){
            return text;
        }
        String t1 = text.replace(substring, "");
        if(!t1.equalsIgnoreCase(text)){
            System.out.println(t1);
        }
        return t1;
    }

    private static int parsIn(String x){
        try {
            return Integer.parseInt(x);
        }catch (Exception e){
            return -1;
        }
    }

}