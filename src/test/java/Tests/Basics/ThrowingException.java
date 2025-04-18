package Tests.Basics;

import org.testng.annotations.Test;

public class ThrowingException {

    @Test
    public void FindingAreaAndThrowingException(){
//        Scanner sc = new Scanner(System.in);
//        int B = sc.nextInt();
//        int H = sc.nextInt();
//        sc.close();

        int B = 1;
        int H = 3;
        try{
            if( B <= 0 || H <= 0){
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }

            int area = B * H;
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }



}
