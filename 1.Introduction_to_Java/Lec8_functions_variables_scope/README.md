1.  Predict the output of the following code:(**210**)

        public static void main (String[] args) {
            int n=10,r=6;
            int factn=1,factr=1,factnr=1;
            for(int i=2;i<=n;i++)
            {
                factn*=i;
                if(i<=r)
                    factr*=i;
                if(i<=n-r)
                    factnr*=i;
            }
            int ncr=factn/(factr * factnr);
            System.out.print(ncr);
        }
2.  What is the return type of a method that does not returns any value ?(**void**)
3.  Let’s say the problem is - You will be given two numbers(both integers) and you need to return their sum.
    For this problem, what should be the return type of function(**int**)
4. What will be the output of the following code ?(**19**)
        public static void func(int a, int b){
        System.out.println(a + b);
        }

        public static void main(String[] args) {
        int a = 7;
        func(a, 12);
        }
5.  What will be the output of the following code ?(**compilation error**)

        public static void demo(int a, int b){
            System.out.println(a + " " + b);
        }

        public static void main(String[] args) {
            int a = 5;
            int b = 15; 
            demo(a);
        }
6.  What should be return type of the following function: (**float**)

          public static _ division(int a,int b)
          {
              float c = a / b;
              return c;
          }
      
7.  Would the following code generate an error:(**No**)

          public static double add(int a,int b)
          {
              float c=a+b;
              return c;
          }
          public static void main (String[] args) {
              System.out.print(add(10,3));
          }
8.  Will the given code generate any error:(**Yes**)

          public static void func1(int a)
          {
              System.out.print("a");
          }
          public static void main (String[] args) {
              func1(2.5);
          }

9.  What will be the output of the following code:(**#*#**)

            public static void func2()
            {
                System.out.print("#");
            }
            public static void func1()
            {
                System.out.print("*");
                func2();
            }
            public static void main (String[] args) {
                func2();
                func1();
            }
10. What will be the output of the following code:(**32**)

            public static void func1(int a,int b)
            {
                int ans=1;
                for(int i=0;i<b;i++)
                {
                    ans*=a;
                }
                System.out.print(ans);
            }
            public static void main (String[] args) {
                func1(2,5);
            }
11.Will following code generate any error ?(**yes**)

          public class Main {
              public static void func(int a) {
                  int b = a;
                  b = b + 10;
              }

              public static void main(String[] args) {
                  int a = 10;
                  func(a);
                  System.out.println(b);
              }
          }
12. Will following code generate any error ?(**no**)

          public class Main {
              public static void func(int a) {
                  int b = 10;
                  a = a + 10;
                  System.out.println(a);
              }

              public static void main(String[] args) {
                  int a = 10;
                  func(a);
                  System.out.println(a);
              }
          }
13. What will be the output of the following code ?(**8**)

            public static void doubleValue(int a ){
                a = a * 2;
            }
            public static void main(String[] args) {
                int a = 8;
                doubleValue(a);
                System.out.println(a);
            }
14. What will be the output of the following code ?(**5**)

            public static int func(int a){
                a += 10;
                return a;
            }

            public static void main(String[] args) {
                int a = 5;
                func(a);
                System.out.println(a);
            }
15.What will be the output of the following code ?(**16**)

            public static int square(int a){
                int ans = a * a;
                return ans;
            }

            public static void main(String[] args) {
                int a = 4;
                a = square(a);
                System.out.println(a);
            }
16. What will be the output of the following code:(**TRUE**)

             public static boolean isPrime(int x)
            {
                for(int i=2;i<x/2;i++)
                {
                    if(x%i==0)
                    return false;
                }
                return true;

            }
            public static void main (String[] args) {
                System.out.print(isPrime(47));
            }
17.What will be the output of the following code:(**int sum 9**)

            public static int sum(int a,int b)
            {
                System.out.print("int sum ");
                return a+b;
            }
            public static long sum(long a,long b)
            {
                System.out.print("long sum ");
                return a+b;
            }
            public static void main (String[] args) {
                    int a=4;
                    int b=5;
                System.out.print(sum(a,b));
            }
18.What will be the output of the following code:(**int sum 9float sum 9.0**)

            public static int sum(int a,int b)
            {
                System.out.print("int sum ");
                return a+b;
            }
            public static double sum(double a,double b)
            {
                System.out.print("float sum ");
                return a+b;
            }
            public static void main (String[] args) {
                System.out.print(sum(5,4));
                System.out.print(sum(5.0,4.0));
            }
