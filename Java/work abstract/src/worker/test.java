/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author WeerisTreeratanajaru
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //สร้าง array จากคราส Worker เพื่อเก็บข้อมูลคนงานทั้งหมด
        Worker work[] = new Worker[11];
        //เพิ่มพนักงานทดลองงาน ชื่อ Nadech ได้รับค่าจ้างรายชั่วโมง 80 บาท ลงใน array ช่องที่ 0

        //เพิ่มพนักงานรายชั่วโมง ชื่อ Mario ได้รับค่าจ้างรายชั่วโมง 120 บาท เบี้ยขยัน 20 บาท ลงใน array ช่องที่ 1
        work[1] = new HourWorker("Mario",120,20);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mario ทำงาน 30 ชั่วโมง
        System.out.println(work[1].getName()+" gets "+work[1].weeklyPay(30));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mario ทำงาน 40 ชั่วโมง
        System.out.println(work[1].getName()+" gets "+work[1].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mario ทำงาน 50 ชั่วโมง
        System.out.println(work[1].getName()+" gets "+work[1].weeklyPay(50));
        
        //เพิ่มพนักงานประจำ ชื่อ James ได้รับค่าจ้างรายชั่วโมง 200 บาท ค่าปรับ 50 บาท ลงใน array ช่องที่ 2
        work[2] = new SalaryWorker("James",200,50);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ James ทำงาน 30 ชั่วโมง
        System.out.println(work[2].getName()+" gets "+work[2].weeklyPay(30));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ James ทำงาน 40 ชั่วโมง
        System.out.println(work[2].getName()+" gets "+work[2].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ James ทำงาน 50 ชั่วโมง
        System.out.println(work[2].getName()+" gets "+work[2].weeklyPay(50));
        
        //เพิ่มพนักงานขาย ชื่อ Boy ได้รับค่าจ้างรายชั่วโมง 120 บาท เป้า 30000 บาท ลงใน array ช่องที่ 3
        work[3] = new SaleWorker("Boy",120,30000);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Boy ทำยอดขายได้ 25000 บาท
        System.out.println(work[3].getName()+" gets "+work[3].weeklyPay(25000));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Boy ทำยอดขายได้ 30000 บาท
        System.out.println(work[3].getName()+" gets "+work[3].weeklyPay(30000));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Boy ทำยอดขายได้ 35000 บาท
        System.out.println(work[3].getName()+" gets "+work[3].weeklyPay(35000));
        
        //เพิ่มพนักงานรายชั่วโมงแบบชำนาญ  ชื่อ Dome ได้รับค่าจ้างรายชั่วโมง 120 บาท เบี้ยขยัน 20 บาท มีประสบการณ์ 3 ปี ลงใน array ช่องที่ 4
        work[4] = new HourWorherSpecial("Dome",120,20,3);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Dome ทำงาน 30 ชั่วโมง
        System.out.println(work[4].getName()+" gets "+work[4].weeklyPay(30));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Dome ทำงาน 40 ชั่วโมง
        System.out.println(work[4].getName()+" gets "+work[4].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Dome ทำงาน 50 ชั่วโมง
        System.out.println(work[4].getName()+" gets "+work[4].weeklyPay(50));
        
        //เพิ่มพนักงานรายชั่วโมงแบบชำนาญ  ชื่อ Tik ได้รับค่าจ้างรายชั่วโมง 120 บาท เบี้ยขยัน 20 บาท มีประสบการณ์ 5 ปี ลงใน array ช่องที่ 5
        work[5] = new HourWorkerSpecial("Tik",120,20,5);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Tik ทำงาน 30 ชั่วโมง
        System.out.println(work[5].getName()+" gets "+work[5].weeklyPay(30));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Tik ทำงาน 40 ชั่วโมง
        System.out.println(work[5].getName()+" gets "+work[5].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Tik ทำงาน 50 ชั่วโมง
        System.out.println(work[5].getName()+" gets "+work[5].weeklyPay(50));
        
        //เพิ่มพนักงานรายชั่วโมงแบบชำนาญ  ชื่อ Kong ได้รับค่าจ้างรายชั่วโมง 120 บาท เบี้ยขยัน 20 บาท มีประสบการณ์ 8 ปี ลงใน array ช่องที่ 6
        work[6] = new HourWorkerSpecial("Kong",120,20,8);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kong ทำงาน 30 ชั่วโมง
        System.out.println(work[6].getName()+" gets "+work[6].weeklyPay(30));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kong ทำงาน 40 ชั่วโมง
        System.out.println(work[6].getName()+" gets "+work[6].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kong ทำงาน 50 ชั่วโมง
        System.out.println(work[6].getName()+" gets "+work[6].weeklyPay(50));
        
        //เพิ่มผู้จัดการประจำ ชื่อ Yaya ได้รับค่าจ้างรายชั่วโมง 200 บาท ค่าปรับ 50 บาท จบปริญญาโท ลงใน array ช่องที่ 7
        work[7] = new SalaryWorkerManager("Yaya",200,50,true);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Yaya ทำงาน 30 ชั่วโมง
        System.out.println(work[7].getName()+" gets "+work[7].weeklyPay(30));        
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Yaya ทำงาน 40 ชั่วโมง
        System.out.println(work[7].getName()+" gets "+work[7].weeklyPay(40));
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Yaya ทำงาน 50 ชั่วโมง
        System.out.println(work[7].getName()+" gets "+work[7].weeklyPay(50));
        
        //เพิ่มผู้จัดการประจำ ชื่อ Kim ได้รับค่าจ้างรายชั่วโมง 200 บาท ค่าปรับ 50 บาท จบปริญญาตรี ลงใน array ช่องที่ 8
        work[8] = new SalaryWorkerManager("Kim",200,50,false);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kim ทำงาน 30 ชั่วโมง
        System.out.println(work[8].getName()+" gets "+work[8].weeklyPay(30)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kim ทำงาน 40 ชั่วโมง
        System.out.println(work[8].getName()+" gets "+work[8].weeklyPay(40)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Kim ทำงาน 50 ชั่วโมง
        System.out.println(work[8].getName()+" gets "+work[8].weeklyPay(50)); 
        
        //เพิ่มผู้จัดการฝ่ายขาย ชื่อ Mint ได้รับค่าจ้างรายชั่วโมง 120 บาท เป้า 30000 บาท ลงใน array ช่องที่ 9
        work[9] = new SaleWorkerManager("Mint",120,30000);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 25000 บาท และขายสินค้าใหม่ไม่ได้เลย
        System.out.println(work[9].getName()+" gets "+((SaleWorkerManager)work[9]).weeklyPay(25000, 0)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 30000 บาท และขายสินค้าใหม่ไม่ได้เลย
        System.out.println(work[9].getName()+" gets "+((SaleWorkerManager)work[9]).weeklyPay(30000,0)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 35000 บาท และขายสินค้าใหม่ไม่ได้เลย
        System.out.println(work[9].getName()+" gets "+((SaleWorkerManager)work[9]).weeklyPay(35000,0)); 
        
        //เพิ่มผู้จัดการฝ่ายขาย ชื่อ Ann ได้รับค่าจ้างรายชั่วโมง 120 บาท เป้า 30000 บาท ลงใน array ช่องที่ 10
        work[10] = new SaleWorkerManager("Ann",120,30000);
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 25000 บาท และขายสินค้าใหม่ได้ 1 ชิ้น
        System.out.println(work[10].getName()+" gets "+((SaleWorkerManager)work[10]).weeklyPay(25000,1)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 30000 บาท และขายสินค้าใหม่ได้ 1 ชิ้น
        System.out.println(work[10].getName()+" gets "+((SaleWorkerManager)work[10]).weeklyPay(30000,1)); 
        //แสดงผลรายได้ต่อสัปดาห์ เมื่อ Mint ทำยอดขายได้ 35000 บาท และขายสินค้าใหม่ได้ 1 ชิ้น
        System.out.println(work[10].getName()+" gets "+((SaleWorkerManager)work[10]).weeklyPay(35000,1)); 
    }
    
}
