package Day2;

public class CricketScore {
    public static void main(String[] args) {

        int a=1;
        int b=8;
        int c=8;
        int d=7;
        int e=8;
        RunScore(a,b,c,d,e);
    }
        public static void RunScore(int a,int b,int c,int d,int e){
            int sum=a+(2*b)+(c*3)+(d*4)+(e*6);
        System.out.println("Total Score of that batsman is : "+sum);
        }
}
