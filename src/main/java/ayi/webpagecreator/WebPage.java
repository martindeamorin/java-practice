package ayi.webpagecreator;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WebPage implements IBuildHTMLString{
    private Title title;
    private final ArrayList<NewsTemplate> templates = new ArrayList<>();
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
    
    public void createPage() throws IOException {
        FileWriter fileWriter = null;
        try{
            File newPage = new File(title.getContent() + ".html");
            fileWriter = new FileWriter(newPage);
            fileWriter.write(this.build());  
            fileWriter.close();
        }catch(IOException err){
            throw new IOException("Algo ha salido mal, intentlo nuevamente");
        }
    }
    
    @Override
    public String build() {
        String bodyOpen = "<body bgcolor=\"#99CC99\">";
        String bodyClose = "</body>";
        String bodyContent = "";
        for (NewsTemplate template : this.templates) { 		      
            bodyContent += template.build();
        }
        this.body = bodyOpen + bodyContent + bodyClose;
        this.head = this.head.replace("{title}", this.title.getTitleHTML());
        this.html = "<html>" + this.head + this.body + "</html>";
        return this.html;
    }
}
