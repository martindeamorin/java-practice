package ayi.webpagecreator;

public class Title extends ElementConstruction {
        private String titleHTML;
        private String content;
        public Title(String title){
            this.add(title);
        }

        @Override
        public final void add(String content) {
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
