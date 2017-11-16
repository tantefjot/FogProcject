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
private  String carport_name;
private int antal_Reglar;
private int antal_spær;
private int antal_rem;
private int antal_søm;
private int antal_Stern;
private int antal_Lægter;
private int antal_Skruer;
private int antal_beslag;
private int antal_Beklædning;
private int antal_Vindskede;
private String tagtype; 
private int taghældning; 
private  int product_id;
private  int ground_id;
private int totalprice;

    public Carport(int carport_id, String carport_name, int antal_Reglar, int antal_spær, int antal_rem, int antal_søm, int antal_Stern, int antal_Lægter, int antal_Skruer, int antal_beslag, int antal_Beklædning, int antal_Vindskede, String tagtype, int taghældning, int product_id, int ground_id, int totalprice) {
        this.carport_id = carport_id;
        this.carport_name = carport_name;
        this.antal_Reglar = antal_Reglar;
        this.antal_spær = antal_spær;
        this.antal_rem = antal_rem;
        this.antal_søm = antal_søm;
        this.antal_Stern = antal_Stern;
        this.antal_Lægter = antal_Lægter;
        this.antal_Skruer = antal_Skruer;
        this.antal_beslag = antal_beslag;
        this.antal_Beklædning = antal_Beklædning;
        this.antal_Vindskede = antal_Vindskede;
        this.tagtype = tagtype;
        this.taghældning = taghældning;
        this.product_id = product_id;
        this.ground_id = ground_id;
        this.totalprice = totalprice;
    }

    public Carport(String carport_name, int antal_Reglar, int antal_spær, int antal_rem, int antal_søm, int antal_Stern, int antal_Lægter, int antal_Skruer, int antal_beslag, int antal_Beklædning, int antal_Vindskede, String tagtype, int taghældning, int product_id, int ground_id, int totalprice) {
        this.carport_name = carport_name;
        this.antal_Reglar = antal_Reglar;
        this.antal_spær = antal_spær;
        this.antal_rem = antal_rem;
        this.antal_søm = antal_søm;
        this.antal_Stern = antal_Stern;
        this.antal_Lægter = antal_Lægter;
        this.antal_Skruer = antal_Skruer;
        this.antal_beslag = antal_beslag;
        this.antal_Beklædning = antal_Beklædning;
        this.antal_Vindskede = antal_Vindskede;
        this.tagtype = tagtype;
        this.taghældning = taghældning;
        this.product_id = product_id;
        this.ground_id = ground_id;
        this.totalprice = totalprice;
    }
    
    

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
    }

    public String getCarport_name() {
        return carport_name;
    }

    public void setCarport_name(String carport_name) {
        this.carport_name = carport_name;
    }

    public int getAntal_Reglar() {
        return antal_Reglar;
    }

    public void setAntal_Reglar(int antal_Reglar) {
        this.antal_Reglar = antal_Reglar;
    }

    public int getAntal_spær() {
        return antal_spær;
    }

    public void setAntal_spær(int antal_spær) {
        this.antal_spær = antal_spær;
    }

    public int getAntal_rem() {
        return antal_rem;
    }

    public void setAntal_rem(int antal_rem) {
        this.antal_rem = antal_rem;
    }

    public int getAntal_søm() {
        return antal_søm;
    }

    public void setAntal_søm(int antal_søm) {
        this.antal_søm = antal_søm;
    }

    public int getAntal_Stern() {
        return antal_Stern;
    }

    public void setAntal_Stern(int antal_Stern) {
        this.antal_Stern = antal_Stern;
    }

    public int getAntal_Lægter() {
        return antal_Lægter;
    }

    public void setAntal_Lægter(int antal_Lægter) {
        this.antal_Lægter = antal_Lægter;
    }

    public int getAntal_Skruer() {
        return antal_Skruer;
    }

    public void setAntal_Skruer(int antal_Skruer) {
        this.antal_Skruer = antal_Skruer;
    }

    public int getAntal_beslag() {
        return antal_beslag;
    }

    public void setAntal_beslag(int antal_beslag) {
        this.antal_beslag = antal_beslag;
    }

    public int getAntal_Beklædning() {
        return antal_Beklædning;
    }

    public void setAntal_Beklædning(int antal_Beklædning) {
        this.antal_Beklædning = antal_Beklædning;
    }

    public int getAntal_Vindskede() {
        return antal_Vindskede;
    }

    public void setAntal_Vindskede(int antal_Vindskede) {
        this.antal_Vindskede = antal_Vindskede;
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

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getGround_id() {
        return ground_id;
    }

    public void setGround_id(int ground_id) {
        this.ground_id = ground_id;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Carport{" + "carport_id=" + carport_id + ", carport_name=" + carport_name + ", antal_Reglar=" + antal_Reglar + ", antal_sp\u00e6r=" + antal_spær + ", antal_rem=" + antal_rem + ", antal_s\u00f8m=" + antal_søm + ", antal_Stern=" + antal_Stern + ", antal_L\u00e6gter=" + antal_Lægter + ", antal_Skruer=" + antal_Skruer + ", antal_beslag=" + antal_beslag + ", antal_Bekl\u00e6dning=" + antal_Beklædning + ", antal_Vindskede=" + antal_Vindskede + ", tagtype=" + tagtype + ", tagh\u00e6ldning=" + taghældning + ", product_id=" + product_id + ", ground_id=" + ground_id + ", totalprice=" + totalprice + '}';
    }
    






}
