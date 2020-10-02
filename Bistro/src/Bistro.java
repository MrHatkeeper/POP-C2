
public class Bistro {
    public static void main(String []args){
        MujTac mujTac = new MujTac();
        SilenaKucharka kucharka = new SilenaKucharka();
        int kolikratSiJedl = 0;

        while(mujTac.najedeny == false){
            if (mujTac.zinivy == true){
                mujTac.zinivy = false;
                mujTac.kelimmFull = false;
            }
            mujTac.coMamNaTacu();
            mujTac.pridatNaTac();
            mujTac.coMamNaTacu();
            mujTac.Jist();
            mujTac.Pit();
            mujTac.coMamNaTacu();
            System.out.println("Jedl si " + mujTac.kolikratSiJedl);
            kolikratSiJedl++;
            System.out.println(mujTac.kolikratSiJedl);
            if(mujTac.najedeny = true){
                System.out.println("Jsi najedený");
            }
            else if(mujTac.najedeny = false){
                System.out.println("Nejsi najedený");
            }
            if(kolikratSiJedl > 10){
                if(kucharka.agresivni == true){
                    mujTac.najedeny = true;
                }
            }
        }
    }
}
