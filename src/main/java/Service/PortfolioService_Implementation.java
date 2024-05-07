/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Classes.PersonalDetails;
import DAOs.*;

/**
 *
 * @author USER-PC
 */
public class PortfolioService_Implementation implements PortfolioService_Interface {

    PortfolioDAO_Interface dao = new PortfolioDAO_Implementation();
    
    @Override
    public PersonalDetails getPerson() {
        return dao.getPerson();
    }


    
    
    
    
}
