package com.itea.dimka.lection8;


public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber;

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public int generateNumber(){
            int temp = new java.util.Random().nextInt(10_000_000);
            number=temp;
            return number;
        }
    }

    public void obtainPhoneNumber (int coutryCode, int netCode){
        phoneNumber=new PhoneNumber();
        phoneNumber.setCountryCode(coutryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    public String getPhoneNumber(){
        if (phoneNumber !=null){
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode +
                    "-" + phoneNumber.number);
        } else{
            return "phone number is empty";
        }
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("Abonent '" + name + "':\n");
        stringBuilder.append(" ID - " + id + "\n");
        stringBuilder.append(" Tariff Plan - " + tariffPlan + "\n");
        stringBuilder.append(" Phone Number - " + getPhoneNumber() + "\n");
        return stringBuilder.toString();
    }
}
