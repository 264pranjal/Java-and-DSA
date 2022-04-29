1.Find the output of the following code: (**b is greater**)

            public static void main(String args[])
            {
                int a=10,b=15;
                if(a>b)
                {
                    System.out.print("a ");
                }
                else
                {
                    System.out.print("b ");
                }
                System.out.print("is greater");
            }
2.Find the output of the following code: (**Compile time error**)

            int a=50;
            if(a>10)
            {
                System.out.print("Coding");
            }
            else(a>20)
            {
                System.out.print("Ninjas");
            }
3.Find output(**Hello Hi**)

          public static void main(String args[])
          {
                  int x = 5; 
                  if (x < 6)
                      System.out.print("Hello  ");
                  if(x == 5){
                      System.out.print("Hi  ");
                  }
                  else{ 
                      System.out.print("Hey ");
                  } 
          }
4.Find output(**Inside if 15**)

        public static void main(String[] args) {
            int x = 15;
            if(x <= 15){
                System.out.print("Inside if  ");
            }else if(x == 15){
                System.out.print("Inside else if  ");
            }
            System.out.println(x);
        }
5.Find output (**2**)

          public static void main(String args[])
          {
              int var1 = 5; 
              int var2 = 6;
              if ((var2 = 1) == var1)
                  System.out.print(var2);
              else 
                  System.out.print(var2 + 1);
          }    
6.Which option can be used to check out of two numbers one is positive and the other is negative (Numbers be a and b). (**(a*b<0)**)

7.Find the output of the following code:(**Run time error**)

        public static void main (String[] args) {
            int a=50;
            int b=Integer.MIN_VALUE;
            if(a/0==b)
            {

                System.out.println("Hello");
            }
            else
            {
                System.out.println("Hi");
            }
        }
        
8. What will be the output of the following code:(**13579**)

        public static void main (String[] args) {
           int i=0;
           while(i<10)
           {
               i=i+1;
               System.out.print(i);
               i=i+1;
           }
        }
        
9. Find the output of the code :(**No output**)

          public static void main (String[] args) {
          int a=50,b=20;
          if(a>b)
          {
              if(a>100)
                  System.out.println("Ace");
              if(b<100)
                  b=50;
          }
          else if(a==b)
          {
              System.out.println("King");
          }
          else 
          {
              System.out.println("Queen");
          }
          }
      
10.The number of Hello printed on the screen for the following code will be:(**one**)

        public static void main (String[] args) {
            int x=5;
            int y=5;
            while((x=5)==y)
            {
                System.out.println("Hello");
                x++;
                y++;
            }
        }
        
11. The number of Hello printed on the screen for the following code will be:(**infinite**)


        public static void main (String[] args) {
            int x=5;
            int y=5;
            while(x==y)
            {
                System.out.println("Hello");
                x++;
                y++;
            }
        }
        
12. Which of the following codes gives same output: (**1 2**)

        1
           int i=1;
           while(i<5)
           {
               System.out.print(2*i);
               i=i+1;
           }

        2
           int i=2;
           while(i<10)
           {
               System.out.print(i);
               i=i+2;
           }

        3
           int i=2;
           while(i<10)
           {
               System.out.print(i);
               i*=2;
           }
        4
           int i=10;
           while(i>0)
           {
               if(i%2==0)
               {
                   System.out.print(10-i);
               }
               i--;
           }
   
13. Can this code be used to check primality of a positive integer:(**No**)

          public static void main (String[] args) {
              Scanner s=new Scanner (System.in);
              int n=s.nextInt();
              boolean isprime=true;
              if(n%2==0)
                  isprime=false;
              int i=3;
              while(isprime&&i<n)
              {
                  isprime=!(n%i==0);
                  i+=2;
              }
              if(isprime)
              {
                  System.out.println("Prime");
              }
              else
              {
                  System.out.println("Composite");
              }

          }
         
14. Find the output for the following code:(**98765**)

        int i=10;
            while((i=i-1)>0)
            {
                System.out.print(i);
                if(i%5==0)
                    return;
            }
15.Will following code generate error ?(**Yes**)

        public class Main {
            public static void main(String[] args) {
                int a = 10;
                if(a > 5) {
                    int b = 10;
                }
                System.out.println(b);
            }
        }
16.Will following code generate error ? (**No**)

        public class Main {
            public static void main(String[] args) {
                int a = 10;
                if(a > 5) {
                    a = 100;
                }
                System.out.println(a);
            }
        }
        
17.Will following code generate error ?(**Yes**)

        public class Main {
            public static void main(String[] args) {
                int a = 10;
                if(a > 5) {
                    int a = 100;
                }
                System.out.println(a);
            }
        }

18. Will following code generate error ?(**Yes**)

        public class Main {
            public static void main(String[] args) {
            for(int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                }
            System.out.print(i + " ");
            }
        }
19. What is the output ? (**1 1 1 1 1**)

        public class Main {
            public static void main(String[] args) {
            int a = 10;
            while(a > 5) {
                int b = 1;
                System.out.print(b + " ");
                a--;
            }
            }
        }
