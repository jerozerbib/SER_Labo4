/*
 -----------------------------------------------------------------------------------
 Laboratoire : SER - Laboratoire 4 - xsl - xpath
 Fichier     : PaysParserHandler.java
 Auteur(s)   : Jeremy Zerbib, Baptiste Hardrick, Mickael Bonjour
 Date        : 16/05/2019
 But         : Parsing de l'element <element>, qui fait office de pays, du fichier XML fourni
 Remarque(s) : Un exemple complet de balise est fourni ci-dessous

<element>
      <alpha2Code>AF</alpha2Code>
      <alpha3Code>AFG</alpha3Code>
      <altSpellings>
         <element>AF</element>
         <element>Afġānistān</element>
      </altSpellings>
      <area>652230.0</area>
      <borders>
         <element>IRN</element>
         <element>PAK</element>
         <element>TKM</element>
         <element>UZB</element>
         <element>TJK</element>
         <element>CHN</element>
      </borders>
      <callingCodes>
         <element>93</element>
      </callingCodes>
      <capital>Kabul</capital>
      <cioc>AFG</cioc>
      <currencies>
         <element>
            <code>AFN</code>
            <name>Afghan afghani</name>
            <symbol>؋</symbol>
         </element>
      </currencies>
      <demonym>Afghan</demonym>
      <drapeau>https://restcountries.eu/data/afg.svg</drapeau>
      <gini>27.8</gini>
      <languages>
         <element>
            <iso639_1>ps</iso639_1>
            <iso639_2>pus</iso639_2>
            <name>Pashto</name>
            <nativeName>پښتو</nativeName>
         </element>
         <element>
            <iso639_1>uz</iso639_1>
            <iso639_2>uzb</iso639_2>
            <name>Uzbek</name>
            <nativeName>Oʻzbek</nativeName>
         </element>
         <element>
            <iso639_1>tk</iso639_1>
            <iso639_2>tuk</iso639_2>
            <name>Turkmen</name>
            <nativeName>Türkmen</nativeName>
         </element>
      </languages>
      <latlng>
         <element>33.0</element>
         <element>65.0</element>
      </latlng>
      <name>Afghanistan</name>
      <nativeName>افغانستان</nativeName>
      <numericCode>004</numericCode>
      <population>27657145</population>
      <region>Asia</region>
      <regionalBlocs>
         <element>
            <acronym>SAARC</acronym>
            <name>South Asian Association for Regional Cooperation</name>
            <otherAcronyms />
            <otherNames />
         </element>
      </regionalBlocs>
      <subregion>Southern Asia</subregion>
      <timezones>
         <element>UTC+04:30</element>
      </timezones>
      <topLevelDomain>
         <element>.af</element>
      </topLevelDomain>
      <translations>
         <br>Afeganistão</br>
         <de>Afghanistan</de>
         <es>Afganistán</es>
         <fa>افغانستان</fa>
         <fr>Afghanistan</fr>
         <hr>Afganistan</hr>
         <it>Afghanistan</it>
         <ja>アフガニスタン</ja>
         <nl>Afghanistan</nl>
         <pt>Afeganistão</pt>
      </translations>
   </element>
 -----------------------------------------------------------------------------------
*/
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.Stack;

public class PaysParserHandler {
    // Liste des pays
    private ArrayList<Pays> listPays = new ArrayList<>();

    // Lors de la lecture, des elements seront empiles
    private Stack elementStack = new Stack();
    // Lorsqu'un bloc est termine, il est empile
    private Stack objectStack = new Stack();

    public void startElement(String qName) {
        this.elementStack.push(qName);

        if ("element".equals(qName)){
            Pays pays = new Pays();

            this.objectStack.push(pays);
        }
    }

    public void endElement(String uri, String localName, String qName) {
        this.elementStack.pop();

        if ("element".equals(qName)){
            Pays pays = (Pays) this.objectStack.pop();
            this.listPays.add(pays);
        }
    }

    public void character(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();

        if (value.length()==0){
            return;
        }

        switch (currentElement()){
            case "capital" :
                Pays pays = (Pays) this.objectStack.peek();
                pays.setCapitale(value);
                break;
            case "flag" :
                Pays pays = (Pays) this.objectStack.peek():
                pays.setDrapeau(value);
        }
    }

    private String currentElement() {
        return this.elementStack.peek().toString();
    }


}
