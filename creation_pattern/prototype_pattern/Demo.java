package prototype_pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeeklyLogEntity log_1,log_2;                                                                             
		log_1 = new WeeklyLogEntity();	//创建原型对象                                                               
		AttachmentEntity attachment = new AttachmentEntity(); //创建附件对象                                                 
		log_1.setAttachment(attachment);	//将附件添加到周报种去                                                   
		log_2=log_1.clone();	//克隆周报                                                                     
		System.out.println("周报是否相同"+(log_1==log_2));                                                       
		System.out.println("附件是否相同"+(log_1.getAttachment()==log_2.getAttachment()));
	}

}
