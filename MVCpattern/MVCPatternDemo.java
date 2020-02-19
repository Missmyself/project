package MVCpattern;
public class MVCPatternDemo {
	   public static void main(String[] args) {

		  Family model=new Family();
	      model=retrieveFamilyFromDatabase("中午");
	      FamilyView view = new FamilyView();	 
	      FamilyController controller = new FamilyController(model, view);	 
	      controller.printView();
	      model=retrieveFamilyFromDatabase("饭后");
	      controller=new FamilyController(model,view);
	      controller.printView();	      
	      model=retrieveFamilyFromDatabase("下午");
	      controller=new FamilyController(model,view);
	      controller.printView();
	   }

	 private static Family retrieveFamilyFromDatabase(String requirement){
	      Family family = new Family();
	      if(requirement.equals("中午")) {
				family.setName("爸爸");
				family.setWork("做饭");
				family.setPing("好吃");
			}else if(requirement.equals("饭后")) {
				family.setName("我");
				family.setWork("洗碗");
				family.setPing("一般");
			}else if(requirement.equals("下午")) {
				family.setName("妈妈");
				family.setWork("洗衣服");
				family.setPing("干净");
			}
	      return family;
	   }
	}