/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.CarportMapper;
import java.sql.SQLException;

/**
 *
 * @author Rikke Nielsen
 */
public class Calculator {

    public void calculator(Carport c, Product p) throws SQLException {
        
       // 
        String carportName = c.getCarportName();
        int carportWidth = c.getCarportWidth();
        int carportLength = c.getCarportLength();
        int carportHeight = c.getCarportHeight();
//        int stolpe = c.getStolpe();
        int spær_Længde = c.getSpær_Længde();
        int carport_id = c.getCarport_id();
        int reglar_længde = c.getReglar_længde();
        int lægte_længde = c.getLægte_længde();
        int sternbræt_Længde = c.getSternBræt_Længde();
        int vindskede_længde = c.getVindskede_længde();
        int skruer_Antal = c.getSkruer_Antal();
        int taghældning = c.getTaghældning();
        int rem_længde = c.getRem_længde();
        int tag_bredde = c.getTag_bredde();
        int tag_højde = c.getTag_højde();
        int tag_udhæng = c.getTag_udhæng();
        int gavl_bræt_længde = c.getGavl_bræt_længde();
        int gavl_bræt_højde = c.getGavl_bræt_højde();
        int gavl_bræt_bredde = c.getGavl_bræt_bredde();
        
        
        double stolpePris = p.getProductPrice();
        double lægtePris = p.getProductPrice();
        double remPris = p.getProductPrice();
        double spærPris = p.getProductPrice();
        double reglarPris = p.getProductPrice();
        double gavlPris = p.getProductPrice();
        double vindskedePris = p.getProductPrice();
        double sternbrætPris = p.getProductPrice();
        
            // beregner materialemængde
        int stolpe_længde = carportHeight - tag_højde +90;    
        int stolpe_Antal =((((carportLength / 300) + 2) * 2) + (carportWidth / 300) * 2);
        int lægte_Antal = rem_længde / 89  +1;
        int rem_Antal = ((carportLength * 2) / rem_længde);
        int spær_Antal = rem_længde / 90  + 1;
        int reglar_Antal = tag_bredde / 50  + 1;
        int gavl_brædde_Antal = (tag_højde / 2 * (tag_udhæng + carportWidth) / (gavl_bræt_længde * gavl_bræt_højde * gavl_bræt_bredde) );
        int vindskede_Antal = (int) ((Math.sqrt(Math.pow(((tag_udhæng + carportWidth) / 2), 2) + Math.pow(tag_højde, 2))) / vindskede_længde);
        int sternbræt_Antal = ((carportLength + tag_udhæng) + (carportWidth + tag_udhæng) / sternbræt_Længde);
        int total_træ_Antal = (stolpe_Antal + lægte_Antal + rem_Antal + spær_Antal + vindskede_Antal + sternbræt_Antal + gavl_brædde_Antal + reglar_Antal);
        int total_skruer_Antal = total_træ_Antal * 6;
        
        
               //beregner priser ud fra materialemængde
        double stolpe_sum_Pris = stolpe_Antal * stolpePris;
        double lægte_sum_Pris = lægte_Antal * lægtePris;
        double rem_sum_Pris = rem_Antal * remPris;
        double spær_sum_Pris = spær_Antal *spærPris;
        double reglar_sum_Pris = reglar_Antal * reglarPris;
        double galv_brædde_sum_Pris = gavl_brædde_Antal * gavlPris;
        double vindskede_sum_Pris = vindskede_Antal * vindskedePris;
        double sternbræt_sum_Pris = sternbræt_Antal * sternbrætPris;
        double carportPris = stolpe_sum_Pris = lægte_sum_Pris + rem_sum_Pris + spær_sum_Pris + reglar_sum_Pris + galv_brædde_sum_Pris + vindskede_sum_Pris +  sternbræt_sum_Pris; 
        double totalPris = carportPris *1.25;
                
        
          Carport cp = new Carport(carportName, carportWidth, carportLength, carportHeight, stolpe_længde, spær_Længde, carport_id, reglar_længde, lægte_længde, sternbræt_Længde, vindskede_længde, total_skruer_Antal, taghældning, totalPris, rem_længde, carportPris,tag_bredde, tag_højde, tag_udhæng, gavl_bræt_længde, gavl_bræt_højde, gavl_bræt_bredde);
        CarportMapper.storeCarport(cp);
    }
      
}
