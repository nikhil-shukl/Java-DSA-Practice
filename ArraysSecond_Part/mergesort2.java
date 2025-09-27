package ArraysSecond_Part;

public class mergesort2 {
    public static void main(String[] args) {
    

    int[]num1={1, 3, 5, 7,8,9,10};
    int[]num2={2, 4, 6};
    int[] c = new int[num1.length+num2.length];
    int m = 0, n = 0, p = 0;

    while(m<num1.length && n<num2.length){
        if(num1[m]<num2[n]){
              c[p] = num1[m];
              m++;
        } else{
            c[p] = num2[n];
            n++;
        }
        p++;
    }

    //second step
    if(m==num1.length){
        while(n<num2.length){ // here if used if then only will copy one element only so used while
            c[p]=num2[n];
            n++;
            p++;
        }
    }
    if(n==num2.length){
        if(m<num1.length){
            c[p]=num1[m];
            m++;
            p++;
        }
    }

    for(int ele:c){
        System.out.print(ele+" ");
    }


} 
}
