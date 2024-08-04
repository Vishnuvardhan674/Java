class Lab29 {
public static void main(String args[]){
char ch='\u';
System.out.println(ch);
}
}

/*
Lab29.java:3: error: illegal unicode escape
char ch='\u';
           ^
Lab29.java:3: error: empty character literal
char ch='\u';
        ^
Lab29.java:4: error: ';' expected
System.out.println(ch);
      ^
3 errors
*/