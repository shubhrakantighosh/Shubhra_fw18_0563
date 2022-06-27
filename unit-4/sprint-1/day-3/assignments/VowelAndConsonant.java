public class VowelAndConsonant {
     void CheckVowelOrConsonant(char Character){
        boolean flag=true;
        char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<=alphabets.length;i++){
            if (alphabets[i]==Character){
                flag=false;
                if (Character=='a'||Character=='e'||Character=='i'||Character=='o'||Character=='u'){
                    System.out.println(Character+" : Vowel");
                } else {
                    System.out.println(Character+" : Consonant");
                }
            }
        }
        if (flag){
            System.out.println("Invalid Character");
        }
    }
    public static void main(String[] args) {
        VowelAndConsonant alphabet1=new VowelAndConsonant();
        VowelAndConsonant alphabet2=new VowelAndConsonant();
        VowelAndConsonant alphabet3=new VowelAndConsonant();
        alphabet1.CheckVowelOrConsonant('a');
        alphabet2.CheckVowelOrConsonant('b');
        alphabet3.CheckVowelOrConsonant('Y');
    }
}
