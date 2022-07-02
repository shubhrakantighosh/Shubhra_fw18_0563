public class VowelAndConsonant {
     void CheckVowelOrConsonant(char Character){
        boolean flag=true;
        char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         for (char alphabet : alphabets) {
             if (alphabet == Character) {
                 flag = false;
                 if (Character == 'a' || Character == 'e' || Character == 'i' || Character == 'o' || Character == 'u') {
                     System.out.println(Character + " : Vowel");
                 } else {
                     System.out.println(Character + " : Consonant");
                 }
             }
         }
        if (flag){
            System.out.println("Invalid Character");
        }
    }
    public static void main(String[] args) {
        VowelAndConsonant alphabet=new VowelAndConsonant();
        alphabet.CheckVowelOrConsonant('a');
        alphabet.CheckVowelOrConsonant('b');
        alphabet.CheckVowelOrConsonant('Y');
    }
}
