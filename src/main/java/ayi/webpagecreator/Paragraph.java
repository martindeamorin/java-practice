package ayi.webpagecreator;


public class Paragraph extends ElementConstruction {
        private String paragraphHTML;
        public Paragraph(String paragraph){
            this.add(paragraph);
        }

        @Override
        public final void add(String content) {
            this.paragraphHTML = "<center><p>" + content + "</p></center>";
        }
        
        public String getParagraphHTML(){
            return this.paragraphHTML;
        }
}
