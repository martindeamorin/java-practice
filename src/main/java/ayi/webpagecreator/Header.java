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
public class Header implements IElementHandle {
        private String headerHTML;
        public Header(String header){
            this.add(header);
        }

        @Override
        public void add(String content) {
            this.headerHTML = "<center><h1><font color=\"navy\">" + content + "</font></h1></center>";
        }
        

        public String getHeaderHTML(){
            return this.headerHTML;
        }
}
    