
package chapter8;

import java.awt.Event;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore.Entry.Attribute;
import java.util.Iterator;

import javax.sound.sampled.AudioFormat.Encoding;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NamedNodeMap;

public class Main8_4_3 {
	<?xml vervion="1.0" encodingng="UTF-8">
	<staffs>
		<staff id="1024">
			<name>
				<firstname>Takuya</firstname>
				<lastname>Okada</lastname>
			</name>
			<gender>male</gender>
			<job>Enginner</job>
		</staff>
	</staffs>



	//index.html 省略



	public void parse(String xmlFaile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) []DocumentBuilder builder = DocumentBuilderFactory
				.newInstance().newDocumentBuilder();

				Node root = builder.parse(is);
				readRecursive(root);

	} catch (ParserConfigurationException | IOException | SAXException ex) {
		//例外処理
	}


}


private void readerRecursive(Node node) {
	Node child = node.getFirstChild();
	while (child != null) {
		printnode(child);
		NamedNodeMap attributes = child.getAttributes();
		if (attributes != null) {
			for (int index = 0; index < attributes.getLength(); index++) {
				Node attribute = attributes.item(index);
				System.out.println("Attribute: ");
				PrinNode(attribute);

			}
		}
		readerRecursive(child);
		child = child.getNextSibling();

	}
}


private void printNode(Node node) {
	System.out.println(node.getNodeName() + "=" + node.getNodeValue());
}

public void parse(String xmlFile) {
	try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader = factory.createXMLStreamReader(is);

		while (reader.hasNext()) {
			reader.next();

			int eventType = reader.getEventType();

			if (eventType == XMLStreamConstants.START_ELEMENT) {
				System.out.println("Name: " + reader.getName());

				int count = reader .getAttributeCount();
				if (count != 0) {
					System.out.print("Attribute:");
					for (int index = 0; index < count; index++) {
						System.out.println("Name: "
								+ reader.getAttributeName(index));
						System.out.println("value: "
								+ reader.getAttributeValue(index));
					}
				}
			} else if (eventType == XMLStreamConstants.CHARACTERS) {
				String text = reader.getText().trim();
				System.out.println();

			}
		}
	} catch (IOException | XMLStreamException ex) {
		//例外処理は省略
	}
}




public void parse(String xmlFile) {

	try (InputStream is = Files.newInputStream(Paths.get(xmlFile)) {

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader reader = factory.createXMLEventReader(is);

		//処理対象のｲﾍﾞﾝﾄを絞り込むフィルタをせっていする
		EventFilter filter = new EventFilter() {
			public blloan accept(XMLEvent event) {
				return event.isStartElement() || event.isCharacters();

			}
		};

		reader = factory.createFilteredReader(reader, filter);

		while (reader.hasNext()) {
			XMLEvent event = reader.nextEvent();

			if (event.is StartElement = event.asStartElement();
			System.out.println("name: " + StartElement());


			Iterator<Attribute> attributes = StartElement.getAttribute();

			if (attributes.hasNext()) {
				System.out.println("Atrribute");

				while (attributes.hasNext()) {
					Attribute attribute = attributes.next();
					System.out.println("Name: " + attribute.getName());
					System.out.println("Value: " + attribute.getValue());

				}
			}
		} else if (Event.isCharacters()) {

			Characters characters = Event.asCharacters();
			String text = characters.getDate().trim();
			if (!text.isEmpty()) {
				System.out.println("Text: " + text);
				System.out.println();

			}

		}

	} catch (IOException \ XMLStreamException ex) {
		//例外処理
	}
}


public void parse(String xmlFile) {
	try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
		DocumentBuilder builder = DocumentBuilderFactory
				.newInstance().newDocumentBuilder();

		XPathFactory factory = XPathFactory.newInstance();
		XPath xPath = factory.newXPath();

		//StaffタグのID属性を取得する
		System.out.println("id=" + xpath.evaluate("..."));

		System.out.println("firstname=" + xPath.evaluate("...", "..."));


	}
}


//以下省略

























