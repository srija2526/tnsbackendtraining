public class conditionalstmt {
    public static void main(String[] args) {
        //conditional stmt
        //if,elseif,else
        int a=25,b=25;
        if(a>b){
            System.out.println(a);
        }
        else if(b>a){
            System.out.println(b);
        }
        else{
            System.out.println("equal");
        }

        //looping stmt
        //for
        int[] arr={4,5,6,4,6,8};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //while loop
        int arr1[]={2,3,4,5,6};
        int i=0;
        while (i<arr1.length) {
            System.out.println(arr1[i]);
            i++;
            // code to be executed repeatedly
        }
        //do while
        int arr2[]={2,3,7,5,9,2};
        int i1=0;
        do {
            System.out.println("hello");
            i1++;
               // code to be executed repeatedly
        } while (i1<arr2.length);
        

        

    }
    
}
