/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.CarportMapper;



/**
 *
 * @author Rikke Nielsen
 */
public class Calculator {

    public void calculator(Carport c) {

        String carportName = c.getCarportName();
        int carportWidth = c.getCarportWidth();
        int carportLength = c.getCarportLength();
        int carportHeight = c.getCarportHeight();
        int stolpe_højde = c.getStolpe_højde();
        int spær_Længde = c.getSpær_Længde();
        int carport_id = c.getCarport_id();
        int reglar_længde = c.getReglar_længde();
        int lægte_længde = c.getLægte_længde();
        int sternbrædt_Længde = c.getSternBrædt_Længde();
        int vindskede_længde = c.getVindskede_længde();
        int rem = c.getRem();
        int skruer = c.getSkruer();
        int taghældning = c.getTaghældning();
        double totalprice = c.getTotalprice();
        int rem_længde = c.getRem_længde();
        int tag_bredde = c.getTag_bredde();
        int tag_højde = c.getTag_højde();
        int tag_udhæng = c.getTag_udhæng();
        int gavl_bræt_længde = c.getGavl_bræt_længde();
        int gavl_bræt_højde = c.getGavl_bræt_højde();
        int gavl_bræt_bredde = c.getGavl_bræt_bredde();
        
        int stolpe_Antal = (((((carportLength/300 )- '%'+2 )* 2) + (carportWidth/300) - '%')*2);
        int lægte_Antal = (rem_længde/89 - '%');
        int rem_Antal = ((carportLength * 2)/ rem_længde );
        int spær_Antal = (rem_længde/90-'%' +1 );
        int reglar_antal =(tag_bredde/50 -'%'+1);
        int gavl_brædde_Antal =(tag_højde/2 * (tag_udhæng+carportWidth) /(gavl_bræt_længde*gavl_bræt_højde*gavl_bræt_bredde)-'%');
        int vindskede_Antal = (int) ((Math.sqrt(Math.pow(((tag_udhæng + carportWidth)/2),2) +Math.pow(tag_højde,2)))/vindskede_længde);
        int sternbræt_Antal = ((carportLength + tag_udhæng)+(carportWidth + tag_udhæng)/sternbrædt_Længde);
        int total_træ_Antal = (stolpe_Antal + lægte_Antal + rem_Antal+spær_Antal+ vindskede_Antal + sternbræt_Antal + gavl_brædde_Antal + reglar_antal);
        int skruer_Antal = total_træ_Antal * 6;
        
        
       Carport cp = new Carport(carportName, carportWidth,carportLength,carportHeight,stolpe_højde, spær_Længde, carport_id,reglar_længde,lægte_længde,sternbrædt_Længde,vindskede_længde,rem,skruer,taghældning, totalprice, rem_længde,tag_bredde, tag_højde,tag_udhæng, gavl_bræt_længde, gavl_bræt_højde, gavl_bræt_bredde);
         CarportMapper.storeCarport(cp);
    }
    }
