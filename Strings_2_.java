public class Strings_2_{
    public static void main(String[] args) {

    //Questions No. 1;

        String name = new String("Saurabh");
        String x = name.toLowerCase();
        System.out.println(x);

    //Questions No. 2;
        
        // String name = new String("saurabh bharti");
        // String x = name.replace(" ","_");
        // System.out.println(x); 
    
    //Questions No. 3;
    
        String letter = new String("Dear <|xyz|>, Thanks a lots");
        String letters = letter.replace("<|xyz|>","Saurabh");
        System.out.println(letters);

    //Questions No. 4;

        // String name = new String("Sa  ur   ab    h");
        // System.out.println(name.indexOf("  "));
        // System.out.println(name.indexOf("   "));
        // System.out.println(name.indexOf("        ")); //if we got -1, its means here is not 8 space is present; 

    //Questins No. 5;

        // String letter = new String("Dear Harry,\n\t This java course is nice.\n Thanks");
        // System.out.println(letter);    // (\n-nextline), (\t-space like tab bar);

    }
}