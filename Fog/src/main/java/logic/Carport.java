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
        private int carportWidth;
        private int carportLength;
        private int carportHeight;
        private int stolpe_længde;
        private int spær_Længde;
        private int reglar_længde;
        private int lægte_længde;
        private int sternBræt_Længde;
        private int Vindskede_længde; 
        private int skruer_Antal;
        private int total_skruer_Antal;
        private int taghældning;
        private int rem_længde;
        private int tag_bredde;
        private int tag_højde;
        private int tag_udhæng;
        private int gavl_bræt_længde;
        private int gavl_bræt_højde; 
        private int gavl_bræt_bredde;
        private double carportPris;
        private double totalPris;

    public Carport(int carport_id, String carportName, int carportWidth, int carportLength, int carportHeight, int stolpe_længde, int spær_Længde, int reglar_længde, int lægte_længde, int sternBræt_Længde, int Vindskede_længde, int skruer_Antal, int taghældning, int rem_længde, int tag_bredde, int tag_højde, int tag_udhæng, int gavl_bræt_længde, int gavl_bræt_højde, int gavl_bræt_bredde, double carportPris, double totalPris) {
        this.carport_id = carport_id;
        this.carportName = carportName;
        this.carportWidth = carportWidth;
        this.carportLength = carportLength;
        this.carportHeight = carportHeight;
        this.stolpe_længde = stolpe_længde;
        this.spær_Længde = spær_Længde;
        this.reglar_længde = reglar_længde;
        this.lægte_længde = lægte_længde;
        this.sternBræt_Længde = sternBræt_Længde;
        this.Vindskede_længde = Vindskede_længde;
        this.skruer_Antal = skruer_Antal;
        this.taghældning = taghældning;
        this.rem_længde = rem_længde;
        this.tag_bredde = tag_bredde;
        this.tag_højde = tag_højde;
        this.tag_udhæng = tag_udhæng;
        this.gavl_bræt_længde = gavl_bræt_længde;
        this.gavl_bræt_højde = gavl_bræt_højde;
        this.gavl_bræt_bredde = gavl_bræt_bredde;
        this.carportPris = carportPris;
        this.totalPris = totalPris;
    }

    Carport(String carportName, int carportWidth, int carportLength, int carportHeight, int stolpe_højde, int spær_Længde, int carport_id, int reglar_længde, int lægte_længde, int sternbræt_Længde, int vindskede_længde, int skruer_Antal, int taghældning, double totalPris, int rem_længde, double carportPris, int tag_bredde, int tag_højde, int tag_udhæng, int gavl_bræt_længde, int gavl_bræt_højde, int gavl_bræt_bredde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getStolpe_længde() {
        return stolpe_længde;
    }

    public void setStolpe_længde(int stolpe_længde) {
        this.stolpe_længde = stolpe_længde;
    }

    public int getSpær_Længde() {
        return spær_Længde;
    }

    public void setSpær_Længde(int spær_Længde) {
        this.spær_Længde = spær_Længde;
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

    public int getSternBræt_Længde() {
        return sternBræt_Længde;
    }

    public void setSternBræt_Længde(int sternBræt_Længde) {
        this.sternBræt_Længde = sternBræt_Længde;
    }

    public int getVindskede_længde() {
        return Vindskede_længde;
    }

    public void setVindskede_længde(int Vindskede_længde) {
        this.Vindskede_længde = Vindskede_længde;
    }

    public int getSkruer_Antal() {
        return skruer_Antal;
    }

    public void setSkruer_Antal(int skruer_Antal) {
        this.skruer_Antal = skruer_Antal;
    }

    public int getTaghældning() {
        return taghældning;
    }

    public void setTaghældning(int taghældning) {
        this.taghældning = taghældning;
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

    public double getCarportPris() {
        return carportPris;
    }

    public void setCarportPris(double carportPris) {
        this.carportPris = carportPris;
    }

    public double getotalPris() {
        return totalPris;
    }

    public void setTotalPris(double totalPris) {
        this.totalPris = totalPris;
    }

   
    }

   
        


