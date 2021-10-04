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
public class Paragraph implements IElementHandle{
        private String paragraphHTML;
        public Paragraph(String paragraph){
            this.add(paragraph);
        }

        @Override
        public void add(String content) {
            this.paragraphHTML = "<center><p>" + content + "</p></center>";
        }
        
        public String getParagraphHTML(){
            return this.paragraphHTML;
        }
}
