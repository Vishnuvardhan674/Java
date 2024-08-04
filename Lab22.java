class Lab22{
public static void main(String args[]){
char ch1=";
char ch2='  ';
char ch3='AB';
char ch4='\';
char ch5="'; 
System.out.println(ch1);
System.out.println(ch2);
System.out.println(ch3);
System.out.println(ch4);
System.out.println(ch5);
}
}

/*
 Lab22.java:3: error: unclosed string literal
char ch1=";
         ^
Lab22.java:4: error: unclosed character literal
char ch2='  ';
         ^
Lab22.java:4: error: unclosed character literal
char ch2='  ';
            ^
Lab22.java:4: error: ';' expected
char ch2='  ';
              ^
Lab22.java:5: error: unclosed character literal
char ch3='AB';
         ^
Lab22.java:5: error: unclosed character literal
char ch3='AB';
            ^
Lab22.java:5: error: not a statement
char ch3='AB';
           ^
Lab22.java:6: error: unclosed character literal
char ch4='\';
         ^
Lab22.java:7: error: unclosed string literal
char ch5="';
         ^
9 errors

*/