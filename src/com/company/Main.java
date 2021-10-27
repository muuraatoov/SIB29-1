package com.company;

public class Phone {
    private    int id;
    private int nomecard;
    private int timelocal;
    private      String FIO,
            creditcard,
            address,
            debit;

    public Phone (){
    }

    public int getId() {
        return id;
    }
    public int getNomecard() {
        return nomecard;
    }
    public int getTimelocal() {
        return timelocal;
    }

    public String getFIO() {
        return FIO;
    }

    public String getCreditcard() {
        return creditcard;
    }


    public String getAddress() {
        return address;
    }
    public String getDebit() {
        return debit;
    }


    public Phone (int id, String FIO, String Kredit, String Nomecard, String Address) {
        this.id = id;
        this.nomecard = nomecard;
        this.timelocal = timelocal;
        FIO = FIO;
        this.creditcard = creditcard;
        this.address = address;
        this.debit = debit;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", Creditcard='" + creditcard + '\'' +
                ", nomecard='" + nomecard + '\'' +
                ", Address='" + address + '\'' +
                ", Debit='" + debit + '\'' +
                ", timelocal='" + timelocal + '\'' +
                '}';
    }
}