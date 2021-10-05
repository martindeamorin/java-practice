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
public class Header extends ElementConstructor {
        private String headerHTML;
        public Header(String header){
            this.add(header);
        }

        @Override
        public final void add(String content) {
            this.headerHTML = "<center><h1><font color=\"navy\">" + content + "</font></h1></center>";
        }
        

        public String getHeaderHTML(){
            return this.headerHTML;
        }
}
    