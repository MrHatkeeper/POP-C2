public class TrojbokýHranol {
    public static void main(String[] args) {
        //trojboký Hranol pravoúhlá podstava
        Funcke funcke = new Funcke();
            float prvniStranaPodstavy = 5;
            float vyskaStran = (float) 4.3;
            float vyska = 6;

        funcke.Povrch(5, (float) 4.3, 6);
        funcke.Objem(5, (float) 4.3, 6);
        System.out.println("////////////////////////////");
        funcke.Povrch(6 , (float) 5.2, 10);
        funcke.Objem(6 , (float) 5.2, 10);
        System.out.println("////////////////////////////");
        funcke.Povrch(7,(float) 12.12, 20);
        funcke.Objem(7,(float) 12.12, 20);
        System.out.println("////////////////////////////");



    }
}
