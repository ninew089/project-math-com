package exceptionproject;

public class Exception2 {
    static void guess(int num) throws Exception{
        System.out.println("2. start guess");
        if(num == 23) {
            throw new Exception();
        }
        System.out.println("3. end guess");
    }
    public static void main(String[] args) {
        // กำหนดให้ทดลอง เรียกรัน แล้วดูลำดับผลลัพธ์ ทดลองไล่ด้วยมือ หาเหตุผลว่าทำไมจึงมีลำดับแบบนี้
        // ในรอบแรก num = 12 ลำดับเป็นอย่างไร อะไรที่หายไปและเพราะอะไร
        // ทดลอง เปลี่ยน num = 23  ลำดับเป็นอย่างไร อะไรที่หายไปและเพราะอะไร
        // การ throw exceptin ใน บรรทัด 7 มีผลทำให้เกิดอะไร 
        // ***หลักการ throw จะต้องสร้าง object exception และโยนออกจาก method
        // ***โดย method ต้องมีการ กำหนดว่าจะ throws อะไรไว้หลัง method ด้วย
        int num = 12;
        try {
            System.out.println("1. try - before call guess num=" + num);
            guess(num);
            System.out.println("4. try - after call guess num=" + num);
            
        }
        catch( Exception ex) {
            System.out.println("5. Catch the exception : Corect, it's " + num);
        }
        finally {
            System.out.println("6. I love you no matter what.");
        }
        System.out.println("7. End of try catch finally");
    } 
}
