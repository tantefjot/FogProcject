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
 
        private String carportName;
        private int carportWidth;
        private int carportLength;
        private int carportHeight;
        private int stolpe_højde;
        private int spær_Længde;
        private int carport_id;
        private int reglar_længde;
        private int lægte_længde;
        private int sternBrædt_Længde;
        private int Vindskede_længde; 
        private int Rem;
        private int skruer;
        private int taghældning;
        private double totalprice;
        private int rem_længde;
        private int tag_bredde;
        private int tag_højde;
        private int tag_udhæng;
        private int gavl_bræt_længde;
        private int gavl_bræt_højde; 
        private int gavl_bræt_bredde;
        private int product_id;

    public Carport(String carportName, int carportWidth, int carportLength, int carportHeight, int stolpe_højde, int spær_Længde, int carport_id, int reglar_længde, int lægte_længde, int sternBrædt_Længde, int Vindskede_længde, int Rem, int skruer, int taghældning, double totalprice, int rem_længde, int tag_bredde, int tag_højde, int tag_udhæng, int gavl_bræt_længde, int gavl_bræt_højde, int gavl_bræt_bredde, int product_id ) {
        this.carportName = carportName;
        this.carportWidth = carportWidth;
        this.carportLength = carportLength;
        this.carportHeight = carportHeight;
        this.stolpe_højde = stolpe_højde;
        this.spær_Længde = spær_Længde;
        this.carport_id = carport_id;
        this.reglar_længde = reglar_længde;
        this.lægte_længde = lægte_længde;
        this.sternBrædt_Længde = sternBrædt_Længde;
        this.Vindskede_længde = Vindskede_længde;
        this.Rem = Rem;
        this.skruer = skruer;
        this.taghældning = taghældning;
        this.totalprice = totalprice;
        this.rem_længde = rem_længde;
        this.tag_bredde = tag_bredde;
        this.tag_højde = tag_højde;
        this.tag_udhæng = tag_udhæng;
        this.gavl_bræt_længde = gavl_bræt_længde;
        this.gavl_bræt_højde = gavl_bræt_højde;
        this.gavl_bræt_bredde = gavl_bræt_bredde;
        this.product_id = product_id;
    }

    public Carport(String carportName, int carportWidth, int carportLength, int carportHeight, int stolpe_højde, int spær_Længde, int reglar_længde, int lægte_længde, int sternBrædt_Længde, int Vindskede_længde, int Rem, int skruer, int taghældning, double totalprice, int rem_længde, int tag_bredde, int tag_højde, int tag_udhæng, int gavl_bræt_længde, int gavl_bræt_højde, int gavl_bræt_bredde, int product_id ) {
        this.carportName = carportName;
        this.carportWidth = carportWidth;
        this.carportLength = carportLength;
        this.carportHeight = carportHeight;
        this.stolpe_højde = stolpe_højde;
        this.spær_Længde = spær_Længde;
        this.reglar_længde = reglar_længde;
        this.lægte_længde = lægte_længde;
        this.sternBrædt_Længde = sternBrædt_Længde;
        this.Vindskede_længde = Vindskede_længde;
        this.Rem = Rem;
        this.skruer = skruer;
        this.taghældning = taghældning;
        this.totalprice = totalprice;
        this.rem_længde = rem_længde;
        this.tag_bredde = tag_bredde;
        this.tag_højde = tag_højde;
        this.tag_udhæng = tag_udhæng;
        this.gavl_bræt_længde = gavl_bræt_længde;
        this.gavl_bræt_højde = gavl_bræt_højde;
        this.gavl_bræt_bredde = gavl_bræt_bredde;
        this.product_id = product_id;
    }
    
    
    
    

    public String getCarportName() {
        return carportName;
    }

    public void setCarportName(String carportName) {
        this.carportName = carportName;
    }

    public int getCarportWidth() {
        return carportWidth;
    }

    public void setCarportWidth(int carportWidth) {
        this.carportWidth = carportWidth;
    }

    public int getCarportLength() {
        return carportLength;
    }

    public void setCarportLength(int carportLength) {
        this.carportLength = carportLength;
    }

    public int getCarportHeight() {
        return carportHeight;
    }

    public void setCarportHeight(int carportHeight) {
        this.carportHeight = carportHeight;
    }

    public int getStolpe_højde() {
        return stolpe_højde;
    }

    public void setStolpe_højde(int stolpe_højde) {
        this.stolpe_højde = stolpe_højde;
    }

    public int getSpær_Længde() {
        return spær_Længde;
    }

    public void setSpær_Længde(int spær_Længde) {
        this.spær_Længde = spær_Længde;
    }

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
    }

    public int getReglar_længde() {
        return reglar_længde;
    }

    public void setReglar_længde(int reglar_længde) {
        this.reglar_længde = reglar_længde;
    }

    public int getLægte_længde() {
        return lægte_længde;
    }

    public void setLægte_længde(int lægte_længde) {
        this.lægte_længde = lægte_længde;
    }

    public int getSternBrædt_Længde() {
        return sternBrædt_Længde;
    }

    public void setSternBrædt_Længde(int sternBrædt_Længde) {
        this.sternBrædt_Længde = sternBrædt_Længde;
    }

    public int getVindskede_længde() {
        return Vindskede_længde;
    }

    public void setVindskede_længde(int Vindskede_længde) {
        this.Vindskede_længde = Vindskede_længde;
    }

    public int getRem() {
        return Rem;
    }

    public void setRem(int Rem) {
        this.Rem = Rem;
    }

    public int getSkruer() {
        return skruer;
    }

    public void setSkruer(int skruer) {
        this.skruer = skruer;
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

    public int getRem_længde() {
        return rem_længde;
    }

    public void setRem_længde(int rem_længde) {
        this.rem_længde = rem_længde;
    }

    public int getTag_bredde() {
        return tag_bredde;
    }

    public void setTag_bredde(int tag_bredde) {
        this.tag_bredde = tag_bredde;
    }

    public int getTag_højde() {
        return tag_højde;
    }

    public void setTag_højde(int tag_højde) {
        this.tag_højde = tag_højde;
    }

    public int getTag_udhæng() {
        return tag_udhæng;
    }

    public void setTag_udhæng(int tag_udhæng) {
        this.tag_udhæng = tag_udhæng;
    }

    public int getGavl_bræt_længde() {
        return gavl_bræt_længde;
    }

    public void setGavl_bræt_længde(int gavl_bræt_længde) {
        this.gavl_bræt_længde = gavl_bræt_længde;
    }

    public int getGavl_bræt_højde() {
        return gavl_bræt_højde;
    }

    public void setGavl_bræt_højde(int gavl_bræt_højde) {
        this.gavl_bræt_højde = gavl_bræt_højde;
    }

    public int getGavl_bræt_bredde() {
        return gavl_bræt_bredde;
    }

    public void setGavl_bræt_bredde(int gavl_bræt_bredde) {
        this.gavl_bræt_bredde = gavl_bræt_bredde;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Carport{" + "carportName=" + carportName + ", carportWidth=" + carportWidth + ", carportLength=" + carportLength + ", carportHeight=" + carportHeight + ", stolpe_h\u00f8jde=" + stolpe_højde + ", sp\u00e6r_L\u00e6ngde=" + spær_Længde + ", carport_id=" + carport_id + ", reglar_l\u00e6ngde=" + reglar_længde + ", l\u00e6gte_l\u00e6ngde=" + lægte_længde + ", sternBr\u00e6dt_L\u00e6ngde=" + sternBrædt_Længde + ", Vindskede_l\u00e6ngde=" + Vindskede_længde + ", Rem=" + Rem + ", skruer=" + skruer + ", tagh\u00e6ldning=" + taghældning + ", totalprice=" + totalprice + ", rem_l\u00e6ngde=" + rem_længde + ", tag_bredde=" + tag_bredde + ", tag_h\u00f8jde=" + tag_højde + ", tag_udh\u00e6ng=" + tag_udhæng + ", gavl_br\u00e6t_l\u00e6ngde=" + gavl_bræt_længde + ", gavl_br\u00e6t_h\u00f8jde=" + gavl_bræt_højde + ", gavl_br\u00e6t_bredde=" + gavl_bræt_bredde + ", product_id=" + product_id + '}';
    }
    
    
    

  







}
