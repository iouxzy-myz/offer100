import org.springframework.web.servlet.view.InternalResourceView;

/**
 * 
 */

/**
 * @author Super-mao
 *
 */
public class HtmlResourceView extends InternalResourceView {
	 @Override  
     public boolean checkResource(Locale locale) {  
      File file = new File(this.getServletContext().getRealPath("/") + getUrl());  
      return file.exists();// 判断该页面是否存在  

}
