// enum itu kaya class tapi isinya konstanta, biasanya dipake buat bikin nilai sesuatu yg ga berubah2

public enum Gerakan {
    // bikin enum buat gerakan apa aja yg ada
    BATU, KERTAS, GUNTING;

    // sisanya gaperlu dijelasin kayanya
    public static Gerakan fromString(Integer gerakan) {
        switch (gerakan) {
            case 1:
                return BATU;
            case 2:
                return GUNTING;
            case 3:
                return KERTAS;
            default:
                return null;
        }
    }

    public boolean menang(Gerakan lawan) {
        return (this == BATU && lawan == GUNTING) || (this == KERTAS && lawan == BATU)
                || (this == GUNTING && lawan == KERTAS);
    }
}