/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Rikke Nielsen
 */
public class Carport {
    
private int carport_id;
private String carportName;
private int Reglar;
private int spær;
private int rem;
private int søm;
private int sternBræder;
private int lægter;
private int skruer;
private int beslag;
private int beklædning;
private int vindskede;
private String tagtype;
private int taghældning;
private double totalprice;

    public Carport(int carport_id, String carportName, int Reglar, int spær, int rem, int søm, int sternBræder, int lægter, int skruer, int beslag, int beklædning, int vindskede, String tagtype, int taghældning, double totalprice) {
        this.carport_id = carport_id;
        this.carportName = carportName;
        this.Reglar = Reglar;
        this.spær = spær;
        this.rem = rem;
        this.søm = søm;
        this.sternBræder = sternBræder;
        this.lægter = lægter;
        this.skruer = skruer;
        this.beslag = beslag;
        this.beklædning = beklædning;
        this.vindskede = vindskede;
        this.tagtype = tagtype;
        this.taghældning = taghældning;
        this.totalprice = totalprice;
    }

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
    }

    public String getCarportName() {
        return carportName;
    }

    public void setCarportName(String carportName) {
        this.carportName = carportName;
    }

    public int getReglar() {
        return Reglar;
    }

    public void setReglar(int Reglar) {
        this.Reglar = Reglar;
    }

    public int getSpær() {
        return spær;
    }

    public void setSpær(int spær) {
        this.spær = spær;
    }

    public int getRem() {
        return rem;
    }

    public void setRem(int rem) {
        this.rem = rem;
    }

    public int getSøm() {
        return søm;
    }

    public void setSøm(int søm) {
        this.søm = søm;
    }

    public int getSternBræder() {
        return sternBræder;
    }

    public void setSternBræder(int sternBræder) {
        this.sternBræder = sternBræder;
    }

    public int getLægter() {
        return lægter;
    }

    public void setLægter(int lægter) {
        this.lægter = lægter;
    }

    public int getSkruer() {
        return skruer;
    }

    public void setSkruer(int skruer) {
        this.skruer = skruer;
    }

    public int getBeslag() {
        return beslag;
    }

    public void setBeslag(int beslag) {
        this.beslag = beslag;
    }

    public int getBeklædning() {
        return beklædning;
    }

    public void setBeklædning(int beklædning) {
        this.beklædning = beklædning;
    }

    public int getVindskede() {
        return vindskede;
    }

    public void setVindskede(int vindskede) {
        this.vindskede = vindskede;
    }

    public String getTagtype() {
        return tagtype;
    }

    public void setTagtype(String tagtype) {
        this.tagtype = tagtype;
    }

    public int getTaghældning() {
        return taghældning;
    }

    public void setTaghældning(int taghældning) {
        this.taghældning = taghældning;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }



}
