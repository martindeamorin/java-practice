
package main;
import java.util.Scanner;
import ayi.webpagecreator.*;
import java.io.IOException;

public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca la cantidad de paginas a crear: ");
        int pages = Integer.parseInt(scanner.nextLine());
        int count = 0;
        while(count < pages){
            setWebPageData();
            count++;
        }
        System.out.println("WebPage builder se ha ejecutado exitosamente, sus paginas ya están disponible");
    }
    
    public static NewsTemplate setTemplateData(){
        NewsTemplate template = new NewsTemplate();
        System.out.println("Ingrese un titulo a su noticia: ");
        String headerContent = scanner.nextLine();
        Header header = new Header(headerContent);
        System.out.println("Ingrese una url de imagen: ");
        String imageContent = scanner.nextLine();
        Image image = new Image(imageContent);
        System.out.println("Ingrese el contenido del parrafo: ");
        String paragraphContent = scanner.nextLine();
        Paragraph paragraph = new Paragraph(paragraphContent);        
        template.setImage(image);
        template.setParagraph(paragraph);
        template.setHeader(header);
        return template;
    }
    
    public static void setWebPageData() throws IOException{
        scanner = new Scanner(System.in);
        WebPage newPage = new WebPage();
        System.out.println("Ingrese un titulo a la pagina: ");
        String titleContent = scanner.nextLine();
        Title t1 = new Title(titleContent);
        
        System.out.println("Introduzca la cantidad de noticias a agregar: ");
        int templates = Integer.parseInt(scanner.nextLine());
        int count = 0;
        while(count < templates){
            NewsTemplate temp1 = setTemplateData();
            newPage.addNewsTemplate(temp1);
            count++;
        }
        newPage.setTitle(t1);
        newPage.createPage();
    }
    


}
