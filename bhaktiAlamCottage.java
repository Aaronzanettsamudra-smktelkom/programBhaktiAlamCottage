import java.util.Scanner;

public class bhaktiAlamCottage {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Silahkan pilih cottage:harga (weekday) (weekend) (holiday)");
        System.out.println("Duku : 915000 | 1025000 | 1225000");
        System.out.println("Jeruk : 915000 | 1025000 | 1225000");
        System.out.println("Alpukat : 575000 | 695000 | 895000");
        System.out.println("Jambu air : 575000 | 695000 | 895000");
        System.out.println("Durian : 595000 | 715000 | 915000");
        System.out.println("Melon : 595000 | 715000 | 915000");
        System.out.println("Belimbing : 495000 | 575000 | 755000");
        System.out.println("Mangga : 495000 | 575000 | 755000");
        System.out.println("Kedondong : 495000 | 575000 | 755000");
        System.out.println("---Contoh : Mangga, weekend---");
        
        int harga=0;
        System.out.println("Silahkan pilih cottage: ");
        String cottage = data.nextLine();
        System.out.println("Silahkan pilih hari anda menginap:");
        String day = data.nextLine();
        System.out.println("Berapa malam anda menginap ?");
        int night = data.nextInt();

        if(cottage.equals ("Duku")|| cottage.equals("Jeruk")){
            switch(day){
                case "weekday":
                harga = 915000;
                break;

                case "weekend":
                harga = 1025000;
                break;

                case "holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;
            }
        }else if(cottage.equals("Alpukat")||cottage.equals("Jambu air")){
            switch(day){
                case "weekday":
                harga = 575000;
                break;

                case "weekend":
                harga = 695000;
                break;

                case "holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
                break;
            }
        } else if(cottage.equals("Durian")||cottage.equals("Melon")){
            switch(day){
                case "weekday":
                harga = 595000;
                break;

                case "weekend":
                harga = 715000;
                break;

                case "holiday":
                harga = 915000;
                break;

                default:
                harga = 0;
                break;
            }
        } else if(cottage.equals("Belimbing")||cottage.equals("Mangga")||cottage.equals("Kedondong")){
            switch(day){
                case "weekday":
                harga = 495000;
                break;

                case "weekend":
                harga = 575000;
                break;

                case "holiday":
                harga = 755000;
                break;

                default:
                harga = 0;
                break;
            }
        } else{
            System.out.println("Maaf input anda tidak valid !");
        }

        System.out.println("===============");
        System.out.println("Cottage yang anda pesan adalah: " + cottage);
        System.out.println("Hari yang anda pilih adalah: " + day);
        System.out.println("Anda menginap selama: " + night + "malam");
        System.out.println("Total biaya: Rp." + harga * night);
        System.out.println("----- TERIMA KASIH -----");
    }
}
