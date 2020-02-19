package MVCpattern;
public class FamilyController {
   private Family model;
   private FamilyView view;
 
   public FamilyController(Family model, FamilyView view){
      this.model = model;
      this.view = view;
   }
 
   public void setFamilyName(String name){
      model.setName(name);    
   }
 
   public String getFamilyName(){
      return model.getName();    
   }
   
   public void setFamilyWork(String work){
	   model.setWork(work);    
	}
   
   public String getFamilyWork(){
	   return model.getWork();     
	}
   
   public void setFamilyPing(String ping){
      model.setPing(ping);      
   }
 
   public String getFamilyPing(){
	   return model.getPing();    
   }
 
   public void printView(){           
      view.printFamilyDetails(model.getName(), model.getWork(),model.getPing());
   }


}