/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rest;
import Classes.PersonalDetails;
import Service.PortfolioService_Implementation;
import Service.PortfolioService_Interface;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Path("/People")
public class RestControllerPortfolio {
    
    PortfolioService_Interface service =new PortfolioService_Implementation();
    
    @GET
    @Path("/getPerson")
    public Response getPerson(){
        PersonalDetails person= service.getPerson();
        return Response.ok().entity(person).build();
    }
    
    @GET
    @Path("/getPerson")
    public Response testREST(){
        return Response.ok().build();
    }
}
