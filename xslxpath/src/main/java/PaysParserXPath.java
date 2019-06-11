import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class PaysParserXPath {
    public static void main(String[] args) throws Exception {

        // Construction du DOM
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("countries.xml");


        // Création des XPath
        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();

        // Recuperation du drapeau
        XPathExpression expr = xpath.compile("//element/flag/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;

        // Récupération du nom du pays en francais
        expr = xpath.compile("//element/translations/fr/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération de la capitale d'un pays
        expr = xpath.compile("//element/capital/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération de la population d'un pays
        expr = xpath.compile("//element/population/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération de la superficie d'un pays
        expr = xpath.compile("//element/area/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération du continent sur lequel le pays se trouve
        expr = xpath.compile("//element/region/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération du sous-cnotinent sur lequel le pays se trouve
        expr = xpath.compile("//element/subregion/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;

        // Récupération des langues parlees dans un pays
        expr = xpath.compile("//element/languages/element/name/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;
    }
}