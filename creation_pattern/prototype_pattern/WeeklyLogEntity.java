package prototype_pattern;

public class WeeklyLogEntity implements Cloneable {
    private AttachmentEntity attachment;
    private String date;
    private String name;
    private String content;

    public AttachmentEntity getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentEntity attachment) {
        this.attachment = attachment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 实现clone()方法实现浅克隆
     *
     * @return
     */
    @Override
    public WeeklyLogEntity clone() {
        //需要实现cloneable的接口，直接继承object就好，它里面自带一个clone方法！
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLogEntity) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆方法！");
            return null;
        }
    }


}
