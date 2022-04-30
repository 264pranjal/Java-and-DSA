1. Choose the correct output for the following code:(**61**)

          public static void main (String[] args) {
              int a=10,b=50;
              a++;
              --b;
              int c=a--+b--;
              System.out.print(++c);
          }
2. Which line(s) of the following code would give an error:(**Line2 and line4**)

          public static void main (String[] args) {
              int a=10,b=20;
              System.out.println(a+++--b);//line 1
              System.out.println(a--+++b);//line 2
              System.out.println(a++-++b);//line 3
              System.out.println(a+++++b);//line 4
          }
3.  Choose the correct output of the following code:(**03030-61**)

          public static void main (String[] args) {
              int a=10,b=20;
              int c=a&b;
              System.out.print(c);
              int d=a|b;
              System.out.print(d);
              int e=a^b;
              System.out.print(e);
              int f=c+d+e;
              System.out.print(~f);
          }
4.  Choose the correct output for the given code:(**-26**)

        public static void main (String[] args) {
            int a=10,b=-20;
            System.out.print(a^b);
        }
5.  What will be the output ? (**42 -43**)

        public static void main(String args[])
           {
               int a = 42;
               int b = ~a; (there is tilde sign before a)
               System.out.print(a + " " + b);       
           }
6.  Output(**2**)

        class Output {
            public static void main(String args[]) 
            {    
                 int x , y = 1;
                 x = 10;
                 if (x != 10 && x / 0 == 0)
                     System.out.println(y);
                 else
                     System.out.println(++y);
            } 
        }
7.  Output(**15 17**)

          class Solution {
              public static void main(String args[]) 
              {   
              int x = 15;
              int y = x++;
              int  z = ++x;
              System.out.println(y +" " + z);
              }
          }
8.  Output(**32**)

        class Solution {
            public static void main(String args[]) 
            {        
                 int g = 3;
                 System.out.print(++g * 8);
            } 
        } 
9.  Output(**Inside else 11 20**)

        class Solution {
            public static void main(String args[]) 
            {
                int x =10;
                int y = 20;
                if(x++ > 10 && ++y > 20 ){
                System.out.print("Inside if  ");
                }else{
                System.out.print("Inside else  ");
                }
                System.out.println(x +" "+y);
             }
        } 
10. Output(**Inside else 11 21**)

        class Solution {
            public static void main(String args[]) 
            {
                 int x = 10;
                 int y = 20;
                 if(x++ > 10 || ++y > 20 ){
                System.out.print("Inside if  ");
                 }else{
                System.out.print("Inside else  ");
                 }
                 System.out.println(x  + " " + y);
            }
        }     
11. Select the correct output for the following code:(**22**)

        public static void main (String[] args) {
            int a=5;
            a+=5+(++a)+(a++);
            System.out.print(a);
        } 
12. Output(**86**)

        public static void main (String[] args) {
            int a=10;
            a+=(++a-5/3+6 * a);
            System.out.print(a);
        }
      
13. What will be the output the following code?(**0 2 4**)

            for(int i = 0; i < 5; i = i + 1){
                System.out.print(i + " ");
                i = i + 1;
            }
14. What will be the output the following code?(**infinite 1s**)

            for(int i = 1; i < 5; i = i + 1){
                System.out.print(i +" ");
                i = i - 1;
            }
15. What will be the output ?(**0 0**)

            for(int i = 0; i < 2; i = i + 1) {
                 for(int j = 0; j < 2; j = j + 1) {
                      if (j == 1)
                          break;
                      System.out.print(j +" ");
                  }
             } 
16. How many times will the following loop run?(**4**)

            for(int i=1;i<10;i*=2)
            {
                 System.out.println(i);
            } 
17. Which value(s) can be used to initialize i so that the loop is finite:(**729 483**)

            public static void main (String[] args) {
                for(int i=_;i>0;i=i%3)
                {
                    System.out.print("*");
                }
            }
18. Guess the output for the following code:(**01234**)

            public static void main (String[] args) {
                int i=0;
                for(;;)
                {
                    if(i==5)
                        break;
                    System.out.print(i);
                    i++;
                }
            }
19. Select the correct output for the following code:(**infinte loop**)

            public static void main (String[] args) {
                for(int i=7;i!=0;i--)
                {
                    System.out.print(i--);
                }
            }
20. Which code snippet would generate an error?(**3**)

              1.
              for(int i=1;;i++)
                  {   if(i==5)
                          break;
                      System.out.print(i);
                  }
              2.
              for(int i=1;;i++)
                  {   if(i<5)
                          System.out.print(i);
                      else 
                          break;
                  }
              3.
              for(int i=1;;i++)
                  {   if(i>5)
                      {
                          break;
                          System.out.print("break statement reached");
                      }
                      System.out.print(i);
                  }
21. Which of these jump statements can skip processing remainder of code in its body for a particular iteration ?(**continue**)
22.  Output(**1 2**)

                int i = 1;
                while(i < 5) {
                    if(i == 3) {
                        break;
                    }
                    System.out.print(i + " ");
                    i++;
                }

23.  Output(**1 2[with infinite loop]**)

              int i = 1;
              while(i < 5) {
                  if(i == 3) {
                      continue;
                  }
                  System.out.print(i + " ");
                  i++;
              }
24.  Output(**1 2 1 2**)

            int i = 1;
            while(i < 3) {
                int j = 1;
                while(j < 5) {
                    if(j == 3) {
                        break;
                    }
                    System.out.print(j + " ");
                    j++;
                }
                i++;
            }
25. Output(**1 2 4 5 1 2 4 5**)

            int i = 1;
            while(i < 3) {
                int j = 0;
                while(j < 5) {
                    j++;
                    if(j == 3) {
                        continue;
                    }
                    System.out.print(j + " ");
                }
                i++;
            }
