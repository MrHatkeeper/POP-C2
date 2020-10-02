public class MujTac {
    Pult pult = new Pult();
    AutomatNaPiti automatNaPiti = new AutomatNaPiti();

    boolean kelimek = false;
    boolean kelimmFull = false;
    boolean pribory = false;
    int salat = 0;
    int rizek = 0;
    int brambory = 0;
    boolean najedeny = false;
    boolean zinivy = true;
    int kolikratSiJedl = 0;


    public void  coMamNaTacu(){
        System.out.println("Na tácu máš: řízků " + rizek + " brambor " + brambory + " salat " + salat);
    }

    public void pridatNaTac(){
            if(pult.rízek){
                rizek++;
            }
            if(pult.brambory){
                brambory++;
            }
            if(pult.salat){
                salat++;
            }
    }
    public void Jist(){
        if(!pribory){
            if(pult.pribory){
                pribory = true;
            }
        }
        rizek = 0;
        salat = 0;
        brambory = 0;
        kolikratSiJedl++;
        System.out.println("jíš");
        if(kolikratSiJedl == 5){
            najedeny = true;
        }
    }

    public void Pit(){
        if(!kelimek){
            if(automatNaPiti.keliky){
                kelimek = true;
            }
        }
        if(automatNaPiti.cola){
            kelimmFull = true;
        }
        if(kelimmFull = true){
            System.out.println("piješ");
            zinivy = false;
            kelimmFull = false;
        }
    }
}
