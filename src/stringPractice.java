public class stringPractice {
//    static String reverse(String str){
//        int i = 0;
//        int j = str.length()-1;
//        String s = str;
//        while (i <= j){
//            char x = s.charAt(i);
//            char y = s.charAt(j);
//           s =  s.substring(0,i)+ y + s.substring(i+1,s.length());
//           s = s.substring(0,j) + x + s.substring(j+1,s.length());
//           i++;
//           j--;
//        }
//        return s;
//    }
    public static void main(String[] args) {
//String str = "Hello World";
////        System.out.println(str.charAt(5));
////        System.out.println(str.indexOf('l'));
//        String s1 = "ccr";
//        String s2 = "cbr";
////        System.out.println(s1.compareTo(s2));
//        System.out.println(str.contains("Hell"));
//        System.out.println(str.startsWith("llo"));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        str = str.toLowerCase();
//        System.out.println(str);
//        System.out.println(str.concat(" "+s1)+" "+s2);
//        System.out.println(str+" "+s1+" "+s2);
//        System.out.println(s1);
//        s1 = str.concat(s2);
//        System.out.println(s1);
//            System.out.println(str.substring(3));
//            System.out.println(str.substring(2,4));
//
////            print the all subString of given String s
//
//            String s = "abcd";
//            for (int i = 0; i < s.length(); i++) {
//                    for (int j = i+1; j < s.length()+1; j++) {
//                            System.out.print(s.substring(i,j)+" ");
//                    }
//                    System.out.println();
//            }
//            String a = "Hello";
//            String b = "Hello";
//            if (a == b){
//                    System.out.println("Yes they are equal");
//            }
//            String c = new String("Hello");
//            b = "mello";
//            if (a == c){
//                    System.out.println("Yes they are equal");
//            }
//            else {
//                    System.out.println("they are not equal");
//            }
//        StringBuilder str = new StringBuilder("Hello World");
//        str += "Good";  ye line wrong hai kyuki we cant add StringBuilder with String
//        str.append(" Good");
//        System.out.println(str);
//        str.setCharAt(0,'D');
//        System.out.println(str);
//        System.out.println(str.insert(2,'y'));
//        System.out.println(str);
//        str.delete(2,2);
//        System.out.println(str);
//        StringBuilder str = new StringBuilder("asdef");
//        int i = 0,j = str.length()-1;
//        while (i<=j){
//            char x = str.charAt(i);
//            char y = str.charAt(j);
//            str.setCharAt(i,y);
//            str.setCharAt(j,x);
//            i++;
//            j--;
//        }
//        System.out.println(str);

//        String str = "asdader";
//        char ch = 'a';
//        int x = (int)ch;
////        System.out.println(x);
//        System.out.println((int)str.charAt(str.length()-1));
//        System.out.println((char) ('a'-32));
//int x = 100;
//x = x - 32;
//char ch = (char)x;
//        System.out.println(ch);
//        String s = "asdad";
//        int i = s.length()-1;
//       String str = s.substring(i+1,s.length());
//        System.out.println(str);

//        using String Object Toggle the given String

//        from caSEr --> CASER

//        String s = "caSEr";
//        for (int i = 0; i < s.length(); i++) {
//            int x = (int)s.charAt(i);
//            if (x >= 97){
//                x -= 32;
//                char ch = (char)x;
//                s = s.substring(0,i) + ch + s.substring(i+1,s.length());
//            }
//        }
//        System.out.println(s);

//        from caSEr --> caser

//        String s = "caSEr";
//        for (int i = 0; i < s.length(); i++) {
//            int x = (int)s.charAt(i);
//            if (x >= 65 && x < 97){
//                x += 32;
//                char ch = (char)x;
//                s = s.substring(0,i) + ch + s.substring(i+1,s.length());
//            }
//        }
//        System.out.println(s);

//        Using StringBuilder Toggle the given String

//        from caSEr --> CASER

//        StringBuilder s = new StringBuilder("caSEr");
//        for (int i = 0; i < s.length(); i++) {
//            int x =(int) s.charAt(i);
//            if (x >= 97){
//                x -= 32;
//                s.setCharAt(i,(char)x);
//            }
//        }
//        System.out.println(s);


//from caSEr --> caser


//        StringBuilder s = new StringBuilder("caSEr");
//        for (int i = 0; i < s.length(); i++) {
//            int x =(int) s.charAt(i);
//            if (x >= 65 && x <97){
//                x += 32;
//                s.setCharAt(i,(char)x);
//            }
//        }
//        System.out.println(s);

//        System.out.println(reverse("abcde"));
//        String str = "abcba";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j < str.length()+1; j++) {
//                String s = str.substring(i,j);
//                System.out.print(s+" ");
//                if (s.equals(reverse(s))){
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println(count);


// Q-4       aabbbcccc --> a2b3c4
//String str = "aabbbccddddeeeee";
//int i;
//        int k = 0,count = 0;
//        StringBuilder ans = new StringBuilder("");
//        for ( i = 0; i < str.length(); i++) {
//            char x = str.charAt(k);
//            if (x == str.charAt(i))count++;
//            else {
//                ans.append(str.charAt(i-1));
//                ans.append(count);
//                k = i;
//                i = i - 1;
//                count = 0;
//            }
//        }
//        ans.append(str.charAt(i-1));
//        ans.append(count);
//        System.out.println(ans);

//        alternate Solution--> Q4


//String str = "aabbbccccdd";
//int count = 1;
//String ans = "";
//char prev = str.charAt(0);
//        for (int i = 1; i < str.length(); i++) {
//             prev = str.charAt(i-1);
//            char curr = str.charAt(i);
//            if (prev == curr)count++;
//            else {
//                ans += prev;
//                ans += count;
//                count = 1;
//            }
//        }
//        ans += prev;
//        ans += count;
//        System.out.println(ans);

//        Q3 ->
//                I am Engineer --> I ma reenignE

//        String str = "I am an Engineer";
//        String  sub = "";
//        String ans = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ')sub+=str.charAt(i);
//            else {
//                sub = reverse(sub);
//                ans = ans + sub + " ";
//                sub = " ";
//            }
//        }
//        sub = reverse(sub);
//        ans = ans + sub + " ";
//        System.out.println(ans);
 }
}
