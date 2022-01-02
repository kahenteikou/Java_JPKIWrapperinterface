package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKICardType {
    public enum JPKI_CARD_TP{
        JPKI_CARD_ID_UNKNOWN,
        JPKI_CARD_ID_JYUKI,
        JPKI_CARD_ID_BANGO
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
}
