/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayi.webpagecreator;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class WebPage {
    private Title title;
    private ArrayList<NewsTemplate> templates = new ArrayList<NewsTemplate>();
    private String body;
    private String html;
    private String head;
    
    public WebPage(){
        this.head = "<head>{title}</head>";
    }
    
   public void addNewsTemplate(NewsTemplate template){
       this.templates.add(template);
   }
    
    public void setTitle(Title title){
        this.title = title;
    }
    
    public void buildPage() throws IOException {
        this.body = this.buildBody(this.templates);
        this.head = this.head.replace("{title}", this.title.getTitleHTML());
        this.html = "<html>" + this.head + this.body + "</html>";
        FileWriter fileWriter = null;
        try{
            File newPage = new File(title.getContent() + ".html");
            fileWriter = new FileWriter(newPage);
            fileWriter.write(this.html);  
            fileWriter.close();
        }catch(IOException err){
            System.out.println("Algo ha salido mal, intentelo nuevamente");
        }
    }
    
    private String buildBody(ArrayList<NewsTemplate> templates){
        String bodyOpen = "<body bgcolor=\"#99CC99\">";
        String bodyClose = "</body>";
        String bodyContent = "";
        for (NewsTemplate template : templates) { 		      
            bodyContent += template.buildTemplate();
        }
        return bodyOpen + bodyContent + bodyClose;
    }
}
