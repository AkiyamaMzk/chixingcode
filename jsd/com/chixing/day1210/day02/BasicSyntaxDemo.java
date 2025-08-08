package chixing.day1210.day02;



public class BasicSyntaxDemo {
    public static void main(String[] args) {
        String str="Read a single character";
        char[] charArr=str.toCharArray();
        byte[] byteArr=str.getBytes();

        for(char c:charArr){
            System.out.print(c);
        }
        System.out.println();

        for (byte b:byteArr){
            System.out.print(b+" ");
        }
        System.out.println();

        boolean b1=true;
        boolean b2=!b1;
        System.out.printf("%s\n",b1?"true":"flase");
        System.out.println(b2?"ture":"false");
        }
    }


