package ayi.webpagecreator;


public class NewsTemplate implements IBuildHTMLString{
    private Header header;
    private Image image;
    private Paragraph paragraph;
    
    public NewsTemplate(){}
        
    public void setImage(Image image){
        this.image = image;
    }
    
    public void setHeader(Header header){
        this.header = header;
    }
    
    public void setParagraph(Paragraph paragraph){
        this.paragraph = paragraph;
    }
    
    @Override
    public String build(){
        return this.header.getHeaderHTML() + this.image.getImageHTML() + this.paragraph.getParagraphHTML();
    }
}
