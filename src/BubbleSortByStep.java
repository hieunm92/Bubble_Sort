import java.util.Scanner;

public class BubbleSortByStep {
    public static void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap do dai cua mang: ");
//        int size = scanner.nextInt();
//        int[] list = new  int[size];
//        System.out.println("Nhap gia tri mang " + list.length);
//        for (int i = 0; i < list.length; i++) {
//            list[i]=scanner.nextInt();
//
//        }
//        System.out.println("Nhap danh sach: ");
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]+"\t");
//
//        }
//        System.out.println("\nBegin sort processing...");
        int list[] = {2, 3, -4, 5, -6};
        bubbleSortByStep(list);
    }
    
    public static void bubbleSortByStep(int[] list){
//        boolean needNextPass = true;
        for (int k = 1; k < list.length; k++) {
//            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]){
                    System.out.println("Hoan doi " + list[i] + "voi" + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

//                    needNextPass = true;
                }

            }
//            if (needNextPass == false){
//                System.out.println("Mang co the sap xep va khong can chuyen tiep");
//                break;
//            }
            System.out.println("Liet ke sau " + k + "sap xep");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]+"\t");

            }
            System.out.println();
            
        }
    }

}
