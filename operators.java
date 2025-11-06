public class operators {
    public static void main(String[] args) {
        int a = 12, b = 10;// arithmetic operators
        System.out.println("add " + (a + b));  // Addition
        System.out.println("sub " + (a - b)); 
        System.out.println("mutli" + (a *b)); 
        System.out.println("div " + (a /b)); 
        System.out.println("mod " + (a %b));  
        //unary operators
        a++;
        System.out.println("unary operators"+ a);
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);
        --a;
        System.out.println(a);
        //tenary operators
        int a1=25,b1=45;
       int max= (a>b)?a1:b1;
       System.out.println(max);
       //Assignment operators
       int a2=10,b2=12;
       a2+=b2;
       System.out.println(a2);
       //relationaloperators
       int a3=10,b3=12;
       System.out.println(a3==b3);
       System.out.println(a3>b3);
       System.out.println(a3<b3);
       System.out.println(a3!=b3);
       // bitwise&shift operators.
       int a4=2,b4=5;
       System.out.println(a4&b4);
       System.out.println(a4|b4);
       System.out.println(a4^b4);
       // instance of operators
       int arr[]={12,3,4,5};
       for(int a5:arr){
        System.out.println(a5);
       }        
        
    }
}
