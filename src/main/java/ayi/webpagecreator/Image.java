package ayi.webpagecreator;

public class Image extends ElementConstructor {
    private String imageHTML;
    public Image(String url){
        this.add(url);
    }

    @Override
    public final void  add(String content) {
        this.imageHTML = "<center><img src=\"" + content + "\" width=\"400\" height=\"500\"></center>";
    }
    
    public String getImageHTML(){
        return this.imageHTML;
    }
}
