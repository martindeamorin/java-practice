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
public class Title implements IElementHandle{
        private String titleHTML;
        private String content;
        public Title(String title){
            this.add(title);
        }

        @Override
        public void add(String content) {
            this.content = content;
            this.titleHTML = "<title>" + content + "</title>";
        }
        
        public String getContent(){
            return this.content;
        }
        
        public String getTitleHTML(){
            return this.titleHTML;
        }
}
