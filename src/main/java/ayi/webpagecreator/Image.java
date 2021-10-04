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
public class Image implements IElementHandle {
    private String imageHTML;
    public Image(String url){
        this.add(url);
    }

    @Override
    public void add(String content) {
        this.imageHTML = "<center><img src=\"" + content + "\" width=\"400\" height=\"500\"></center>";
    }
    
    public String getImageHTML(){
        return this.imageHTML;
    }
}
