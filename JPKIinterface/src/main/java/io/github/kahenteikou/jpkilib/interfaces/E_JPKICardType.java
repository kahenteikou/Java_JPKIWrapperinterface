package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKICardType {
    public enum JPKI_CARD_TP{
        JPKI_CARD_ID_UNKNOWN(0),
        JPKI_CARD_ID_JYUKI(1),
        JPKI_CARD_ID_BANGO(2);
        private final int valuekun;
        private JPKI_CARD_TP(int valuekun222){
            valuekun=valuekun222;
        }
        public int getInt(){
            return valuekun;
        }
    }
    private JPKI_CARD_TP type;
    private String tokenInfo;
    public JPKI_CARD_TP getID(){
        return type;
    }

    public String getTokenInfo(){
        return tokenInfo;
    }

    public E_JPKICardType(JPKI_CARD_TP type, String tokeninfo) {
        this.type=type;
        this.tokenInfo=tokeninfo;
    }
    public E_JPKICardType(int type, String tokeninfo) {
        for(JPKI_CARD_TP tpkun:JPKI_CARD_TP.values()){
            if(tpkun.getInt()==type){
                this.type=tpkun;
            }
        }
        this.tokenInfo=tokeninfo;
    }
}
