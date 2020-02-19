package MVCpattern;
public class MVCPatternDemo {
	   public static void main(String[] args) {

		  Family model=new Family();
	      model=retrieveFamilyFromDatabase("����");
	      FamilyView view = new FamilyView();	 
	      FamilyController controller = new FamilyController(model, view);	 
	      controller.printView();
	      model=retrieveFamilyFromDatabase("����");
	      controller=new FamilyController(model,view);
	      controller.printView();	      
	      model=retrieveFamilyFromDatabase("����");
	      controller=new FamilyController(model,view);
	      controller.printView();
	   }

	 private static Family retrieveFamilyFromDatabase(String requirement){
	      Family family = new Family();
	      if(requirement.equals("����")) {
				family.setName("�ְ�");
				family.setWork("����");
				family.setPing("�ó�");
			}else if(requirement.equals("����")) {
				family.setName("��");
				family.setWork("ϴ��");
				family.setPing("һ��");
			}else if(requirement.equals("����")) {
				family.setName("����");
				family.setWork("ϴ�·�");
				family.setPing("�ɾ�");
			}
	      return family;
	   }
	}