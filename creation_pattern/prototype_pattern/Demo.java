package prototype_pattern;

/**
 * 原型模式
 */
public class Demo {

    public static void main(String[] args) {
        WeeklyLogEntity log_1, log_2;
        //创建原型对象
        log_1 = new WeeklyLogEntity();
        //创建附件对象
        AttachmentEntity attachment = new AttachmentEntity();
        //将附件添加到周报中去
        log_1.setAttachment(attachment);
        //克隆周报
        log_2 = log_1.clone();
        System.out.println("周报是否相同" + (log_1 == log_2));
        System.out.println("附件是否相同" + (log_1.getAttachment() == log_2.getAttachment()));
    }

}
