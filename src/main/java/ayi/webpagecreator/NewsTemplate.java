/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayi.webpagecreator;

/**
 *
 * @author Martincito
 */
public class NewsTemplate {
    private Header header;
    private Image image;
    private Paragraph paragraph;
    
    public NewsTemplate(){}
        
    public void addImage(Image image){
        this.image = image;
    }
    
    public void setHeader(Header header){
        this.header = header;
    }
    
    public void addParagraphs(Paragraph paragraph){
        this.paragraph = paragraph;
    }
    
    public String buildTemplate(){
        return this.header.getHeaderHTML() + this.image.getImageHTML() + this.paragraph.getParagraphHTML();
    }
}
