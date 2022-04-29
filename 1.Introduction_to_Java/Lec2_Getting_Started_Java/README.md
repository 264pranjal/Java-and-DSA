1. Primitive data type 'long' is having size _______ byte(s) in Java Programming. (**8**)
2. Which of the following data type stores longest decimal number ? (**double**)
3. Which of these values can be assigned to a boolean variable in Java? (**true or false**)
4. Which of these is a valid variable name ?(**var1**)
5. Compiler never assigns a default value to an uninitialized local variable in Java Programming. Whether this statement is true or false ?(**true**)
6. What is the output of the following code if the input is : 5 10 ? (**15**)

              Scanner s = new Scanner(System.in);
              int a = s.nextInt();
              int b = s.nextInt();
              System.out.println(a+b);
7. What is the output of the following code if the input string is "Career Labs"? (**Career**)

              Scanner s = new Scanner(System.in);
              String str;
              str = s.next();
              System.out.print(str);
8. What is the output of the following code if input is :  (**10abc**)
              10 abc def

              Scanner s = new Scanner(System.in);
              int a = s.nextInt();
              String str = s.next();
              System.out.print(a);
              System.out.println(str);
9. What is the output of the following code if input is : abc def 10  (**InputMismatchException**)

              Scanner s = new Scanner(System.in);
              String str = s.next();
              int a = s.nextInt();
              System.out.print(str + " " + a);          
10. What is the error in this code? (**b is multiplied with 50 where b is byte variable and 50 is an integer**)

              byte b = 50;
              b = b * 50;
11. Find the output  (**2.0**)

              public class  Solution{
                  public static void main(String [] args)  {
                      double a = 6 / 4;
                      int b  = 6 / 4;
                      double c = a + b;
                      System.out.println(c);
                  }
              }
12. Find the output  (**5.5 5**)

              public class  Solution{
                  public static void main(String [] args)  {
                      double a = 55.5;
                      int b = 55;
                      a = a % 10;
                      b = b % 10;
                      System.out.println(a + " "  + b);
                    }
               }
13. Find the output  (**false**)

                public class  Solution {
                    public static void main(String [] args)  {
                        int var1 = 5;
                        int var2 = 6;
                        System.out.print(var1 > var2);
                    }
                }               
               
