package org.zoodooz;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> phoneList = new ArrayList<>();

    public void setName(String name){
        this.nameList.add(name);

    }
    public ArrayList<String> getName(){

        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
        return nameList;
    }

    public void setPhone(String phone){
        this.phoneList.add(phone);
    }

    public ArrayList<String> getPhoneList(){
        for(int i = 0; i < phoneList.size(); i++){
            System.out.println(phoneList.get(i));
        }
        return phoneList;
    }
    public void searchName(String searchName){
        for(int i = 0; i < nameList.size();i++){
            if(searchName.regionMatches(true, 0, nameList.get(i), 0 ,searchName.length())){
                System.out.println(nameList.get(i) + " " + phoneList.get(i));
            }
        }
    }
}