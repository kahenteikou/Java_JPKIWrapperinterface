package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKIUserCertBasicData {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String substituteCharacterOfName;
    private String substituteCharacterOfAddress;
    public E_JPKIUserCertBasicData(String named,String dateOfBirthd,String genderd,String addressd,String substituteCharacterOfNamed,String substituteCharacterOfAddressd){
        name=named;
        dateOfBirth=dateOfBirthd;
        gender=genderd;
        address=addressd;
        substituteCharacterOfAddress=substituteCharacterOfAddressd;
        substituteCharacterOfName=substituteCharacterOfNamed;
    }
    public String getName() {
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return getAddress();
    }
    public String getSubstituteCharacterOfName(){
        return substituteCharacterOfName;
    }
    public String getSubstituteCharacterOfAddress(){
        return getSubstituteCharacterOfAddress();
    }
}
