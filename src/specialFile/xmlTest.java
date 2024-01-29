package specialFile;

import java.text.AttributedCharacterIterator.Attribute;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xmlTest {
    public static void main(String[] args) throws Exception {
        // reader for Dom4j
        SAXReader saxReader = new SAXReader();

        // create document object
        Document document = saxReader.read("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\specialFile\\xmlTest.xml");

        // get root -> users
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // elements
        List<Element> elements = root.elements();
        for(Element element : elements) {
            System.out.println(element.getName());
        } 

        // element
        Element name = root.element("user").element("name");
        System.out.println(name.getText());
        
        // attributes
        Element user = root.element("user");
        System.out.println(user.attributeValue("id"));
        System.out.println(user.elementText("password"));
        org.dom4j.Attribute id = user.attribute("id");
        System.out.println(id.getName());
        System.out.println(id.getValue());

        List<org.dom4j.Attribute> attributes = user.attributes();
        for(org.dom4j.Attribute attribute : attributes) {
            System.out.println(attribute.getName() + "=" + attribute.getValue());
        }

        // get all elements under current
        System.out.println(user.elementText("name"));
        // remove spacebar
        System.out.println(user.elementTextTrim("addr"));
    }
}
