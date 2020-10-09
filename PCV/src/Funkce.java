class Funcke {


    public void Povrch(float stranaPodstavy, float vyskaStran, float vyska){
        float sp = (stranaPodstavy * vyskaStran) / 2;
        float o = 3*stranaPodstavy;
        float spl = o * vyska;
        float s = (2 * sp) + spl;
        System.out.println("S = " + s);
    }

    public void Objem(float stranaPodstavy, float vyskaStran, float vyska){
        float sp = (stranaPodstavy * vyskaStran) / 2;
        float v = sp*vyska;
        System.out.println("V = " + v);

    }

}
