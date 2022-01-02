package io.github.kahenteikou.jpkitest;
import io.github.kahenteikou.jpkilib.core.JPKIConfirmResult_E;
import io.github.kahenteikou.jpkilib.core.JPKICryptAuth_E;
import io.github.kahenteikou.jpkilib.core.JPKICryptSign_E;
import io.github.kahenteikou.jpkilib.core.JPKIUserCertService_E;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICardType;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptSignJNIException;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKIUserCertException;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

public class MainApp {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if(args.length > 1){
            System.out.println(args[0]);
            int selectvalue=Integer.parseInt(args[0]);
            JPKIConfirmResult_E.Load_Lib(args[1]);
            JPKIUserCertService_E.Load_Lib(args[1]);
            switch (selectvalue){
                case 0:

                    try {
                        JPKICryptSign_E jpkikun=new JPKICryptSign_E(args[1]);
                        long hProvider=jpkikun.cryptAcquireContext(0);
                        try{
                            long hKey = jpkikun.cryptGetUserKey(hProvider);
                            try {
                                jpkikun.cryptGetCertificateValue(hKey);
                            } finally {
                                jpkikun.cryptDestroyKey(hKey);
                            }
                        }finally {
                            jpkikun.cryptReleaseContext(hProvider);
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }catch (E_JPKICryptSignJNIException e){
                        e.printStackTrace();
                    }
                    break;
                case 1:
                    try{
                        JPKICryptAuth_E jpki22=new JPKICryptAuth_E(args[1]);
                        long hProvider=jpki22.cryptAcquireContext(0);
                        try{
                            long hKey=jpki22.cryptGetUserKey(hProvider);
                            try{
                                jpki22.cryptGetCertificateValue(hKey);
                            }finally {
                                jpki22.cryptDestroyKey(hKey);
                            }
                        }finally {
                            jpki22.cryptReleaseContext(hProvider);
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (E_JPKICryptAuthJNIException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:

                    try{
                        JPKICryptAuth_E jpki223=new JPKICryptAuth_E(args[1]);
                        long hProvider=jpki223.cryptAcquireContext(0);
                        try{
                            long hKey=jpki223.cryptGetUserKey(hProvider);
                            try{
                                byte[] bufcertkun=jpki223.cryptGetCertificateValue(hKey);

                                JPKIUserCertService_E ucs=new JPKIUserCertService_E(bufcertkun);
                                try{
                                    ucs.showCertViewer();
                                } catch (E_JPKIUserCertException e) {
                                    e.printStackTrace();
                                }

                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            } finally {
                                jpki223.cryptDestroyKey(hKey);
                            }
                        }finally {
                            jpki223.cryptReleaseContext(hProvider);
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (E_JPKICryptAuthJNIException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    JPKIUserCertService_E ucs=new JPKIUserCertService_E();
                    try{
                        E_JPKICardType cardType=ucs.getCardType();
                        switch(cardType.getID()){
                            case JPKI_CARD_ID_BANGO:
                                System.out.println("JPKI_CARD_ID_BANGO");
                                break;
                            case JPKI_CARD_ID_JYUKI:
                                System.out.println("JPKI_CARD_ID_JYUKI");
                                break;
                            case JPKI_CARD_ID_UNKNOWN:
                                System.out.println("JPKI_CARD_ID_UNKNOWN");
                                break;
                            default:
                                break;
                        }
                        String tokenInfo=cardType.getTokenInfo();
                        System.out.println(tokenInfo);
                    } catch (E_JPKIUserCertException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
